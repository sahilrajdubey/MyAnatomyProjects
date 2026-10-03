public class Main {
    public static void main(String[] args) {
        Car c1 = new EC();
        Car c2 = new FC();
        c1.start();
        c1.accelerate();
        c2.start();
        c2.accelerate();
    }
}
//Abstract class cannot be instantiated. It can have abstract methods and concrete methods. Abstract methods are declared without an implementation. Concrete methods have an implementation. A subclass of an abstract class must implement all the abstract methods of the superclass, or it must also be declared abstract.  
interface Car {
    void start();
    void accelerate();
}  


class EC implements Car {
    public void start() {
        System.out.println("EC is starting");
    }
    public void accelerate() {
        System.out.println("EC is accelerating");
    }
}
class FC implements Car {
    public void start() {
        System.out.println("FC is starting");
    }
    public void accelerate() {
        System.out.println("FC is accelerating");
    }
}