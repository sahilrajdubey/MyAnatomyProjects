package Practice;

public class Inheritance {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.display();
        car c = new car();
        c.display();
        bike b = new bike();
        b.display();
    }
    
}
class vehicle{
    public void display(){
        System.out.println("This is a vehicle");
    }
}
class car extends vehicle{
    public void start(){
        System.out.println("Car is starting");
    }
}
class bike extends vehicle{
    public void tire(){
        System.out.println("Bike have two tires");
    }
}