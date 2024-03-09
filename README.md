# Railway-Reservation-System
Welcome to the Railway Reservation System! This project is a dynamic and efficient system for managing railway reservations. Leveraging Spring Boot Rest APIs and following a layered architecture (Controller, Service, DAO), it ensures loose coupling and easy maintenance. The project utilizes Java Collection Framework for an in-memory database and supports persistence with MySQL and MongoDB.


**Introduction**
The Railway Reservation System is designed to simplify and streamline the process of railway ticket reservations. It incorporates a layered architecture consisting of Controller, Service, and DAO layers, ensuring separation of concerns and easy maintenance. This architecture enables the system to handle requests efficiently and maintain scalability.

**Features**
User authentication and authorization
Train and station management
Ticket booking and cancellation
Seat availability checking
Booking history and profile management
Email notifications for booking confirmations and cancellations
Support for both MySQL and MongoDB for persistence
Technologies Used
Spring Boot
Spring Rest APIs
MySQL and MongoDB for persistence
Java Collection Framework (for in-memory database)
Maven (for project management and dependency resolution)

**Setup Instructions**
Clone the repository: git clone https://github.com/pandenaman007/Railway-Reservation-System.git
Navigate to the project directory: cd railway-reservation-system
Configure the database: Update the application.properties file with your MySQL/MongoDB database credentials.
Build the project: mvn clean install
Run the application: java -jar target/railway-reservation-system.jar
Access the application: Open a web browser and go to http://localhost:8080

**Usage**
User Registration/Login: Users can register for a new account or log in using their credentials.
Search and Book Tickets: Users can search for trains by specifying the source and destination stations along with the date of travel. They can then select a train and book tickets for the desired journey.
Manage Bookings: Users can view their booking history, cancel bookings, and update their profile information.
Admin Dashboard: Administrators can log in to access the administrative dashboard. From here, they can manage trains, stations, schedules, and user accounts.
Contributing
Contributions to the Railway Reservation System are welcome! If you would like to contribute, please follow these steps:

**Fork the repository**
Create a new branch (git checkout -b feature/your-feature)
Make your changes
Commit your changes (git commit -am 'Add some feature')
Push to the branch (git push origin feature/your-feature)
Create a new Pull Request
