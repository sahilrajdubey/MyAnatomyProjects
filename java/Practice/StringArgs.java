package Practice;
public class StringArgs {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Command line arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command line arguments provided.");
        }
    }
}
