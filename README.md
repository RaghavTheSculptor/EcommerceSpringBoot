# E-Commerce Platform

## Description
This project is a simple e-commerce platform built using **Java Spring Boot** for the backend and **Node.js/React** for the frontend. The application supports basic product management functionalities and demonstrates how to build and integrate REST APIs with a MySQL database. It also includes features for handling images in both database storage and requests.

---

## Features

### Backend Features (Java Spring Boot):
1. **Product Management**:
   - Create new products.
   - Retrieve all products.
   - Update product details.
   - Delete products.
   - Search for products.

2. **Database Integration**:
   - Used **MySQL** as the database.
   - Configured database connectivity with **Spring Boot**.

3. **JPA & JPQL**:
   - Leveraged **JPA** to simplify database operations without the need for SQL queries.
   - Utilized **JPQL** for more complex queries when required.

4. **Image Handling**:
   - Implemented functionality to handle images in both:
     - Database storage.
     - Incoming requests.

5. **REST APIs**:
   - Designed and built RESTful APIs for efficient interaction with the frontend.

---

### Frontend Features (Node.js/React):
- The frontend of the project, downloaded from an external source, includes user-friendly interfaces to interact with the e-commerce platform.

---

## API Endpoints
Here are the main endpoints for product management:

| Method | Endpoint                  | Description                  |
|--------|---------------------------|------------------------------|
| GET    | `/api/products`           | Retrieve all products        |
| GET    | `/api/product/{id}`       | Retrieve product by id       |
| GET    | `/api/product/{id}/image` | Retrieve product image by id |
| POST   | `/api/product`            | Create a new product         |
| PUT    | `/api/product/{id}`       | Update a product             |
| DELETE | `/api/product/{id}`       | Delete a product             |
| GET    | `/api/products/search`    | Search for products          |

---
