# Composition-Book

## Project Description

This Spring Boot project is a book management system with CRUD operations. It includes three model classes: `Author`, `Book`, and `Publisher`. The REST API provides endpoints for creating, reading, updating, and deleting books, as well as managing authors and publishers. The project utilizes Spring MVC for handling HTTP requests and follows RESTful conventions.

## API Contract

The RESTful API follows a set of conventions and contracts for interacting with the book management system. Here is an overview of the API endpoints and their functionality:

### Create a Book

**Endpoint:** `POST /books`

**Request Body:** JSON representation of the book details

**Description:** Creates a new book with the provided details.

### Get Book Details

**Endpoint:** `GET /books/{id}`

**Description:** Retrieves the details of a specific book identified by its id.

### Update Book Details

**Endpoint:** `PUT /books/{id}`

**Request Body:** JSON representation of the updated book details

**Description:** Updates the details of a specific book identified by its id.

### Delete a Book

**Endpoint:** `DELETE /books/{id}`

**Description:** Deletes a specific book identified by its id.

### Add an Author to a Book

**Endpoint:** `POST /books/{bookId}/authors`

**Request Body:** JSON representation of the author details

**Description:** Adds a new author to the book identified by bookId.

### Manage Publisher

**Endpoint:** `GET /publishers/{publisherId}`

**Description:** Retrieves the details of a specific publisher identified by its publisherId.

These are the basic API endpoints for managing books, authors, and publishers. You can further enhance the API by adding additional endpoints or functionalities based on your requirements.

Please note that this is a general overview of the project and API contract. Additional details such as request/response formats, error handling, and authentication/authorization mechanisms can be implemented based on your specific project needs.
