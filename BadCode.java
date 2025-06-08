public class BadCode {
    public static void main(String[] args) {
        int unusedVar = 10; // Unused variable
        System.out.println("Hello World");
        if (unusedVar == 10) { // Redundant condition
            System.out.println("This is redundant");
        }
        String str = null;
        str.length(); // Null pointer risk
        int result = 5 / 0; // Arithmetic exception
    }
}
