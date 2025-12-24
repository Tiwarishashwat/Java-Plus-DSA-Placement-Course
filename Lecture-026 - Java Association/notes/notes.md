# Association, Aggregation, and Composition in Java

## 1. Association
- **Definition:** Association represents a relationship between two separate classes that are established through their objects.
- It defines how two classes are related to each other.
- **Example:** A `Teacher` and a `Student` are associated because a teacher teaches students.

### Types of Association:
1. **Aggregation** (weak relationship / "has-a")
2. **Composition** (strong relationship / "part-of")

---

## 2. Aggregation
- **Definition:** Aggregation is a special form of association where one class contains a reference to another class, but both can **exist independently**.
- It represents a **“Has-a” relationship**.
- The contained object can live even if the container object is destroyed.

### Example: Car and Music Player
- A `Car` has a `MusicPlayer`.
- Even if the `Car` is destroyed, the `MusicPlayer` can exist separately.

```java
class MusicPlayer {
    void play() {
        System.out.println("Playing music...");
    }
}

class Car {
    MusicPlayer player; // aggregation

    Car(MusicPlayer player) {
        this.player = player;
    }

    void start() {
        System.out.println("Car started");
        player.play();
    }
}
```

## 3. Composition

Definition: Composition is a stronger form of association where one class owns another class. The lifetime of the contained object depends on the container object.

It represents a “Part-of” relationship.

If the container is destroyed, the contained object also gets destroyed.

Example: Car and Engine

A Car has an Engine.

If the Car is destroyed, the Engine cannot exist independently.

```java
class Engine {
    void run() {
        System.out.println("Engine running...");
    }
}

class Car {
    private Engine engine; // composition

    Car() {
        engine = new Engine(); // created inside
    }

    void start() {
        engine.run();
        System.out.println("Car is moving...");
    }
}

```

Summary:

- Use Aggregation when both objects can exist independently.

- Use Composition when the contained object cannot exist without the container.