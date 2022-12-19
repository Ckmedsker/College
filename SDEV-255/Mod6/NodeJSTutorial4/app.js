const express = require('express');
const morgan = require('morgan')
const mongoose = require('mongoose');
const Blog = require('./models/blog');


// express app
const app = express();

// connect to mongoDB
const dbURI = 'mongodb+srv://cam:cam@nodetutorial.ekopjzx.mongodb.net/blogs?retryWrites=true&w=majority';
mongoose.connect(dbURI, { useNewUrlParser: true, useUnifiedTopology: true })
    .then((result) => app.listen(3000))
    .catch((err) => console.log(err))
module.exports = mongoose;

// register view engine
app.set('view engine', 'ejs')

// middleware and static files
app.use(express.static('public'));
app.use(express.urlencoded({ extended: true }))
app.use(morgan('dev'));

// mongoose and mongo sandbox routes
app.get('/add-blog', (req, res) => {
    const blog = new Blog({
        title: 'new blog',
        snippet: 'about my new blog',
        body: 'more about my new blog'
    });

    blog.save()
        .then((result) => {
            res.send(result)
        })
        .catch((err) => {
            console.log(err);
        });
});


app.get('/all-blogs', (req, res) => {
    Blog.find()
    .then((result) => {
        res.send(result)
    })
    .catch((err) => {
        console.log(err);
    });
});

app.get('/single-blog', (req, res) => {
    Blog.findById('638ea817f16d99ebe495cbfb')
        .then((result) => {
            res.send(result)
        })
        .catch((err) => {
            console.log(err);
        });
})


// routes
app.get('/', (req, res) => {
    res.redirect('/blogs');
})

app.get('/about', (req, res) => {
    // res.send('<p>About Page</p>');
    res.render('about', { title: 'About' });
});

// blog routes
app.get('/blogs', (req, res) => {
    console.log('blog2');
    Blog.find().sort({ createdAt: -1 })
        .then((result) => {
            res.render('index', { title: 'All Blogs', blogs: result})
        })
        .catch((err) => {
            console.log(err);
        });
})

app.post('/blogs', (req, res) => {
    const blog = new Blog(req.body);
    blog.save()
        .then((result) => {
            res.redirect('blogs');
        })
        .catch((err) => {
            console.log(err);
        })
});

app.get('/blogs/create', (req, res) => {
    res.render('create', { title: 'Create a new Blog' });
});

// below does not work!
app.get('/blogs/:id', (req, res) => {
    const id = req.params.id;
    Blog.findById(id)
        .then(result => {
            res.render('details', { blog: result, title: 'Blog Details' });
        })
        .catch(err => {
            console.log(err);
        });
})
// end

app.delete('/blogs/:id', (req, res) => {
    const id = req.params.id;

    Blog.findByIdAndDelete(id)
        .then(result => {
            res.json({ redirect: '/blogs' })
        })
        .catch(err => { console.log(err) });
})


// 404 page 
app.use((req, res) => {
    res.status(404).render('404', { title: '404' });
})
