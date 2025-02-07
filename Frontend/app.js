document.addEventListener("DOMContentLoaded", () => {
    const itemsList = document.getElementById("items-list");
    const itemForm = document.getElementById("item-form");

    // Fetch items from backend and display
    fetch('http://localhost:8080/api/items')
        .then(response => response.json())
        .then(data => {
            data.forEach(item => {
                const listItem = document.createElement("li");
                listItem.textContent = `${item.name}: ${item.description}`;
                itemsList.appendChild(listItem);
            });
        });
        
// Handle form submission
itemForm.addEventListener("submit", event => {
    event.preventDefault();

    const name = document.getElementById("item-name").value;
    const description = document.getElementById("item-description").value;

    fetch('http://localhost:8080/api/items', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ name, description })  // Ensure name and description are properly captured
    })
    .then(response => response.json())
    .then(item => {
        const listItem = document.createElement("li");
        listItem.textContent = `${item.name}: ${item.description}`;
        itemsList.appendChild(listItem);
    })
    .catch(error => console.error('Error adding item:', error));

    itemForm.reset();
});

});
