# 🎲 Simple Number Guessing Game Using Java  

## 1. Title & Objective  
**Technology**: Java Programming Language  

**Project Title**: Number Guessing Game  

**Why I chose Java**: Java makes it easy to build console applications that run anywhere.  

**End Goal**: Create a command-line game where the computer randomly picks a number, and the player tries to guess it.  

---

## 2. Quick Summary of the Technology  

**What is Java?**  
Java is a platform-independent, object-oriented programming language used in mobile, web, and enterprise apps.  

**Where is it used?**  
- Mobile apps (Android)  
- Web services  
- Desktop applications  

**Real-world example**: Eclipse IDE itself is written in Java.  

---

## 3. System Requirements  
- **OS**: Windows, macOS, or Linux  
- **Tools**: JDK 11+, Terminal/Command Prompt, or VS Code/IntelliJ  
- **Packages**: None (uses standard Java libraries only)  

---

## 4. Installation & Setup Instructions  

1. **Install Java (JDK):**  
   [Download JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/).  

2. **Verify Installation:**  
   ```bash
   java --version
   javac --version
3. **Create Project Folder:**
    ```bash
    mkdir NumberGuessGame
    cd NumberGuessGame

## 5. Minimal Working Example
## What the Example Does

1. Computer generates a random number between 1 and 100.

2. Player guesses until correct.

3. Hints are given: too high / too low.

4. Program counts number of attempts.

Code (NumberGuess.java)
```bash
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1; // Random number 1-100
        int guess = 0;
        int attempts = 0;

        System.out.println("🎲 Welcome to Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100...");

        // Keep guessing until correct
        while (guess != target) {
            System.out.print("Enter your guess: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("❌ Please enter a valid number!");
                scanner.next(); // Clear invalid input
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("⬆️ Too low, try again!");
            } else if (guess > target) {
                System.out.println("⬇️ Too high, try again!");
            } else {
                System.out.println("✅ Correct! The number was " + target);
                System.out.println("You guessed it in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
```

How to Run
```bash
javac NumberGuess.java
java NumberGuess
```

Expected Output
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
## 6. AI Prompt Journal

## Prompt 1: “Write a Java console number guessing game with random numbers and user input.”

AI Response: Gave a clean structure with Random and Scanner.

Evaluation: Very helpful, immediate working code.

## Prompt 2: “How do I handle invalid user input in Java Scanner?”

AI Response: Suggested using scanner.hasNextInt() and clearing invalid input with scanner.next().

Evaluation: Great improvement — now the program doesn’t crash on text input.

## Prompt 3: “How can I track number of attempts in the guessing game?”

AI Response: Suggested using a counter variable and incrementing on each guess.

Evaluation: Simple but effective — improved game feedback.

## 7. Common Issues & Fixes

Issue: Program crashes if user enters text.

Fix: Use scanner.hasNextInt() before reading numbers.

Issue: Random number sometimes seems too high/low.

Fix: random.nextInt(100) + 1 ensures number is always 1–100.

## 8. References

### Official Documentation
- [Java Documentation](https://docs.oracle.com/en/java/)

### Learning Resources
- [W3Schools Java Tutorial](https://www.w3schools.com/java/)
- [Java Code Conventions (Oracle)](https://www.oracle.com/java/technologies/javase/codeconventions-introduction.html)
- [Java Beginner Projects on YouTube](https://www.youtube.com/results?search_query=java+beginner+projects)

### Tools
- [VS Code with Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
