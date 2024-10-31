# Project Overview

This is a contact management API based on Spring Boot, designed to provide basic CRUD operations, allowing users to easily add, modify, delete, and query contact information. The project uses JPA with a MySQL database for data storage and operations.

## Features

- **Add Contact**: Supports adding new contacts via POST requests.
- **Modify Contact**: Supports modifying existing contact information via PUT requests.
- **Delete Contact**: Supports deleting specified contacts via DELETE requests.
- **Get All Contacts**: Supports retrieving a list of all contacts via GET requests.
- **Get Contact by ID**: Supports querying a specific contact by ID via GET requests.

## Technology Stack

- **Java**: Backend development language.
- **Spring Boot**: Used to build the RESTful API.
- **Spring Data JPA**: For database operations.
- **MySQL**: Relational database management system.
- **Maven**: Project management and build tool.

## API Endpoints

| Method | Path                      | Description       |
| ------ | ------------------------- | ----------------- |
| POST   | /api/contacts/add         | Add contact       |
| PUT    | /api/contacts/modify/{id} | Modify contact    |
| DELETE | /api/contacts/delete/{id} | Delete contact    |
| GET    | /api/contacts/all         | Get all contacts  |
| GET    | /api/contacts/{id}        | Get contact by ID |

## Database Configuration

Configure the MySQL database connection information in the `src/main/resources/application.properties` file:

```
php复制代码spring.datasource.url=jdbc:mysql://localhost:3306/<database-name>
spring.datasource.username=<username>
spring.datasource.password=<password>
spring.jpa.hibernate.ddl-auto=update
```

## Testing the API

Use Postman or any API testing tool to test the API endpoints.
