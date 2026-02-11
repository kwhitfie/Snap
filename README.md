# Java Project - Snap 


##  How to Play

This version of **Snap** is a **two-player, turn-based command-line game** focused on reaction time.
Pay close attention to the card suits and be ready to react quickly

### Starting the Game
- Run the program via the **main.java** class to begin.
- The deck is automatically shuffled.
- **Player 1 goes first**.
- Press **ENTER** to draw a card on your turn.

---

### Gameplay Flow
1. Players take turns drawing cards by pressing **ENTER**.
2. Each drawn card is displayed on the screen.
3. The game keeps track of the **previous card** and the **current card**.

---

### Calling “Snap”
- A *Snap* occurs when **two consecutive cards have the same suit**.
- When this happens, players must quickly type `snap` and press **ENTER**.

### Reaction Time Rule 
- Once a matching pair appears, the active player has **2 seconds** to type `snap`.
- Outcomes:
    -  Typed `snap` within 2 seconds → **You win**
    -  Typed `snap` after 2 seconds → **Other player wins**
    -  Typed anything else → **Other player wins**

---

### False Snap Penalty
- Typing `snap` **when the cards do not match** immediately ends the game.
- The **other player automatically wins**.
- This prevents players from spamming `snap` every turn.

---

### Winning the Game
- The game ends immediately when:
    - A correct snap is called in time, **or**
    - A player makes a mistake (false snap or slow reaction).
- The winner is announced in the console.

---

## How to run

The game is run by executing the `Main.java` class, which starts the Snap game, ensuring you have Java installed on your machine

##  Contributing

Contributions are welcome! Whether you’re fixing bugs, improving documentation, or adding new features, your help is appreciated.

---

### How to Contribute

1. **Fork the repository**
    - Click the **Fork** button at the top of this repository.

2. **Clone your fork**
   ```bash
   git clone https://github.com/<your-username>/Snap.git
   cd Snap

3. **Create a new branch**
   ```bash
   git checkout -b feature/your-feature-name
   
4. **Commit and push your changes**
    ```bash
   git commit -m "Add: brief description of your change"
   git push origin feature/your-feature-name
   
5. **Open a Pull Request**
   
- Go to the original Snap repository on GitHub.

- Click New Pull Request.

- Clearly describe what your change does and why it’s needed.