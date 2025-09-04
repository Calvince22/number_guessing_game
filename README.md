# 🎲 Java Number Guessing Game

A simple console-based number guessing game written in **Java**.  
The computer generates a random number between **1 and 100**, and the player has to guess it.  
Hints are given (`Too high` / `Too low`), and the game counts the number of attempts.

---

## 🚀 Features
- Random number between 1–100
- Input validation (no crash on invalid input)
- Feedback after each guess
- Tracks total attempts

---

## 📂 Project Structure
.
├── NumberGuess.java # Main game source code
└── README.md # Documentation

yaml
Copy code

---

## ⚙️ Requirements
- Java JDK 8+  
- Text editor or IDE (e.g., VS Code, IntelliJ IDEA, Eclipse)

---

## 🖥️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/number-guess-game.git
   cd number-guess-game
Compile the program

```bash

javac NumberGuess.java
Run the game 
```

```bash

java NumberGuess
```

📝 Example Gameplay
```bash

🎲 Welcome to Number Guessing Game!
I'm thinking of a number between 1 and 100...
Enter your guess: 50
⬆️ Too low, try again!
Enter your guess: 75
⬇️ Too high, try again!
Enter your guess: 63
✅ Correct! The number was 63
You guessed it in 3 attempts.
```

## 🔧 Common Issues & Fixes
1. Program crashes on text input → Fixed using scanner.hasNextInt()

2. Random number not in correct range → Fixed with random.nextInt(100) + 1

## 📚 References

- [Java Documentation](https://docs.oracle.com/en/java/)
- [W3Schools Java Tutorial](https://www.w3schools.com/java/)
- [Java Code Conventions (Oracle)](https://www.oracle.com/java/technologies/javase/codeconventions-introduction.html)
- [Java Beginner Projects on YouTube](https://www.youtube.com/results?search_query=java+beginner+projects)


👩‍💻 Author: Caleb Kiptoo
📅 Date: 2025