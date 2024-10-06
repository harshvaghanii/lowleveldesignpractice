# Parking Lot - Low Level Design

This repository contains the low-level design (LLD) of a Parking Lot Management System. It includes the class diagrams, use case diagram, requirements, assumptions, and detailed explanations of how the system is structured and functions.

## Table of Contents
- [Introduction](#introduction)
- [Requirements](#requirements)
- [Assumptions](#assumptions)
- [Design](#design)
  - [Class Diagrams](#class-diagrams)
  - [Use Case Diagram](#use-case-diagram)
- [How It Works](#how-it-works)
- [Future Enhancements](#future-enhancements)
- [Installation](#installation)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project is a low-level design of a Parking Lot Management System aimed at managing parking spaces, automating ticket generation, and enabling efficient entry and exit management. The system is designed to handle vehicles entering, parking, and exiting, while also providing real-time updates on parking space availability.

## Requirements

1. **Parking Availability Display:**  
   Customers check the display board for a green signal indicating the availability of parking spaces.
   
2. **Automated Slot Assignment:**  
   The system automatically checks for available parking slots and assigns a ticket to the customer. The ticket contains:
   - Vehicle information
   - Assigned parking space
   - Arrival date and time

3. **Entry Management:**  
   The system opens the entry barrier once a ticket is issued and updates the parking display board to reflect the available spaces.

4. **Parking:**  
   Customers park their vehicles in the assigned parking space.

5. **Exit Management & Billing:**  
   Upon exiting, the customer scans the ticket, and the system generates an invoice based on the duration of parking.

6. **Payment Options:**  
   Customers can pay using cash, card, or any other available payment method.

7. **Exit Barrier Control:**  
   The exit gate opens once the payment is received, and the system updates the display board to reflect the newly available space.

## Assumptions

1. **Single Entry and Exit Point:**  
   The parking lot has a single entry and exit point.

2. **Admin Management:**  
   An administrator is responsible for managing and configuring the automated system.

## Design

### Class Diagrams

The system design follows object-oriented principles with classes representing key components of the system such as `ParkingLot`, `Ticket`, `Vehicle`, `ParkingSpace`, `Payment`, etc. Detailed class diagrams are included in the repository.

### Use Case Diagram

The use case diagram illustrates various user interactions such as parking a vehicle, scanning a ticket, making payments, and receiving updates on parking availability.

## How It Works

1. **Entry Process:**  
   - The customer drives to the entry point and checks the display for available parking.
   - The automated system assigns a slot and generates a ticket with relevant details.
   - The entry barrier opens, and the customer parks in the designated space.

2. **Exit Process:**  
   - The customer scans their ticket at the exit.
   - The system calculates the parking duration and generates an invoice.
   - Once the payment is processed, the exit barrier opens, and the display board updates the parking availability.

## Future Enhancements

- Implementing multiple entry and exit points.
- Adding support for electric vehicle (EV) charging stations.
- Integration with a mobile app for booking parking in advance.
- Dynamic pricing based on parking demand and duration.
