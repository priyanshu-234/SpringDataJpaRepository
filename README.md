# Spring Boot with Data JPA and MySQL Example

This is a simple **Spring Boot** project that demonstrates how to use **Spring Data JPA** with **MySQL**. In this project, we have an entity `User` and a repository `UserRepository` that performs database operations. Data is saved to MySQL using **Spring Data JPA's** `CrudRepository` interface.

---

## 🚀 Project Features

- **Spring Boot** for building the backend application.
- **Spring Data JPA** for interacting with the MySQL database using **CRUD operations**.
- A `User` entity representing a user with properties like `id`, `name`, and `sirname`.
- Uses **MySQL** for data persistence.

---

## 🛠 Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Maven** for build management

---

## 📦 Setup Instructions

### Prerequisites

- **Java 17 or higher** installed.
- **MySQL** installed and running on your local machine.
- **Maven** installed for building the project.
- A **Spring Boot compatible IDE** like IntelliJ IDEA or Eclipse.

### How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/your-repo-name.git
    cd your-repo-name
    ```

2. **Set up MySQL database**:
    - Make sure MySQL is installed and running.
    - Create a database (for example: `testdb`) in MySQL:
      ```sql
      CREATE DATABASE testdb;
      ```

3. **Configure MySQL connection**:
    - In `src/main/resources/application.properties`, set up the connection details:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/testdb
      spring.datasource.username=root
      spring.datasource.password=your_password
      spring.jpa.hibernate.ddl-auto=update
      spring.jpa.show-sql=true
      ```

4. **Run the application**:
    - You can run the application by using the following Maven command:
      ```bash
      mvn spring-boot:run
      ```

5. **Verify the saved data**:
    - When the application runs, it will automatically save two `User` objects to the `User` table in your database. You can verify this by checking the database or by looking at the console logs.

---

## 📜 Structure of the Project

- **User Entity (`User`)**:
  - This class represents the `User` table in MySQL with fields like `id`, `name`, and `sirname`.
  
- **Repository (`UserRepository`)**:
  - This interface extends `CrudRepository<User, Integer>` and provides basic CRUD functionality for the `User` entity.
  
- **Main Application (`SpringDataJpaApplication`)**:
  - This is the entry point of the Spring Boot application. It creates `User` objects and saves them to the database using the `UserRepository`.

---

## 🔧 Example Code for Saving Data

The data is saved in the database by creating `User` objects and calling `userRepository.save()`:

```java
@Autowired
private UserRepository userRepository;

public void saveUser() {
    User user1 = new User(2, "Rahul", "Mishra");
    User user2 = new User(3, "Raj", "Mishra");
    
    userRepository.save(user1);
    userRepository.save(user2);
    
    System.out.println("User saved successfully!");
}

🙌 Author
Made with ❤️ by Priyanshu Shukla

GitHub Profile : github.com/priyanshu-234




### **Explanation of README Sections**:

1. **Project Overview**: 
   - This section introduces the project, explaining that it uses **Spring Boot**, **Spring Data JPA**, and **MySQL** to perform basic data persistence operations.

2. **Tech Stack**: 
   - Lists the technologies used, including **Spring Boot**, **Spring Data JPA**, and **MySQL**.

3. **Setup Instructions**: 
   - This section includes step-by-step instructions on how to set up the MySQL database, configure connection details in `application.properties`, and run the application.

4. **Project Structure**: 
   - Explains the basic structure of the project, including the **User entity**, **UserRepository**, and the **main application class**.

5. **Example Code**: 
   - Provides a simple example showing how the data is saved using the **UserRepository**.

6. **Author**: 
   - Your GitHub profile link is included so users can see your other projects.

---

### **Next Steps**:

- If you want to improve this further, you could consider adding **controller classes** and **API endpoints** to perform CRUD operations via RESTful APIs, which would make your project more flexible and testable (using **Postman** or **cURL**).
- You can also improve the `application.properties` by adding better **security settings** (like username and password encryption for production).

Let me know if you need any further improvements or additions!
