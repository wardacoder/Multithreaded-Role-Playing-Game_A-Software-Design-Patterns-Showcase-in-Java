# Multithreaded Role-Playing Game Engine – A Software Design Patterns Showcase in Java

**Java-based multithreaded role-playing game (RPG) engine** showcasing **professional software architecture**.  
Implements **Observer, Singleton, Template Method, Strategy, State, and Command** software design patterns, with concurrent threads for battle timing and real-time **gyroscope, accelerometer, and sound** input.  
All execution is synchronized and thread-safe for accuracy and performance.
This project is a part of the Software Design for Engineers coursework.

---

## 📖 Overview

**Hogwarts: A Journey Through Time** is a **text-based adventure RPG** with a **time-travel storyline** set in the Harry Potter universe.  
Players explore multiple eras, battle legendary characters, and use interactive spells triggered by **real-time sensor data**.

Key highlights:
- **Multiple scenes & battles**: From the Hogwarts founders’ duel to the Grindelwald battle to the final showdown with Voldemort.
- **Customizable strategy**: Choose attacks, brew potions, and manage resources.
- **Sensors as gameplay mechanics**: Perform spells via phone gestures and voice input.
- **Clean, extensible architecture** with **six major design patterns**.

🎥 **Demo Playlist:** [YouTube](https://www.youtube.com/playlist?list=PLa33B7Q7GDot3L961OvjiXvq9no3395br)

---

## 🎯 Objective

To cohesively integrate **multiple OOP design patterns**, **multithreading**, and **sensor input** into a fun, extensible Java-based RPG.

---

## 🗂 Project Structure

```text
Software-Design-for-Engineers/
├── Main.java
├── battles/
│   ├── Battle.java
│   ├── FinalBattle.java
│   ├── GrindlewaldBattle.java
│   └── SlytherinBattle.java
├── characters/
│   ├── Character.java
│   ├── Enemy.java
│   └── Player.java
├── commands/
│   ├── AvadaKedavra.java
│   ├── Command.java
│   ├── Expelliarmus.java
│   └── Lumos.java
├── core/
│   ├── Clock.java
│   ├── Context.java
│   ├── GameLogic.java
│   └── Message.java
├── items/
│   ├── potions/
│   │   ├── Potion.java
│   │   ├── Veritaserum.java
│   │   └── Wolfsbane.java
│   └── weapons/
│       └── Wand.java
├── observer/
│   ├── ConcreteObserver.java
│   ├── ConcreteSubject.java
│   ├── Observer.java
│   └── Subject.java
├── sensors/
│   ├── AvadaKedavraSensor.java
│   ├── ExpelliarmusSensor.java
│   ├── LumosSensor.java
│   └── Sensor.java
├── state/
│   ├── Act.java
│   ├── Intro.java
│   ├── State.java
│   ├── firstAct.java
│   ├── secondAct.java
│   └── thirdAct.java
└── strategy/
    └── AttackStrategy.java
```

---

## 🛠 Implemented Software Design Patterns

### 1. Observer + Singleton
Purpose: Time-bound battles using a `Clock` subject notifying `Battle` observers.  
`Player` implemented as **Singleton** — only one instance exists.

```java
// Clock (Subject)
public class Clock extends ConcreteSubject implements Runnable {
    int minutes;
    public void run() {
        while(true) {
            try {
                Thread.sleep(60 * 100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            minutes++;
            publishMessage(new Message("⏰", "timing update", minutes));
        }
    }
}

// Singleton Player
public static synchronized Player getInstance(String name, int maxHp) {
    if (instance == null) {
        instance = new Player(name, maxHp);
    }
    return instance;
}
```

---

### 2. Template Method
Purpose: Potion creation steps are fixed; subclasses vary ingredients/effects.

```java
// Abstract Template
public abstract class Potion {
    final void preparePotion() {
        addIngredient();
        Brew();
        stirAndBoil();
    }
    abstract void addIngredient();
}

// Concrete Implementation
public class Wolfsbane extends Potion {
    void addIngredient() {
        System.out.println("Adding Wolf Elixir...");
        pl.hp = Math.min(pl.hp + 80, 100);
    }
}
```

---

### 3. Strategy
Purpose: Encapsulates different attack styles for `Player` and `Enemy`.

```java
// Strategy Interface
public interface AttackStrategy { 
    int attack(); 
}

// Concrete Strategy
public class Enemy implements AttackStrategy {
    public int attack() {
        return new java.util.Random().nextInt(21) + 10;
    }
}
```

---

### 4. State
Purpose: Scene transitions (`Intro` → `Act I` → `Act II` → `Act III`).

```java
// State Interface
public interface State {
    void next(Context context);
    void printIntro();
    void printOutro();
}
```

---

### 5. Command
Purpose: Encapsulates spells in `Wand` with gesture/voice-triggered execution.

```java
// Concrete Command
public class AvadaKedavra implements Command {
    public int execute() {
        new AvadaKedavraSensor("192.168.101.120", 2000);
        return 100;
    }
}
```

---

## ⚡ Multithreading

- **Clock Thread:** Runs independently to time battles.  
- **Sensor Threads:** Separate threads for gyroscope, accelerometer, and sound input.  
- **Thread Safety:** `synchronized` methods (e.g., `readSensor`) to prevent race conditions.  

---

## 📱 Sensor Integration

| Sensor        | Spell           | Trigger Mechanism | Threshold   |
|---------------|-----------------|-------------------|-------------|
| Sound         | Lumos           | Say "Lumos"       | > -4 dB     |
| Gyroscope     | Avada Kedavra   | Rotate device     | ±7 rad/s    |
| Accelerometer | Expelliarmus    | Shake left/right  | ±2 m/s²     |


---

## 📌 Key Engineering Takeaways

- Demonstrates synchronous and asynchronous processing in a game loop.  
- Uses thread-safe synchronization for hardware I/O.  
- Models complex gameplay mechanics through reusable software design patterns.  
- Provides a maintainable architecture for expanding game features without altering the core engine.  
