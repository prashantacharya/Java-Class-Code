package fundamentals;

interface Vehicle {
    void info();
}

class Car implements Vehicle {
    private String name;
    private int topSpeed;

    Car(String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    public void info() {
        System.out.printf("%s runs at the top speed of %d miles per hour.\n", name, topSpeed);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Car teslaRoadster = new Car("Tesla Roadster", 500);
        teslaRoadster.info();
    }
}
