# ATM Interface

This Java project simulates an ATM interface allowing users to perform basic banking operations such as checking balance, depositing, and withdrawing money.

## Classes

### 1. `ATM`
- **Description:** Represents the ATM machine.
- **Attributes:**
  - `userAccount`: Instance of `BankAccount` associated with the user.
- **Methods:**
  - `displayMenu()`: Displays the menu of available operations.
  - `startATM()`: Starts the ATM system and prompts the user to enter a code number. Upon successful authentication, the user can perform various operations such as checking balance, depositing, and withdrawing money.

### 2. `BankAccount`
- **Description:** Represents a bank account.
- **Attributes:**
  - `balance`: Current balance in the account.
- **Methods:**
  - `deposit(double amount)`: Deposits the specified amount into the account.
  - `withdraw(double amount)`: Withdraws the specified amount from the account.
  - `checkBalance()`: Returns the current balance in the account.

### 3. `ATMInterface`
- **Description:** Contains the main method to run the ATM interface.
- **Methods:**
  - `main(String[] args)`: Instantiates a `BankAccount` and an `ATM` object, and starts the ATM system.

## How to Run

Compile the Java files and run the `ATMInterface` class.

## Grading System

This Java project implements a grading system where users can input grades for subjects and obtain statistics such as the sum, average, highest grade, and lowest grade.

## Classes

### 1. `GradingSystem`
- **Description:** Implements the grading system.
- **Methods:**
  - `getSum(int num, int[] array)`: Calculates the sum of grades.
  - `getAvg(int num, int[] array)`: Calculates the average of grades.
  - `getMax(int num, int[] array)`: Finds the highest grade.
  - `getMin(int num, int[] array)`: Finds the lowest grade.
  - `main(String[] args)`: Contains the main method to run the grading system.

## How to Run

Compile the Java file and run the `GradingSystem` class.

## Student Management System

This Java project implements a simple student management system where users can add, remove, search for, and display students.

## Classes

### 1. `Student`
- **Description:** Represents a student.
- **Attributes:**
  - `name`: Name of the student.
  - `rollNumber`: Roll number of the student.
  - `grade`: Grade of the student.
- **Methods:**
  - `getName()`: Returns the name of the student.
  - `getRollNumber()`: Returns the roll number of the student.
  - `getGrade()`: Returns the grade of the student.
  - `toString()`: Returns a string representation of the student.

### 2. `StudentManagementSystem`
- **Description:** Implements the student management system.
- **Attributes:**
  - `students`: List of students.
- **Methods:**
  - `addStudent(Student student)`: Adds a student to the system.
  - `removeStudent(int rollNumber)`: Removes a student from the system.
  - `searchStudent(int rollNumber)`: Searches for a student by roll number.
  - `displayAllStudents()`: Displays information of all students.

### 3. `StudentManegementSys`
- **Description:** Contains the main method to run the student management system.

## How to Run

Compile the Java file and run the `StudentManegementSys` class.

## License

This project is licensed under the MIT License.

## Author

- Mohamad Nasser

## Feedback

If you have any feedback or questions, please feel free to mhmdnaser1572@gmail.com . 
