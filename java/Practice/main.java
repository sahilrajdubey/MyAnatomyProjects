package Practice;
public class main {
        public static void main(String[] args) {
            //Integers
            byte byteValue = 0b101;
            short shortValue = 10000;
            int intValue = 100000;
            long longValue = 100000L;   

            //Real Numbers
            float floatValue = 10.5f;
            double doubleValue = 10.5d;

            System.out.println("Byte Value: " + byteValue);
            System.out.println("Short Value: " + shortValue);
            System.out.println("Int Value: " + intValue);
            System.out.println("Long Value: " + longValue); 
            System.out.println("Float Value: " + floatValue);
            System.out.println("Double Value: " + doubleValue); 

            //operators in java 
            //aruthmetic operators
            int a = 10;
            int b = 5;
            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Division: " + (a / b)); 
            System.out.println("Modulus: " + (a % b));

            //preincrement and post increment
            int c = 10;
            int d = c++; // d = c (first assigned) and c = c+1; (then incremented)
            System.out.println("Post Increment: " + c + " " + d);
            int e = ++c; // e = c+1 (first incremented) and c = c+1; (then assigned)
            System.out.println("Pre Increment: " + c + " " + e);

            //Relational Operators
            System.out.println("Equal to: " + (a == b)); //double equal sign is used to compare two values
            System.out.println("Not Equal to: " + (a != b));
            System.out.println("Greater than: " + (a > b)); 
            System.out.println("Less than: " + (a < b));
            System.out.println("Greater than or equal to: " + (a >= b));
            System.out.println("Less than or equal to: " + (a <= b));
            
            //Bitwise Operators
            System.out.println("Bitwise AND: " + (a & b));
            System.out.println("Bitwise OR: " + (a | b));
            System.out.println("Bitwise XOR: " + (a ^ b));
            System.out.println("Bitwise NOT: " + (~a));
            System.out.println("Bitwise Left Shift: " + (a << 1));
            System.out.println("Bitwise Right Shift: " + (a >> 1));
            System.out.println("Bitwise Unsigned Right Shift: " + (a >>> 1));

            //Arrays
            int[] arr = new int[5];
            for (int i = 0; i < arr.length; i++){
                arr[i] = i * 10;
                System.out.println("Array Element " + i + ": " + arr[i]);
            }
            
            //Calling functions
            noInputNoOutput();
            inputNoOutput("John");
            int result1 = noInputOutput();
            System.out.println("No Input and Output: " + result1);
            int result2 = inputOutput(10, 20);
            System.out.println("Input and Output: " + result2);
        }   
        
        
        //Functions in java
        //No input and no output
        public static void noInputNoOutput(){
            System.out.println("This function has no input and no output"); 
        }

        //input and No output
        public static void inputNoOutput(String name){
            System.out.println("Hello" + " "+ name);
        }

        //No input and output
        public static int noInputOutput(){
            return 10;
        }
        
        //input and output
        public static int inputOutput(int a, int b){
            return a + b;
        }

}
