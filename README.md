# 📧 Email Administration System (Java)

A **Java-based Email Administration System** that automatically generates employee email accounts, manages passwords, mailbox capacity, alternate emails, and stores user information in a file.

This project demonstrates **Core Java concepts**, including:

* Object-Oriented Programming (OOP)
* Exception Handling
* File Handling
* Random Password Generation
* Menu-driven Console Applications
* Encapsulation
* Input Validation

---

# 🚀 Features

✔ Employee email generation
✔ Department selection
✔ Secure random password generation
✔ Change password with validation
✔ Set mailbox capacity
✔ Set alternate email
✔ Store employee data in a file
✔ Read stored employee data
✔ Menu-driven console interface
✔ Exception handling for robust input processing

---

# 🛠 Technologies Used

* **Java**
* **Core Java Concepts**
* **File Handling (BufferedReader / BufferedWriter)**
* **Exception Handling**
* **Random Class**
* **Scanner Class**

---

# 📂 Project Structure

```
EmailAdministrationSystem
│
└── src
    └── emailapp
        │
        ├── Email.java       # Main business logic
        └── EmailApp.java    # Driver class with menu
```

---

# ⚙️ How the System Works

### 1️⃣ User enters employee name

```
Enter First Name: Rajesh
Enter Last Name: Nayak
```

### 2️⃣ System asks for department

```
Department Codes:
1 - Sales
2 - Development
3 - Accounting
0 - None
```

### 3️⃣ System generates automatically

* Company email
* Random secure password

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

Users can also **change their password with validation**.

Rules:

* Minimum **8 characters**
* Must enter **current password**
* **3 attempts allowed**

---

# 💾 File Storage

Employee data can be stored in a text file:

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

# 📥 How to Run the Project

### Step 1 — Clone Repository

```bash
git clone https://github.com/your-username/email-administration-system.git
```

---

### Step 2 — Open in IDE

Open in:

* IntelliJ IDEA
* Eclipse
* VS Code

---

### Step 3 — Run Program

Run:

```
EmailApp.java
```

---

# 🧠 Concepts Covered

This project demonstrates:

* **Encapsulation**
* **Constructors**
* **Method creation**
* **Exception handling**
* **Menu driven programs**
* **File read/write**
* **Random password generation**
* **Input validation**
* **OOP design**

---

# 🎯 Learning Purpose

This project is useful for beginners learning:

* Core Java
* OOP design
* File handling
* Console-based application development

---

# 🔮 Future Improvements

Possible upgrades:

* Database integration (MySQL / PostgreSQL)
* Email validation
* Password encryption
* GUI version (JavaFX / Swing)
* Web version (Spring Boot)
* Multiple employee management

---

# 👨‍💻 Author

**Rajesh Kumar Nayak**

* MCA Student
* Full Stack Java Developer
* Passionate about Software Development

---

# ⭐ Support

If you like this project:

⭐ **Star the repository**
🍴 **Fork it**
📢 **Share it**

---
