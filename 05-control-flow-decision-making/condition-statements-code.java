public class DecisionMaking {

    public static void main(String[] args) {

        // if condition
        int age = 20;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        }

        // if-else condition
        int marks = 30;
        if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Nested if condition
        int score = 85;
        if (score >= 35) {
            if (score >= 75) {
                System.out.println("Distinction");
            }
        }

        // switch condition
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
