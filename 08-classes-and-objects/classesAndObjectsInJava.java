class Student {

    int age;
    String name;

    void study() {
        System.out.println("Student is studying");
    }
}

public class ClassesObjects {

    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student();

        // Assigning values
        s1.age = 20;
        s1.name = "Rahul";

        // Accessing values
        System.out.println(s1.age);
        System.out.println(s1.name);

        // Calling method
        s1.study();

        // Creating second object
        Student s2 = new Student();
        s2.age = 22;
        s2.name = "Amit";

        System.out.println(s2.age);
        System.out.println(s2.name);
    }
}
