# Number Guessing Game 🎯

A simple console-based number guessing game written in Java.  
The player tries to guess a randomly generated number within a limited number of attempts depending on the selected difficulty level.

Project idea: [Number Guessing Game](https://roadmap.sh/projects/number-guessing-game) from [roadmap.sh](https://roadmap.sh)

---

## 🚀 Features

- Three difficulty levels:
   - Easy (10 attempts)
   - Medium (5 attempts)
   - Hard (3 attempts)

- Random number generation (1–100)
- Feedback after each guess (too high / too low)
- Tracks number of attempts
- Game timer (time to complete a round)
- Option to replay the game
- Input validation with safe user input handling


---

## 🎮 How to Run

### 📌 Requirements

- Java 17+
- Maven 3.8+

---

### ⚙️ Using a script (Linux / WSL)
```
chmod +x guessing-game
./guessing-game
```

### ▶️ Run with Maven (recommended)

From the project root (where pom.xml is located):
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.etssu.guessing_game.App"
```

---
## 🕹️ How to Play
1. Choose difficulty level:
    * 1 → Easy
    * 2 → Medium
    * 3 → Hard
2. Try to guess the secret number between 1 and 100.
3. After each guess you will receive a hint: * "Higher" if the number is bigger * "Lower" if the number is smaller
4. Win by guessing the number within limited attempts.
5. At the end you will see: * Number of attempts used * Time taken to complete the game
   
--- 
### 📌 Notes 

This project was built for learning purposes to practice:

* OOP design
* Separation of responsibilities
* Clean code structure
* Basic game loop implementation
