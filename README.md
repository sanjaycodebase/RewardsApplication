# Rewards Calculator

This project is a Spring Boot-based RESTful API application that calculates reward points based on transaction amounts. It is designed to demonstrate simple RESTful services and is an ideal starting point for learning backend development with Java and Spring Boot.

---

## Features
- Calculate reward points for transactions.
- RESTful endpoints for interaction.
- Follows good software practices with modular design.

---

## Prerequisites
To build and run this project, ensure you have the following installed:

1. **Java Development Kit (JDK)**
   - Version: 11 or above
   - [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

2. **Apache Maven**
   - For building and managing the project dependencies.
   - [Download Maven](https://maven.apache.org/download.cgi)

3. **Postman or cURL**
   - For testing API endpoints.

4. **IDE** (Optional but recommended)
   - Examples: IntelliJ IDEA, Eclipse, or Visual Studio Code.

---

## Setup Instructions

### 1. Clone the Repository
```bash
https://github.com/username/rewards_calculator.git
cd rewards_calculator
```

### 2. Build the Application
Using Maven:
```bash
mvn clean install
```

### 3. Run the Application
You can run the application using:
```bash
mvn spring-boot:run
```

Alternatively, use the generated JAR file:
```bash
java -jar target/rewards_calculator-0.0.1-SNAPSHOT.jar
```

---

## API Documentation

### Endpoint: Calculate Rewards
**URL:** `/rewards/calculate`

**Method:** `POST`

**Request Body:**
```json
{
  "amount": 120.0
}
```

**Response:**
- Reward points for the provided transaction amount.

**Sample Response:**
For an amount of `120.0`, the response will be:
```json
90
```

**Error Handling:**
- If required fields are missing or invalid, the API returns an appropriate HTTP status code (e.g., 400 Bad Request).

---

## Folder Structure
```
rewards_calculator
├── src
   ├── main
   |   ├── java
   |   |   ├── com.example.rewards_calculator
   |   |       ├── controller
   |   |       │   └── RewardController.java
   |   |       ├── entity
   |   |       │   └── Transaction.java
   |   |       ├── service
   |   |       │   └── RewardService.java
   |   |       └── RewardsCalculatorApplication.java
   |   └── resources
   |       ├── application.properties
   |       └── data.sql (if applicable)
   └── test
       └── java
           └── com.example.rewards_calculator
               └── RewardServiceTests.java
```

---

## Testing the API

### Using cURL
Example request:
```bash
curl -X POST http://localhost:8080/rewards/calculate \
-H "Content-Type: application/json" \
-d '{"amount": 120.0}'
```

### Using Postman
1. Open Postman and create a new request.
2. Set the method to `POST`.
3. Enter the URL: `http://localhost:8080/rewards/calculate`.
4. Go to the "Body" tab and select `raw` > JSON.
5. Enter:
```json
{
  "amount": 120.0
}
```
6. Click "Send" and view the response.

---

## Future Enhancements
- Add endpoints for fetching reward points by customer ID or transaction date.
- Implement pagination and filtering for larger datasets.
- Introduce database integration to persist transaction records.

---

