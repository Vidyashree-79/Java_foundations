public class Methods {

    public static void main(String[] args) {

        // Calling a void method
        greet();

        // Calling method with parameter
        printName("Java");

        // Calling method with return value
        int sum = add(10, 20);
        System.out.println(sum);
    }

    // Simple void method
    static void greet() {
        System.out.println("Hello User");
    }

    // Method with parameter
    static void printName(String name) {
        System.out.println(name);
    }

    // Method with return value
    static int add(int a, int b) {
        return a + b;
    }
}

