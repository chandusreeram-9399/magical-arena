# Magical Arena

## Overview
Magical Arena is a simple simulation game where two players battle each other based on their stats (health, strength, and attack). Players attack in turns, and each player's health is reduced based on the outcome of the dice rolls. The game ends when a player's health reaches zero.

This project also includes test cases to validate the functionality of different components, such as the Player class, Match class, and Dice roll mechanics.

---

## Components
This project is divided into multiple components, each responsible for specific tasks:

1. **Player Class** - Represents a player in the game with health, strength, and attack stats.
2. **Dice Class** - Simulates a dice roll to generate random values between 1 and 6.
3. **Match Class** - Handles the match logic between two players, including the attack and defense mechanics.
4. **Test Classes** - Contains unit tests for verifying the correctness of each class and their interactions.

---

## Directory Structure
```bash
Magical-Arena/
├── out/                      # Compiled class files
├── src/                      # Source files (main logic of the application)
│   ├── Dice.java             # Simulates dice roll (1-6)
│   ├── Match.java            # Handles match logic
│   └── Player.java           # Represents a player in the game
├── tests/                    # Test files
│   ├── DiceTest.java         # Unit tests for Dice class
│   ├── MatchTest.java        # Unit tests for Match class
│   └── PlayerTest.java       # Unit tests for Player class
├── libs/                     # JUnit and other libraries
│   └── junit-platform-console-standalone-1.11.3.jar # JUnit test runner
└── README.md                 # Project documentation
## Detailed Explanation of Each File

### 1. `Player.java`
This class represents a player in the game, with attributes such as `name`, `health`, `strength`, and `attack`. The player's health will decrease when they take damage.

**Key Methods:**
- `reduceHealth(int damage)`: Reduces the player's health by the given damage amount.
- `getHealth()`: Returns the current health of the player.
- `getName()`: Returns the name of the player.
- `getStrength()`: Returns the strength of the player.
- `getAttack()`: Returns the attack value of the player.

### 2. `Dice.java`
This class simulates the roll of a six-sided dice. The `roll()` method generates a random number between 1 and 6 to simulate the outcome of a dice roll.

**Key Methods:**
- `roll()`: Generates a random number between 1 and 6 to simulate a dice roll.

### 3. `Match.java`
The `Match` class handles the match mechanics between two players. It simulates the turn-based attacks and health calculation, determining the winner based on who reaches zero health first.

**Key Methods:**
- `startMatch()`: Starts the match between two players. The method simulates the attack and defense rounds, updating the players' health after each turn, and determines the winner when one player's health reaches zero.

### 4. **Test Files**
Test files are placed in the `tests/` directory. These files test the individual components of the game (such as the Player class, Dice class, and Match class) to ensure everything functions correctly.

#### 4.1. `PlayerTest.java`
This file contains unit tests for the `Player` class. It ensures that the health reduction mechanism works correctly and verifies the player's properties.

**Key Tests:**
- **testReduceHealth()**: Ensures that the player's health decreases by the correct amount when damage is applied.
- **testPlayerCreation()**: Ensures the player is created with the correct properties (name, health, strength, attack).

#### 4.2. `MatchTest.java`
This file contains unit tests for the `Match` class. It validates that the match can start successfully and that the correct player wins based on health and attack.

**Key Tests:**
- **testMatchStart()**: Ensures the match starts and runs without errors.
- **testPlayerAWin()**: Simulates a match where Player A wins and verifies that Player A's health reaches zero last.
- **testPlayerBWin()**: Simulates a match where Player B wins and verifies the health reduction mechanism.

#### 4.3. `DiceTest.java`
This file contains unit tests for the `Dice` class. It ensures that the dice roll generates a random number between 1 and 6.

**Key Tests:**
- **testDiceRoll()**: Ensures that the dice roll generates a value between 1 and 6.
## Libraries Used

This project makes use of the following libraries:

### 1. **JUnit (for Testing)**
- **Library**: [JUnit](https://junit.org/)
- **Version**: 5.x (JUnit Jupiter)
- **Purpose**: 
  JUnit is used for unit testing the game components, ensuring that the `Player`, `Dice`, and `Match` classes work correctly. JUnit provides an easy-to-use framework for writing and running tests to verify the functionality of various parts of the game logic.
  
- **How it is used**:
  - The `JUnit` library is included to run tests on various classes like `Player`, `Dice`, and `Match`.
  - The test classes (e.g., `PlayerTest.java`, `DiceTest.java`, `MatchTest.java`) use annotations like `@Test` to define test methods that verify the correctness of the game logic.
  - Tests are executed using the `JUnit Platform` command-line tool, which allows us to run all tests in a single batch.

### 2. **JUnit Platform Console Standalone (for Running Tests)**
- **Library**: [JUnit Platform Console](https://junit.org/junit5/docs/current/user-guide/#running-tests-console-launcher)
- **Version**: 1.x
- **Purpose**: 
  The `JUnit Platform Console` is used to run the tests in the project. It is a standalone command-line tool that launches the JUnit tests.
  
- **How it is used**:
  - The tool is used in the project to scan the compiled `.class` files and execute all test cases defined in the test classes.
  - It is invoked with the command:
    ```bash
    java -jar junit-platform-console-standalone-1.11.3.jar --class-path out --scan-class-path
    ```
  - This command runs all tests in the `out` directory (where compiled `.class` files are stored).

### 3. **JUnit Vintage (for Compatibility)**
- **Library**: [JUnit Vintage](https://junit.org/junit5/docs/current/user-guide/#vintage)
- **Version**: 5.x
- **Purpose**: 
  JUnit Vintage allows tests written with older versions of JUnit (such as JUnit 3 or 4) to be executed on the JUnit 5 platform. This ensures backward compatibility with older test code.

- **How it is used**:
  - This library is included to ensure that any legacy JUnit 3/4 tests can still be executed alongside JUnit 5 tests in this project.
  
### 4. **Java Standard Libraries**
- **Libraries**: Java `util` and `lang`
- **Version**: Java 8 (or higher)
- **Purpose**: 
  Java's standard libraries are used for general programming tasks such as string manipulation, random number generation, and data storage.
  
- **How it is used**:
  - `java.util.Random` is used for rolling the dice.
  - `java.util.Scanner` is used for reading player input from the console during the match.
  - Basic data types like `int` and `String` are used to represent player attributes and game logic.

### 5. **Maven (Optional, if used for Dependency Management)**
- **Library**: [Maven](https://maven.apache.org/)
- **Version**: Latest
- **Purpose**:
  Maven is an optional dependency management tool that can be used for building the project, managing dependencies, and running tests. If you're using Maven in your project, the `pom.xml` file will define the dependencies for JUnit and other libraries.
  
- **How it is used**:
  - Dependencies such as `JUnit`, `JUnit Vintage`, and any other external libraries would be added to the `pom.xml` file.
  - Maven commands can be used to build and run tests, e.g., `mvn test`.

