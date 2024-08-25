# Microframeworks WEB

This project demonstrates a basic web server architecture using a microframework. It includes a simple server that handles both dynamic service requests and static file serving.

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

## Running the Web Application

To test the web application, open a web browser and navigate to http://localhost:8080/index.html. You should see the form-based web application, which includes the following features:

1. A form to enter your name and make a get request
2. A button to review the number pi

## Prototype Architecture
 ```
C:.
└───src
    ├───main
    │   ├───java
    │   │   └───edu
    │   │       └───escuelaing
    │   │           └───arem
    │   │               └───ASE
    │   │                   └───app
    │   └───resources
    └───test
        └───java
            └───edu
                └───escuelaing
                    └───arem
                        └───ASE
                            └───app
 ```
## Deployment

To deploy the web server on a live system, you can package the application as a JAR file and run it using the same command as in the "Running the Server" section.

## View of the app

![image](https://github.com/user-attachments/assets/37b48fca-4bde-4f1b-b10b-3241003731ca)

![image](https://github.com/user-attachments/assets/29536ee0-e090-4e85-8c5b-103fae957b7f)

![image](https://github.com/user-attachments/assets/134f981c-a1ae-4430-937a-72075d1d0f1c)

![image](https://github.com/user-attachments/assets/a38b3ad7-8824-4674-926f-ae71b8be61ee)

![image](https://github.com/user-attachments/assets/6dfe4eec-4e42-444c-a3ac-91cbb2ef8021)

## Built With

* Java 22
* org.json library for parsing JSON
* HTTP server implementation using Java's built-in networking libraries

## Authors

Erick Montero
