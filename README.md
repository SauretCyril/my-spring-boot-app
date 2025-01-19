# My Spring Boot Application

This is a simple Spring Boot application created using Spring Initializr.

## Project Structure

```
my-spring-boot-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── MySpringBootAppApplication.java
│   │   ├── resources
│   │       ├── application.properties
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           └── MySpringBootAppApplicationTests.java
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Building the Application

To build the application, run the following command:

```
./mvnw clean package
```

### Running the Application

To run the application, use the following command:

```
./mvnw spring-boot:run
```

### Testing the Application

To run the tests, execute:

```
./mvnw test
```

## Configuration

You can configure the application by modifying the `src/main/resources/application.properties` file.

## License

This project is licensed under the MIT License.