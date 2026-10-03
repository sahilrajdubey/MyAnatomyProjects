package Practice;
//Call by Reference
//java is not call by reference but it is call by value of reference
//java is call by value of reference because when we pass an object to a method, we are passing the reference of that object, but the reference itself is passed by value. This means that if we change the reference to point to a new object inside the method, it won't affect the original reference outside the method. However, if we modify the object's fields through the reference, those changes will be reflected outside the method.
public class CBR {
    public static void main(String[] args) {
         Random r1 = new Random(4, 5);
            addTen(r1);
            System.out.println("X: " + r1.x);
            System.out.println("Y: " + r1.y);
    }
            public static void addTen(Random r1){
                r1.x += 10;
                r1.y += 10;
            }
}
class Random{
    int x ;
    int y;
    Random(int x, int y){
        this.x = x;
        this.y = y;
    }
}
