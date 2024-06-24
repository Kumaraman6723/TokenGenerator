
---

# Token Generator Application

## Overview

The **Token Generator Application** is a simple web application built using Spring Boot for the backend and vanilla HTML, CSS, and JavaScript for the frontend. The application allows users to generate, update, and view tokens. It provides an easy-to-use interface for managing tokens, demonstrating fundamental CRUD (Create, Read, Update, Delete) operations.

## Features

- **Generate Token:** Create a new token and display it on the frontend.
- **Update Token:** Update an existing token with a new value.
- **View Tokens:** Fetch and display all tokens stored in the database.
- **Delete Token:** Remove a token from the database.

## Technology Stack

- **Backend:** Spring Boot, JPA, Hibernate
- **Frontend:** HTML, CSS, JavaScript
- **Database:** H2 (in-memory database for simplicity)

## Project Structure

### Backend (Spring Boot)

- **`TokenGeneratorApplication.java`:** Main class to run the Spring Boot application.
- **Controllers:**
  - `TokenController.java`: Handles HTTP requests for token operations.
- **Services:**
  - `TokenService.java`: Interface for token operations.
  - `TokenServiceImpl.java`: Implementation of the `TokenService` interface.
- **DAO:**
  - `Dao.java`: Interface for data access operations.
  - `DaoImpl.java`: Implementation of the `Dao` interface.
- **Entities:**
  - `TokenEntity.java`: JPA entity representing the token.

### Frontend

- **HTML:**
  - `index.html`: Main page with buttons to generate and update tokens, and display the token list.
- **CSS:**
  - `style.css`: Basic styles for the application.
- **JavaScript:**
  - `script.js`: Functions to handle fetch requests for generating, updating, and displaying tokens.

## Endpoints

- **POST** `/tokens/create`: Creates a new token.
- **GET** `/tokens/get`: Retrieves all tokens.
- **GET** `/tokens/get/{id}`: Retrieves a specific token by ID.
- **PUT** `/tokens/update/{id}`: Updates a token with a new value.
- **DELETE** `/tokens/delete/{id}`: Deletes a token by ID.

## Running the Application

### Prerequisites

- Java 8 or higher
- Maven

### Steps

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/token-generator.git
   cd token-generator
   ```

2. **Build the project:**
   ```bash
   mvn clean install
   ```

3. **Run the Spring Boot application:**
   ```bash
   mvn spring-boot:run
   ```

4. **Open the frontend:**
   - Open `index.html` in your browser to access the application.

## Example Usage

### Generate a Token
1. Click the "Generate Token" button.
2. The newly generated token will be displayed below the button.

### Update a Token
1. Click the "Update Token" button.
2. Enter the token ID to update and the new token value in the prompts.
3. The updated token will be displayed below the button.

### View All Tokens
1. The tokens are displayed in a list on page load.

### Delete a Token
1. Make a DELETE request to `/tokens/delete/{id}` (you can use tools like Postman).

