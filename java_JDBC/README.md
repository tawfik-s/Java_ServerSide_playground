# java_JDBC

Hi this is a console app for **JDBC** revision and some practices you will find
the main function in App.java class 
* main path `src\main\java\org\example\App.java`
* database mysql model path `src\main\java\org\example\models`
* dependencies
```xml
 <dependencies>
    <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.30</version>
    </dependency>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.2</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
```
### Database connection: 
Create a singleton connection class 
DatabaseConnection in util package. Use your 
MySQL username and password on the 
variable user and pass. Look carefully at the 
last part of the “url” variable. It is mandatory to 
keep the
name the same as the database name. The name 
of my database is “org” that’s why I put “org” 
in the URL variable.


### Model class:
Create a model class named Employee in model package. It should contain all the attributes as variables.

### Database Access Object(DAO): 
We will create an EmployeeDao interface and another class EmployeeDaoImplementation which implements EmployeeDao. This implemented class will be used as a DAO to perform CRUD operations. We will use PreparedStatement to execute the query. PreparedStatement has 3 special methods:
* executeQuery(): used to retrieve data
* executeUpdate(): used to insert, update, delete
* execute(): used to create