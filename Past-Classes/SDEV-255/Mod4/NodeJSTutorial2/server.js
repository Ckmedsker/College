const http = require('http');
const fs = require('fs');
const { runInNewContext } = require('vm');

const server = http.createServer((req, res) => {
    // console.log(req.url, req.method);

    // set header content type
    res.setHeader('Content-Type', 'text/html');

    // getting unique paths to route to different html pages
    let path = './views/';
    switch(req.url) {
        case '/':
            path += 'index.html';
            res.statusCode = 200;
            break;
        case '/about':
            path += 'about.html';
            res.statusCode = 200;
            break;
        // redirect
        case '/about-me':
            res.statusCode = 301;
            res.setHeader('Location', '/about');
            res.end();
            break;
        default:
            path += '404.html';
            res.statusCode = 404;
            break;
    }

    // send an html file
    fs.readFile(path, (err, data) => {
        if (err) {
            console.log(err);
            res.end();
        } else {
            // res.write(data); NOT needed for one item
            res.end(data);
        }
    });
});

server.listen(3000, 'localhost', () => {
    console.log('listening for requests on port 3000');
});