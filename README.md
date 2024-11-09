# 🚗 **Car Rental Management System**

## 📝 **Project Overview**
The **Car Rental Management System** is a comprehensive web application built using the Spring Framework, Java, JSP, and a MySQL database. The system provides an intuitive platform for managing cars, customers, and drivers, supporting a streamlined rental process. Key functionalities include registration, booking, service scheduling, and automated data handling.

## 🔧 **Technologies Used**
- **Backend**: Java, Spring MVC, Spring JDBC
- **Frontend**: JSP, HTML, CSS
- **Database**: MySQL
- **Tools**: Maven, Tomcat Server, Spring JDBC, Spring Autowiring

## 🏛️ **Project Architecture**
- **Controller Layer**: Manages HTTP requests, business logic, and interacts with the service layer.
- **Service Layer**: Handles data manipulation and business rules.
- **DAO Layer**: Manages data persistence using Spring JDBC templates.
- **Data Model Layer**: Includes beans for `AdminLogin`, `CarsAdd`, `CustomersAdd`, and `DriversAdd`.

## 🌟 **Key Functionalities**

### 🔐 1. **User Authentication**
   - **Admin Login**: Allows admin access to the system using secure login verification.

### 🚘 2. **Car Management**
   - **Register, View, Edit, and Delete Car Details**: Admins can add new cars, update existing records, delete cars, and view all car information.
   - **Book and Return Cars**: Handles the booking and return flow while checking car status (**Available**, **On Service**, **On Rent**).
   - **Service Scheduling**: Allows cars to be sent to service based on availability.

### 👥 3. **Customer Management**
   - **Customer Registration and Profile Management**: Allows admins to add, view, edit, and delete customer details.
   - **Eligibility Checks**: Customers are verified for eligibility before bookings.

### 🚗 4. **Driver Management**
   - **Driver Registration and Management**: Similar functionality to car and customer management.
   - **Search and Filter**: Easily search for drivers by ID.

