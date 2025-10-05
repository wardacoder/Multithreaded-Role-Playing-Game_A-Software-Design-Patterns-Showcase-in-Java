# Multithreaded RPG – A Software Design Patterns Showcase in Java

A **Java-based multithreaded software architecture** demonstrating advanced **object-oriented programming**, **concurrent processing**, **software design pattern implementation**, and **socket programming**.  
The project integrates **Observer, Singleton, Template Method, Strategy, State, and Command** design patterns within a synchronized, thread-safe system handling real-time inputs from **gyroscope, accelerometer, and sound sensors**.

Developed as part of the *Software Design for Engineers* coursework, this project simulates an **interactive, text-based RPG environment** as a creative medium to showcase **professional software design** and **concurrency techniques**.

---

## 📖 Overview

**Hogwarts: A Journey Through Time** is a **text-based adventure simulation** using **real-time sensor inputs** to trigger gameplay logic.  
While presented as an RPG setting, the project’s primary goal is to demonstrate **multithreaded synchronization**, **pattern-based architecture**, and **real-time event handling** in Java.

**Key highlights:**
- Modular and extensible **object-oriented design**  
- Integration of **six major software design patterns**  
- Real-time **sensor input processing** (gyroscope, accelerometer, sound)  
- Thread-safe architecture ensuring synchronized execution  

🎥 **Demo Playlist:** [YouTube](https://www.youtube.com/playlist?list=PLa33B7Q7GDot3L961OvjiXvq9no3395br)

---

## 🎯 Objective

To design and implement a **modular, multithreaded Java architecture** that cohesively integrates **object-oriented design patterns**, **real-time sensor input**, and **concurrent execution**, demonstrating robust **OOP** and **system design** capabilities.

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
