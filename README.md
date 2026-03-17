# 📧 Email Administration System (Java)

A **Java-based Email Administration System** that automatically generates employee email accounts, manages passwords, mailbox capacity, alternate emails, and stores employee information in a file.

This project simulates how **corporate IT departments generate employee email accounts** and manage basic email account settings.

The application is a **menu-driven console program built using Core Java concepts**, focusing on **Object-Oriented Programming and File Handling**.

---

# 🚀 Features

✔ Automatic company email generation
✔ Department selection system
✔ Secure random password generation
✔ Change password with validation
✔ Mailbox capacity management
✔ Set alternate email address
✔ Store employee data in a file
✔ Read employee data from stored file
✔ Menu-driven console interface
✔ Exception handling for robust input processing

---

# 🏗 System Architecture

The application follows a **simple layered architecture**.

```
+--------------------+
|        User        |
+---------+----------+
          |
          v
+--------------------+
|    EmailApp.java   |
|  (Driver / Menu)   |
+---------+----------+
          |
          v
+--------------------+
|     Email.java     |
|   Business Logic   |
+---------+----------+
          |
          v
+--------------------+
|     File System    |
|      info.txt      |
+--------------------+
```

### Architecture Components

**User**

* Interacts with the system via the console.

**EmailApp.java**

* Main driver class
* Handles menu system and user interaction
* Calls business logic methods from the Email class.

**Email.java**

* Core business logic of the application
* Generates email IDs
* Generates random passwords
* Handles password updates
* Manages mailbox capacity
* Manages alternate emails
* Handles file storage and retrieval

**File System**

* Stores employee information in `info.txt`.

---

# 📂 Project Structure

```
EmailAdministrationSystem
│
└── src
    └── emailapp
        │
        ├── Email.java
        │     - Business logic
        │     - Email generation
        │     - Password management
        │     - File operations
        │
        └── EmailApp.java
              - Main driver class
              - Menu-driven interface
              - User interaction
```

---

# ⚙️ How the System Works

### 1️⃣ User enters employee details

```
Enter First Name: Rajesh
Enter Last Name: Nayak
```

---

### 2️⃣ System asks for department

```
Department Codes:

1 - Sales
2 - Development
3 - Accounting
0 - None
```

---

### 3️⃣ System automatically generates

* Company email
* Secure random password

Example:

```
Email: rajesh.nayak@development.company.com
Password: A@7h$kL9
```

---

# 📋 Menu Options

```
========= MENU =========

1. Show Information
2. Change Password
3. Change Mailbox Capacity
4. Set Alternate Email
5. Store Data in File
6. Display Data from File
7. Exit
```

---

# 🔐 Password Security

The system generates **random secure passwords** using:

* Uppercase letters
* Lowercase letters
* Numbers
* Special characters

Example:

```
A$7kL@2p
```

### Password Change Rules

* Minimum **8 characters**
* Must enter **current password**
* Maximum **3 attempts allowed**
* Account locks after repeated failures

---

# 💾 File Storage

Employee data is stored in a text file:

```
info.txt
```

Example stored data:

```
===== USER DATA =====
First Name: Rajesh
Last Name: Nayak
Department: Development
Email: rajesh.nayak@development.company.com
Password: A@7h$kL9
Mailbox Capacity: 500MB
Alternate Email: rajesh@gmail.com
======================
```

---

# 🔄 Data Flow

```
User Input
     |
     v
EmailApp (Menu System)
     |
     v
Email Class
     |
     +---- Email Generation
     |
     +---- Password Generation
     |
     +---- Account Settings
     |
     +---- File Storage
             |
             v
          info.txt
```

---

# 🧠 Concepts Covered

This project demonstrates:

* Object-Oriented Programming (OOP)
* Encapsulation
* Constructors
* Method creation
* Exception Handling
* Menu-driven programming
* File reading and writing
* Random password generation
* Input validation
* Java String operations

---

# 🛠 Technologies Used

**Language**

* Java

**Core Concepts**

* OOP (Encapsulation)
* Exception Handling
* File Handling

**Libraries Used**

* Scanner
* Random
* BufferedReader
* BufferedWriter
* FileReader
* FileWriter

**Development Tools**

* IntelliJ IDEA / Eclipse / VS Code

---

# 📥 How to Run the Project

### Step 1 — Clone the Repository

```
git clone https://github.com/your-username/email-administration-system.git
```

---

### Step 2 — Open in IDE

Open the project in:

* IntelliJ IDEA
* Eclipse
* VS Code

---

### Step 3 — Run the Program

Run the main class:

```
EmailApp.java
```

---

# 🔮 Future Improvements

Possible enhancements include:

* Database integration (MySQL / PostgreSQL)
* Email validation system
* Password encryption using hashing
* GUI version using JavaFX or Swing
* Web-based version using Spring Boot
* Multiple employee management system
* Login authentication system

---

# 👨‍💻 Author

**Rajesh Kumar Nayak**

* MCA Student
* Full Stack Java Developer
* Passionate about Software Development

---

# ⭐ Support

If you like this project:

⭐ Star the repository
🍴 Fork the project
📢 Share it with others
