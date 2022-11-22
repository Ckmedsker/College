window.addEventListener("DOMContentLoaded", function () {
   document.querySelector("#fetchQuotesBtn").addEventListener("click", function () {

      // Get values from drop-downs
      const topicDropdown = document.querySelector("#topicSelection");
      const selectedTopic = topicDropdown.options[topicDropdown.selectedIndex].value;
      const countDropdown = document.querySelector("#countSelection");
      const selectedCount = countDropdown.options[countDropdown.selectedIndex].value;

      // Get and display quotes
      fetchQuotes(selectedTopic, selectedCount);
   });
});

// TODO: Modify to use Fetch API
function fetchQuotes(topic, count) {

   let quotes = [];
   let sources = [];
   topic = topic.toLowerCase();

   async function getQuotes() {
      const request = (`https://wp.zybooks.com/quotes.php?topic=${topic}&count=${count}`);

      await fetch(request)
         .then((res) => res.json())
         .then((data) => {
            data.forEach(element => {
               quotes.push(element.quote);
               sources.push(element.source);
            });
         })
   let html = "<ol>";
   for (let c = 1; c <= count; c++) {
      html += `<li>${quotes[c - 1]} - ${sources[c - 1]}</li>`;
   }
   html += "</ol>";

   document.querySelector("#quotes").innerHTML = html;
   };

   getQuotes();
}