#  Online Plant Nursery Management 🌱 (GoGreen) 🌱

<img align="left" alt="Coding" width="153" src="Image/logo.jpg">

We made a Backend Application to Perform CRUD Operation and Made RestFul APIs Service Using java, SpringBoot, lombok and swagger-UI for Nursery Plant Application.In this project customer can signup, login, see planters,plants and seeds. Customer can order multiple orders with multiple plants,planters and seeds. Admin can Manage or can do CRUD Operation On Plants, Seeds, Planters and Customers.



Group name - Nursery_Management_System



___________________________________________________________________________________________________________________________________________________________

# Tech Stacks: 🌱

* Java
* Spring Boot
* Maven
* Postman
* Lombok
* MySql



# Modules 🌱

* Login, Logout Module
* Admin Module
* Plants Module

# Entity RelationShip Diagram 🌱


<img  alt="ER dia" src="Image/ERdia.jpg">

# Features 🌱

* User and Admin authentication & validation with session uuid.

# Admin Features:

* Administrator Role of the entire application
* Only admins can add/update/delete plants, planters, seeds from main database
* Admin can access the details of different users and orders.

# User Features:

* Registering themselves with application, and logging in to get the valid session token
* Viewing list of available plants, planters, seeds and order items of them.
* Only logged in user can access his orders, profile updation and other features.



# Installation & Run 🌱

Before running the API server, you should update the database config inside the application.properties file.

Update the port number, username and password as per your local database config. server.port=8886

spring.datasource.url=jdbc:mysql://localhost:3306/Gogreen spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver spring.datasource.username=mysql username spring.datasource.password=YourPassword spring.jpa.ddl-auto=update

API Root Endpoint https://localhost:8800/

-http://localhost:8800/postman/


# Lessons Learned 🌱

* Gain excessive knowledge on application of Java, Postman, Lombok ,MySql.
* Got to know how to collabrate with team members.
* Enjoyed the process of learning and creating the product.


# Contributors 🌱

* [Dipali Suware](https://github.com/dipalisuware)
* [Samiksha Neman](https://github.com/samikshaneman)
* [Sejal Sawant](https://github.com/sejalsawant)
