ECI Candidate Explorer
A Java-based CRUD application for managing candidate information for the Election Commission of India (ECI).

Table of Contents
cid: Candidate ID
name: Candidate name
gender: Gender of the candidate
party: Political party of the candidate
state: State of the candidate
assembly: Assembly constituency of the candidate
age: Age of the candidate
Description
This project is designed to manage and manipulate candidate data for the Election Commission of India (ECI) in an SQL database. The system allows users to perform basic CRUD (Create, Read, Update, Delete) operations on candidate records via a console interface. The project uses Maven for dependency management and JDBC for MySQL database connectivity.

Features
Add Candidate: Allows users to add a new candidate with details like name, gender, party, state, etc.
View Candidates: Allows users to view all candidates or filter by specific parameters like party, gender, or assembly.
Update Candidate: Modify the details of an existing candidate.
Delete Candidate: Allows users to remove a candidate by their unique candidate ID.
Technologies Used
Java
Maven
MySQL
JDBC: Used for MySQL database connectivity.
Project Structure

src/
├── main/
│   ├── java/
│   │   └── com/eci/
│   │       ├── controller/   # Contains controller classes for handling business logic
│   │       ├── service/      # Service layer for application logic
│   │       ├── dao/          # Data Access Object (DAO) for DB operations
│   │       ├── entity/       # Entity classes representing the candidate model
│   │       └── utility/      # Utility class for establishing database connections
  
│   └── resources/            # Contains configuration files (if any)
└── test/                     # Contains unit tests
Usage
Menu Options
After running the application, a console-based menu will be displayed:

Insert Candidate: Prompts the user to input candidate details such as name, party, state, age, etc.
View Candidates: View a list of all candidates or filter candidates by attributes like party, assembly, gender, or age.
Update Candidate: Allows the user to update an existing candidate’s details based on the candidate ID.
Delete Candidate: Remove a candidate's record by providing their candidate ID.
Exit: Close the application.
Instructions
Insert Candidate:
The user is prompted to enter the candidate's ID, name, party, state, assembly, gender, and age.
View Candidates:
The user can view all candidates or filter by party, assembly, or age group.
Update Candidate:
The user can enter the candidate's old ID and update their details, including name, party, state, etc.
Delete Candidate:
The user provides the candidate ID, and the record is removed from the database.
Contributing
We welcome contributions to improve this project! To contribute:

Fork the repository.
Create a new branch for your feature.
Submit a pull request with your changes.
Feel free to suggest improvements, bug fixes, or new features.

Contact
For any queries, issues, or feedback, you can reach out to:

Email: andhalesaurabh@gmail.com
