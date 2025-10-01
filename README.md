# 🎟️ Event Management System

A full-stack web application for managing events, ticket bookings, and user interactions. Built with **Spring Boot** (backend) and **React.js** (frontend), the platform includes authentication, event listings, ticket purchasing, shopping cart, payment integration, and admin management.

---

## 🚀 Features Overview

### 🔐 User Authentication & Management
- User registration and secure login (JWT)
- Password encryption using BCrypt
- Profile management (planned)

### 📆 Event Management (Admin Panel)
- Admin can create, update, and delete events
- Event details: title, date, location, tickets, image
- Admin dashboard for event overview

### 🛒 Shopping Cart & Checkout
- Users can add tickets to a shopping cart
- View cart with ticket quantity and pricing
- Checkout process with payment gateway (Stripe/PayPal)
- Email confirmation with ticket delivery

### 🎫 Ticket Management
- Auto-generate ticket with QR code after purchase
- Ticket sent via email
- Admin check-in via QR code scanning (planned)

### 📊 Admin Dashboard & Reporting
- View total tickets sold per event
- Revenue reporting
- Visual charts with Chart.js
- Export sales data as CSV

### 🌍 Public Event Listing
- Filter/search by category, date, or location
- Responsive event grid for public browsing

---

## 💻 Tech Stack

| Layer       | Technology |
|-------------|------------|
| Frontend    | React, Axios, React Router |
| Backend     | Spring Boot, Spring Security, Spring Data JPA |
| Database    | PostgreSQL / H2 (Dev) |
| Auth        | JWT (JSON Web Token) |
| Payments    | Stripe or PayPal |
| PDF Tickets | iText or JasperReports |
| Charts      | Chart.js |
| Others      | Git, IntelliJ, Postman, Docker (optional) |

---

## 📁 Project Structure

event-management-system/
├── backend/ # Spring Boot application
│ ├── src/main/java/
│ ├── src/main/resources/
│ └── pom.xml
├── frontend/ # React application
│ ├── src/
│ ├── public/
│ └── package.json
└── README.md

markdown
Copy
Edit

---

## ✅ User Stories & Tasks

### EPIC: User Authentication & Management
- [x] Registration API
- [x] Password hashing
- [x] JWT login system
- [ ] Frontend login/register pages
- [ ] Login flow validation

### EPIC: Event Management (Admin Panel)
- [x] Event model
- [x] CRUD APIs
- [ ] Frontend admin panel
- [ ] Image upload
- [ ] Ticket limit validation

### EPIC: Shopping Cart & Checkout
- [x] CartItem entity
- [x] Add to cart API
- [ ] Cart UI and cart badge
- [ ] Checkout API and order model
- [ ] Stripe/PayPal integration
- [ ] Email ticket confirmation

### EPIC: Ticket Management
- [ ] PDF ticket generation with QR code
- [ ] Email ticket to user
- [ ] QR code scanning endpoint

### EPIC: Admin Dashboard & Reporting
- [ ] Ticket and revenue stats APIs
- [ ] Chart.js dashboard
- [ ] CSV export

### EPIC: Public Event Listing
- [ ] Search/filter API
- [ ] Event display in frontend
- [ ] Pagination
- [ ] Mobile responsiveness

---

## 🔧 Getting Started

### Backend (Spring Boot)
```bash
cd backend
./mvnw spring-boot:run
Frontend (React)
bash
Copy
Edit
cd frontend
npm install
npm start
Environment Variables
Set the following in .env (frontend) and application.properties (backend):

ini
Copy
Edit
# React .env
REACT_APP_API_BASE_URL=http://localhost:8080/api

# Spring Boot application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/eventdb
jwt.secret=your_jwt_secret_key
📦 Future Enhancements
⭐ Save events to favorites

⭐ User reviews and ratings

🎟️ Coupons and promo codes

📅 Calendar view for events

📱 PWA / mobile-first design

📜 License
This project is open-source under the MIT License.

🙌 Contributing
Pull requests are welcome. For major changes, open an issue first to discuss what you would like to change.
