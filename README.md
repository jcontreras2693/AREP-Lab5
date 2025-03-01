# Taller 5 | AREP

## Creation of a CRUD System to Manage Properties

In this project, we will develop a simple CRUD (Create, Read, Update, Delete) system for managing real estate properties. They will build a basic web application that enables users to perform key operations on property listings, finally the web application will be released in AWS.

## Project Summary

## Architecture

The architecture used aligns with the Client-Server pattern, in which a server hosts all resources, and one or more clients can access and use these resources through requests that are responded to by the Backend's REST services.

![](src/main/resources/images/architecture.png)

## Class Design

```
src/
  main/
    java/
      co/
        edu/
          eci/
            controller/
              PropertyController.java
            model/
              Property.java
            repository/
              PropertyRepository.java
            service/
              PropertyService.java
            WebApplication.java                 # Clase principal
    resources/
        images/                                 # Recursos para el archivo Readme
        static/            
            index.html
            styles.css
            script.js
        application.properties
  test/
    java/
      co/
        edu/
          eci/
            WebApplicationTest.java             # Pruebas Unitarias
Dockerfile
pom.xml
README.md
```

## Getting Started

These instructions will allow you to get a working copy of the project on your local machine for development and testing purposes.

### Prerequisites

- [Java](https://www.oracle.com/co/java/technologies/downloads/) 21 or higher.
- [Maven](https://maven.apache.org/download.cgi). 3.8.1 o higher.
- [Git](https://git-scm.com/downloads) (optional).
- Web Browser.

To check if installed, run:

```
java -version
```
```
mvn --version
```
```
git --version
```

### Installing and Deployment

1. Download the repository from GitHub in a .zip or clone it to your local machine using Git.

    ```
    git clone https://github.com/jcontreras2693/AREP-Lab5.git
    ```
   
2. Navigate to the project directory.

    ```
    cd AREP-Lab5
    ```
   
3. Build the project by running the following command:

    ```
    mvn clean compile
    ```

   ![](src/main/resources/images/succes.png)

4. Execute the project with the following command:

    ```
    mvn exec:java -Dexec.mainClass="co.edu.eci.WebApplication"
    ```

5. From IntellIj terminal you can also use this one:

    ```
    java -cp "target/classes;target/dependency/*" co.edu.eci.WebApplication
    ```

6. The installation process will have been successful if you see a message like this in your command console. (If this steps didn't work, execute the project directly from IntelliJ)


7. Finally, access the address [localhost:8080](http://localhost:8080/) from a web browser to interact with the web application.

   - GET Request example.

       ![](src/main/resources/images/get.png)

   - GET Request example by ID.

     ![](src/main/resources/images/getid.png)

   - POST Request example.

       ![](src/main/resources/images/post.png)

   - PUT Request example.

     ![](src/main/resources/images/put.png)

   - DELETE Request example.

       ![](src/main/resources/images/delete.png)

## Application Running

- Containers creation

  ![](src/main/resources/images/container-creation.png)

- Containers running

    ![](src/main/resources/images/docker.png)

- Images

  ![](src/main/resources/images/docker-images.png)

- Containers

  ![](src/main/resources/images/docker-containers.png)

## Running the Tests

The tests performed verify the getters and setters of the Pokémon class, the PokemonController GET and POST actions and the Concurrency on PokemonServer.

To run the tests from the console, use the following command:

```
mvn test
```

If the tests were successful, you will see a message like this in your command console.

![](src/main/resources/images/tests.png)

## Built With

* [Java Development Kit](https://www.oracle.com/co/java/technologies/downloads/) - Software Toolkit
* [Maven](https://maven.apache.org/) - Dependency Management
* [Git](https://git-scm.com/) - Distributed Version Control System

## Authors

* **Juan David Contreras Becerra** - *Taller 5 | AREP* - [AREP-Lab5](https://github.com/jcontreras2693/AREP-Lab5.git)

## Acknowledgements

* **Billie Thompson** - *README template* - [PurpleBooth](https://github.com/PurpleBooth)
