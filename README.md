# Microservices Architecture with Spring Boot

This project demonstrates a basic microservices architecture using Spring Boot. It includes a simple web server that handles both dynamic service requests and static file serving.

## Getting Started

These instructions will help you get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Ensure you have the following software installed:
- Java Development Kit (JDK) 11 or higher
- Maven for building the project

To install JDK, visit the [OpenJDK website](https://openjdk.java.net/install/).

To install Maven, follow the instructions on the [Apache Maven website](https://maven.apache.org/install.html).

### Installing

Follow these steps to set up the development environment:

1. Clone the repository:
    ```bash
    git clone https://github.com/Erick01081/lab2AREP.git
    ```

2. Navigate to the project directory:
    ```bash
    cd lab2AREP
    ```

3. Build the project using Maven:
    ```bash
    mvn clean install
    ```

4. Run the application:
    ```bash
    java -cp target/lab2-app-1.0-SNAPSHOT.jar edu.escuelaing.arem.ASE.app.App
    ```

5. The server will start on port 8080. You can access it via:
    - `http://localhost:8080/hello?name=YourName`
    - `http://localhost:8080/pi`
    - `http://localhost:8080/index.html`

## Running the Tests

To run automated tests, use Maven:

```bash
mvn test
```
