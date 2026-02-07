public class TypeCasting {

    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int a = 10;
        double b = a;
        System.out.println(b);

        // Explicit Type Casting (Narrowing)
        double x = 20.75;
        int y = (int) x;
        System.out.println(y);

        // Char to Int Conversion
        char ch = 'A';
        int value = ch;
        System.out.println(value);
    }
}
