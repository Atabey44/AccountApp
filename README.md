#Account API For Existing Customer

##Spring Boot and ReactJS Application
This project provides to create account for existing customers.

Summary
The assessment consists of an API to be used for opening a new “current account” of already existing customers.

Requirements
• The API will expose an endpoint which accepts the user information (customerID, initialCredit).

• Once the endpoint is called, a new account will be opened connected to the user whose ID is customerID.

• Also, if initialCredit is not 0, a transaction will be sent to the new account.

• Another Endpoint will output the user information showing Name, Surname, balance, and transactions of the accounts.

The application has 2 apis

AccountAPI
CustomerAPI
POST /v1/account - creates a new account for existing customer
GET /v1/customer/{customerId} - retrieves a customer
GET /v1/customer - retrieves all customers
JUnit test coverage is 100% as well as integration tests are available.

Tech Stack
Java 11
Spring Boot
Spring Data JPA
Restful API
OpenAPI documentation
PostgreSQL database
Docker
Docker compose
JUnit 5
ReactJS for frontend
Prerequisites
Maven
Docker
Run & Build
There are 2 ways of run & build the application.

Docker Compose
For docker compose usage, docker images already push to docker.io


Swagger UI will be run on this url
http://localhost:${PORT}/swagger-ui.html
