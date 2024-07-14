# Spring Boot Hibernate One-to-One Mapping Example

This project demonstrates a simple Spring Boot application with Hibernate for one-to-one mapping between Employee and Address entities.

## Technologies Used

- Spring Boot
- Hibernate
- H2 Database
- JUnit

## Project Structure
````
SpringBootHibernateOneToOneMappingExample
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com
│ │ │ └── javatpoint
│ │ │ ├── model
│ │ │ │ ├── Employee.java
│ │ │ │ └── Address.java
│ │ │ ├── repository
│ │ │ │ └── EmployeeRepository.java
│ │ │ ├── service
│ │ │ │ └── EmployeeService.java
│ │ │ └── SpringBootHibernateOneToOneMappingExampleApplication.java
│ │ └── resources
│ │ └── application.properties
│ └── test
│ └── java
│ └── com
│ └── javatpoint
│ └── SpringBootHibernateOneToOneMappingExampleApplicationTests.java
└── README.md
````


## Setup Instructions

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-repository-url.git
   cd SpringBootHibernateOneToOneMappingExample
   ````
2.  **Configure database:**

    Open application.properties and configure the following properties:

    ````
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    spring.h2.console.enabled=true
    ````
    
3.    **Run the application:**

    Execute the main class SpringBootHibernateOneToOneMappingExampleApplication.java to start the Spring Boot application.

## Running the Application

Once the application is running, you can access the H2 console using the URL http://localhost:8080/h2-console with JDBC URL jdbc:h2:mem:testdb.

## Usage

The application demonstrates one-to-one mapping between Employee and Address entities using Hibernate. Use Postman or any REST client to interact with the application's APIs.

## Contributing

Contributions are welcome! Fork the repository and submit a pull request.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
