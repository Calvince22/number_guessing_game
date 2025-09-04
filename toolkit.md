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

### Prompt 1: Basic Structure  
**Prompt Used:**  
"Write a Java console number guessing game with random numbers and user input."  

**AI Response Summary:**  
The AI provided a clean structure using `Random` to generate the target number and `Scanner` to read user guesses. It implemented a `while` loop to keep prompting until the correct number was guessed.  

**Evaluation:**  
✅ Very helpful — gave me a working game right away, and the loop logic made the program interactive.  

---

### Prompt 2: Input Validation  
**Prompt Used:**  
"How do I handle invalid user input in Java Scanner?"  

**AI Response Summary:**  
The AI suggested using `scanner.hasNextInt()` before reading the input and discarding invalid tokens with `scanner.next()`. This prevented the program from crashing when non-numeric input was entered.  

**Evaluation:**  
✅ Great improvement — the game became more user-friendly and resilient. I learned about input validation techniques in Java.  

---

### Prompt 3: Tracking Attempts & Feedback  
**Prompt Used:**  
"How can I track number of attempts and give hints (too high/too low) in the guessing game?"  

**AI Response Summary:**  
The AI recommended maintaining an `attempts` counter that increments each time the player guesses. It also suggested comparing the guess to the target and printing `"Too high"` or `"Too low"` hints accordingly.  

**Evaluation:**  
✅ Simple but powerful — added meaningful feedback and progress tracking, making the game more engaging.  

---
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
