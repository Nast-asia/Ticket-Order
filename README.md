#### Task 2 - Ticket Order
#### Anastasia Nazarevich

The project is an application for railway ticket booking. It continues to be developed.

# src/main/java/

### Main.java
It's the main class with psvm method. Starts firstly.

### Initialization.java
Required data is added in this class

### package beans
The package contains all entities with overriden equals(), hashCode() and toString()

### package view
The package is a menu realization. User can see this menu, get and input data on this layer.

### package controller
Controller gets data from user and calls required command.
Package controller.commands contains classes for all necessary commands.

### package service
Every entity has the service. Service gets data from controller, does action and cheks exceptions.

### package exception
On service layer all data are verified for errors and exceptions.
If all is good, service sets data to datasource.
Else service return message to controller, and user can input another data.

### package dao
DAO connects to DataSourse.java after data processing in its methods.

### package comparators
Classes in this package implement Comparator and Comparable interfaces.
It is needed to comparó and sort objects for adding.

# src/main/resources/

Now the package contains only log4j2.xml file.
It is needed to use Logger in programm and write some information to logs.

# src/test/java/
The package contains the classes to test system.

# other

### javadoc/
The package contains the files created during the generating the file describing the comments for documentation.

### .gitgnore
The file describes elements that are hidden from GitHub during commit.

### pom.xml
The file is a Maven structure and Maven dependencies realisation.