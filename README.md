# Stacc Code Challenge

## The Challenge

Open challenge to make a KYC (Know Your Customer) check. I chose to solve it by making a simple frontend that allows you to search for a person. I also made a REST API with all CRUD operations. The frontend only has functionality for getting one customer, but you can test the entire API using Postman.

## Technology Stack

<img width="710" alt="image" src="https://user-images.githubusercontent.com/50453041/193447752-b1dd7e68-3681-45dc-8ef9-6eb8fd3957ea.png">

I chose to go for Spring Boot backend. Main reasons I chose to go for this is because of Spring Initializr, a lot of documentation, and JPA. Spring Initializr helps you create a new project, and JPA allowed me to make a fairly simple database without needing a lot of code. This allowed me to focus on the REST API and making an interactive prototype.

I went for React frontend. This was simply because React is well-documented and used a lot in the industry. Spring Boot also had a setup guide with React which helped make the decision.

## How to run locally
Run backend: Navigate to the source folder "demo" then run command below. By default backend is run on port 8080.
```
./mvnw spring-boot:run
```
Run frontend: Navigate to the folder called "frontend". Then run following commands. By default frontend is run on port 3000. HTTP requests are proxied to port 8080.
```
npm install
npm start
```
npm install installs necessary modules. npm start runs the application.
