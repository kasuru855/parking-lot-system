# Low-Level Design (LLD): Object-Oriented Parking Lot Management System

A production-grade, highly modular Command Line Interface (CLI) application developed in Java. This repository demonstrates clean software engineering architectures, robust data modeling, and strict compliance with Object-Oriented Design (OOD) paradigms commonly evaluated in enterprise software engineering tracks.

---

##  Architectural Overview & Core Pillars
- **Inheritance & Polymorphism:** Leverages an abstract `Vehicle` base specification extended by concrete sub-classes (e.g., `Car`) to support clean, scalable type extension.
- **Data Encapsulation & Domain Separation:** Enforces rigorous data protection protocols across domain structures (`ParkingSlot`, `ParkingLot`) utilizing private state fields and explicit accessor paradigms.
- **Dynamic Array Inversion:** Employs optimized memory operations through native Java `List` collections to manage structural inventory and calculate immediate spot allocations.
- **Robust Enumerations:** Mitigates input string mutation and hardcoded parameters by strictly standardizing entity categories via structural `Enums`.

---

##  Tech Stack & Dependencies
* **Core Language:** Java (JDK 11+)
* **Version Control:** Git Engine
* **Cloud Hosting Platform:** GitHub

---

##  How to Run & Verify the Simulation

### Prerequisites
Ensure you have the Java Development Kit (JDK 11 or higher) configured on your local computer's runtime environment path variables.

### Local Execution Strategy
1. Clone or download this project repository repository container to your machine.
2. Open the source directory inside a Java-supported IDE (such as Visual Studio Code or IntelliJ IDEA).
3. Access the driver class file `Main.java`.
4. Run or execute the application main thread to launch the interactive loop directly inside your runtime terminal shell.
