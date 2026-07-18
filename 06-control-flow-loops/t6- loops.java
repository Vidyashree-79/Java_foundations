public class Loops {

    public static void main(String[] args) {

        // for loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("For loop: " + i);
        }

        // while loop
        int j = 1;
        while (j <= 3) {
            System.out.println("While loop: " + j);
            j++;
        }

        // do-while loop
        int k = 1;
        do {
            System.out.println("Do-while loop: " + k);
            k++;
        } while (k <= 3);

        // break statement
        for (int x = 1; x <= 5; x++) {
            if (x == 3) {
                break;
            }
            System.out.println("Break example: " + x);
        }

        // continue statement
        for (int y = 1; y <= 5; y++) {
            if (y == 3) {
                continue;
            }
            System.out.println("Continue example: " + y);
        }
    }
}
