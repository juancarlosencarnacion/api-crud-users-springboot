# 🚀 User Management API

This is a RESTful API for managing users, built with **Spring Boot** and **PostgreSQL**, and packaged with **Docker**.

## ⚙️ Prerequisites

Before you begin, make sure you have the following installed:

  * **Java 17 or higher**
  * **Docker** and **Docker Compose**
  * **A text editor or IDE** (like VS Code or IntelliJ IDEA)

-----

## 🚀 Getting Started

Follow these steps to get the API up and running quickly.

### 1\. Configure the Database

First, you need to set up your environment variables for the database connection.

  * **Create a file named `.env`** in the root directory of the project.
  * **Copy the contents** from the provided `.env.template` and fill in your PostgreSQL credentials.

<!-- end list -->

```
# .env file
SPRING_DATASOURCE_USERNAME=your_username
SPRING_DATASOURCE_PASSWORD=your_password
```

### 2\. Launch the Database Container

Next, use Docker Compose to create and start a PostgreSQL database container.

  * Open your terminal in the project's root directory and run the following command:

<!-- end list -->

```bash
docker-compose up -d
```

This command will download the PostgreSQL image (if you don't have it) and start a new container in the background.

-----

## 🌐 API Endpoints

Once the application is running, the API will be available at: `http://localhost:8080`

Here are the main endpoints for user management:

  * **`GET /api/users`** - Retrieve a list of all users.

Enjoy\! 🎉
