# Holiday Travel Vehicles

A Java application for managing holiday travel vehicles, including customers, staff, invoices, and vehicle information.

## Project Description

This project is part of the ITCS382 - Software Design and Modelling course, Week 07 activity focusing on "Class to Code" implementation. The system manages various aspects of a holiday travel vehicle business including:

- Vehicle management and information
- Customer and staff management
- Invoice generation and tracking
- Dealer options for vehicles
- Trade-in vehicle handling

## Classes Overview

- **Vehicle**: Main vehicle class with properties like ID, name, model, year, manufacturer, and price
- **Customer**: Represents customer information (extends Person)
- **Staff/Salesperson**: Staff management classes (extends Person)
- **Invoice**: Invoice generation and management
- **DealerOption**: Additional options available for vehicles
- **TradeInVehicle**: Handles trade-in vehicle information
- **Person**: Base class for customer and staff entities

## How to Run

1. Compile the Java files:
   ```bash
   javac -d bin src/*.java
   ```

2. Run the main application:
   ```bash
   java -cp bin VehicleMain
   ```

## Sample Output

The `VehicleMain` class demonstrates creating a Vehicle object and displaying its information:

```
=== Vehicle Information ===
Vehicle ID: V001
Name: Toyota Camry
Model: Camry
Year: 2023
Manufacturer: Toyota
Price: $35000.00
===========================
```