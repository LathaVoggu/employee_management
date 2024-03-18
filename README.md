# Employee Management System

This project is an Employee Management System built using Spring Boot and Hibernate. It provides CRUD (Create, Read, Update, Delete) operations for managing employee records.

## Features

- Add new employees with details such as name, email, department, etc.
- View a list of all employees.
- Update employee information.
- Delete employees from the system.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL (or any other supported database)

## Prerequisites

Before running this application, make sure you have the following installed:

- Java Development Kit (JDK) version 17 or higher
- Maven
- MySQL (or another supported database)

## Getting Started

1. Clone the repository:

https://github.com/LathaVoggu/employee_management.git

2. Navigate to the project directory:

cd employee-management

3. Configure the database:

   - Open the `application.properties` file located in `src/main/resources`.
   - Modify the database connection properties as per your environment.

4. Build the project:

mvn clean install

5. Run the application:

java -jar target/employee-management-1.0.0.jar

6. Access the application:

   - Open a web browser.
   - Navigate to `http://localhost:8080` to access the Employee Management System.

## Endpoints

- **GET api/v1/employees**: Retrieve a list of all employees.
- **GET api/v1/employees/{id}**: Retrieve the details of a specific employee by ID.
- **GET api/v1/employees/byWorkLocation**: Retrieve Retrieve a list of all employees by workLocation.
- **GET api/v1/employees/byName**: Retrieve Retrieve a list of all employees by firstName.

- **POST api/v1/employees**: Add a new employee.
- **PUT api/v1/employees/**: Update the details of an existing employee.
- **DELETE api/v1/employees/{id}**: Delete an employee by ID.

## Usage

- Upon accessing the application, you will be presented with a user interface to perform CRUD operations on employee records.
- Use the provided forms to add, view, update, and delete employee information.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or create a pull request.
