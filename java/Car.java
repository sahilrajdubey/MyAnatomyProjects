//Abstract class cannot be instantiated. It can have abstract methods and concrete methods. Abstract methods are declared without an implementation. Concrete methods have an implementation. A subclass of an abstract class must implement all the abstract methods of the superclass, or it must also be declared abstract.
abstract public class Car {
    public static void main(String[] args) {
        Car c1 = new EC();
        Car c2 = new FC();
        c1.start();
        c1.accelerate();
        c2.start();
        c2.accelerate();
    }
    // declare an abstract method start() without implementation. Subclasses must provide an implementation for this method.
    abstract public void start();
    // declare an abstract method accelerate() without implementation. Subclasses must provide an implementation for this method.
    abstract public void accelerate();
}
class EC extends Car {
    public void start() {
        System.out.println("EC is starting");
    }
    public void accelerate() {
        System.out.println("EC is accelerating");
    }
}
class FC extends Car {
    public void start() {
        System.out.println("FC is starting");
    }
    public void accelerate() {
        System.out.println("FC is accelerating");
    }
}