document.addEventListener("DOMContentLoaded", function () {
  // Fetch data from Postman (replace URL with your API endpoint)
  fetch("http://localhost:9090/tokens/get")
    .then((response) => response.json())
    .then((data) => {
      // Process the fetched data and display it

      const dataContainer = document.getElementById("data-container");

      // Create an unordered list element
      const ul = document.createElement("ul");

      // Loop through the data and create list items
      data.forEach((item) => {
        const li = document.createElement("li");
        li.textContent = `Token ID: ${item.tokenId}, Token: ${item.token}`;
        ul.appendChild(li);
      });

      // Append the unordered list to the data container
      dataContainer.appendChild(ul);
    })
    .catch((error) => {
      console.error("Error fetching data:", error);
    });
});
