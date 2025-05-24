# Final-State Programming

This project is a Java-based implementation of a finite state automaton (FSA) designed to recognize specific letters and languages. It serves as a practical application of automata theory concepts, commonly explored in computer science and formal language theory.

## Features

* **Letter Recognition**: Processes input strings to identify and validate specific letters based on defined state transitions.
* **Language Recognition**: Determines whether a given string belongs to a particular language by evaluating it against the automaton's rules.
* **Finite State Automaton Implementation**: Utilizes states, transitions, and acceptance conditions to model and analyze language patterns.

## Getting Started

### Prerequisites

* Java Development Kit (JDK) 8 or higher
* An IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VS Code)

### Installation

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/rayhanfay/final-state-programming.git
   ```

2. **Navigate to the Project Directory**:

   ```bash
   cd final-state-programming
   ```

3. **Compile the Java Files**:

   ```bash
   javac *.java
   ```

4. **Run the Program**:

   ```bash
   java Main
   ```

   *Note: Replace `Main` with the actual main class name if different.*

## Project Structure

* `State.java` – Defines the states of the automaton.
* `Transition.java` – Manages the transitions between states based on input symbols.
* `Automaton.java` – Encapsulates the logic for processing input strings and determining acceptance.
* `Main.java` – Contains the `main` method to execute the program.

*Note: The actual class names and structure may vary; please refer to the source code for specifics.*
