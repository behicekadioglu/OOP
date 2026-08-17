# Java Object-Oriented Programming Coursework

A collection of Java projects developed for **CENG 211 — Object-Oriented Programming** at İzmir Institute of Technology.

The repository focuses on applying core object-oriented programming concepts through small domain-driven applications.

## Overview

The projects explore topics such as:

- object-oriented analysis and design
- domain modeling
- encapsulation
- inheritance and polymorphism
- collection structures
- file-based data loading
- separation of concerns
- layered application organization

The source code is organized into separate `data`, `domain`, and `presentation` packages where appropriate.

---

## Project 1 — Ticket Booking & Venue Management

The first assignment implements a ticket booking and venue management system.

The application models entities such as:

- customers
- tickets
- venue sections
- seats
- the venue itself

Customer information is loaded from a CSV file, and available tickets are assigned to customers.

The application also performs several queries related to venue operations.

### Features

- Customer data loading from CSV
- Ticket assignment
- Seat and section management
- Revenue analysis
- Occupancy-rate calculation
- Most expensive ticket lookup
- Highest-revenue section lookup
- Customer spending analysis
- Text-based venue visualization

### Main Domain Classes

```text
Customer
Ticket
Section
Venue
Query
```

### Project Structure

```text
G3_CENG211_HW1/
├── src/
│   ├── data/
│   ├── domain/
│   └── presentation/
├── customers.csv
└── README.md
```

The application entry point is:

```text
presentation.TicketBookingApplication
```

### Application Flow

The application follows a simple sequence:

```text
Customer Data
     │
     ▼
CSV File Reading
     │
     ▼
Customer Objects
     │
     ▼
Ticket Assignment
     │
     ▼
Venue & Section Management
     │
     ▼
Queries & Statistics
```

Customer information is read from the input file and converted into domain objects.

Tickets are then assigned from available venue sections and seats.

After the booking process, the application performs multiple queries to analyze the current state of the venue.

### Venue Queries

The project includes operations such as:

- finding the section with the highest revenue
- calculating total venue revenue
- calculating venue occupancy rate
- identifying the customer with the highest ticket spending
- finding the most expensive ticket
- displaying the venue layout

These operations demonstrate how domain objects can interact while keeping different responsibilities separated between classes.

---

## Project 2 — Grid-Based Game Domain Model

The second assignment explores object-oriented modeling through a grid-based game structure.

The project defines a game map, player state, scoring system, and several different map items with distinct responsibilities.

### Domain Concepts

The project includes classes such as:

```text
Map
MapPosition
Score
Scoreboard
Player
Coin
Diamond
Treasure
Mushroom
Booster
Breaker
```

The `map_items` package is used to model different objects that can exist on the game map.

### Project Structure

```text
G3_CENG211_HW2/
├── src/
│   ├── data/
│   ├── domain/
│   │   └── map_items/
│   └── presentation/
└── README.md
```

### Map Items

Different game elements are represented using individual classes.

Examples include:

- `Player`
- `Coin`
- `Diamond`
- `Treasure`
- `Mushroom`
- `Booster`
- `Breaker`

This structure allows different map objects to maintain their own state and behavior.

The project therefore serves as an exercise in modeling a larger domain using multiple interacting classes instead of placing the entire application logic inside a single class.

### Map Representation

The game map is represented using Java collection structures containing `MapItem` objects.

Conceptually:

```text
Map
│
├── MapPosition
│
└── MapItem
    ├── Player
    ├── Coin
    ├── Diamond
    ├── Treasure
    ├── Mushroom
    ├── Booster
    └── Breaker
```

The project also contains separate `Score` and `Scoreboard` classes for representing game scoring information.

> **Note:** The current `Game` entry point is minimal, while most of the implementation is represented through the underlying domain classes and object model.

---

## Object-Oriented Design

Across both assignments, the repository demonstrates several core object-oriented programming concepts.

### Encapsulation

Domain entities maintain their own state and behavior instead of relying entirely on procedural logic.

Classes represent individual concepts and expose methods that operate on their internal state.

### Domain Modeling

Real-world or game concepts are represented through dedicated classes.

Examples include:

```text
Customer
Ticket
Venue
Section
Player
Map
Scoreboard
```

This approach makes the program structure easier to understand and allows responsibilities to be distributed across multiple objects.

### Separation of Concerns

The projects organize responsibilities into separate packages:

```text
data
domain
presentation
```

Each package has a different purpose.

#### `data`

Responsible for data-related operations such as file reading.

#### `domain`

Contains the core entities and application logic.

#### `presentation`

Contains application entry points and coordinates interactions between the underlying domain objects.

This structure provides an early example of separating application responsibilities into different layers.

### Collections and Data Structures

Arrays and Java collection types are used to represent groups of objects and relationships between them.

Examples include:

- customer collections
- ticket collections
- venue sections
- map structures
- map items
- score-related structures

### Inheritance and Polymorphism

The second assignment uses a common map-item abstraction to represent different objects that can exist on the game map.

This allows related objects to share a common structure while maintaining their own individual behavior and properties.

---

## Technologies

### Language

- Java

### Programming Concepts

- Object-Oriented Programming
- Encapsulation
- Inheritance
- Polymorphism
- Domain Modeling
- Separation of Concerns
- Java Collections
- Arrays
- File I/O

### Data Handling

- CSV-based data processing
- File-based application input

### Development

- Git
- GitHub
- Visual Studio Code

---

## Repository Structure

```text
java-oop-coursework/
│
├── G3_CENG211_HW1/
│   │
│   ├── src/
│   │   ├── data/
│   │   ├── domain/
│   │   └── presentation/
│   │
│   ├── customers.csv
│   └── README.md
│
├── G3_CENG211_HW2/
│   │
│   ├── src/
│   │   ├── data/
│   │   ├── domain/
│   │   │   └── map_items/
│   │   └── presentation/
│   │
│   └── README.md
│
└── README.md
```

---

## Running the Projects

The projects are standard Java applications and can be compiled and executed using a Java development environment.

### Clone the Repository

```bash
git clone https://github.com/behicekadioglu/java-oop-coursework.git
cd java-oop-coursework
```

### Project 1

The main application class is:

```text
presentation.TicketBookingApplication
```

The project expects the required CSV input file to be available in the appropriate project directory.

### Project 2

The project contains:

```text
presentation.Game
```

as its current entry-point class.

Most of the second assignment focuses on the underlying domain model and class structure.

---

## Learning Outcomes

These projects were developed while studying object-oriented programming and helped reinforce concepts such as:

- translating requirements into classes
- defining relationships between objects
- separating application responsibilities
- creating domain models
- working with Java collections
- processing file-based data
- implementing reusable classes
- organizing larger Java programs into packages
- modeling behavior through interacting objects

The assignments represent early practical experience with designing software beyond small single-file programs.

---

## Academic Context

These projects were developed as part of **CENG 211 — Object-Oriented Programming** coursework at **İzmir Institute of Technology**.

The repository is kept as an academic portfolio demonstrating early experience with Java, object-oriented software design, domain modeling, and structured application development.

---

## Collaboration

These assignments were completed as group coursework.

Contributors and collaboration details are retained in the corresponding course materials where applicable.

The repository is presented as academic coursework rather than as an individual production software project.

---

## Author

**Behice Kadıoğlu**

Computer Engineering  
İzmir Institute of Technology

GitHub: [@behicekadioglu](https://github.com/behicekadioglu)
