package StudentExample;

import functionalInterfaceExample.*;

import java.util.*;

public class Main {
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer's tea time");

    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job!");
        announceDeveloperTeaTime();
        int studentAge = 15;
        double studentGPA = 3.4;
        String studentFirstName = "Becky";
        String studentLastName = "Gemn";
        char studentFNInitial = studentFirstName.charAt(0);
        char studentLNInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;
        Student student1 = new Student(studentAge, studentFNInitial, studentLNInitial, studentGPA, hasPerfectAttendance);

        Student s1 = null;
        Student s2 = null;

        double salaryWorkerOne = Salary.yearlySalary(40, 25, 25);
        System.out.println("Will's yearly salary is " + salaryWorkerOne);
        Triangle triangle1 = new Triangle (15, 12, 23,24, 76);
        double triangle1Area = triangle1.findArea();
        System.out.println(Triangle.noOfSides);

        StudentProfile profile1 = new StudentProfile("Sam", "Smith", 2026, 3.9, "Chemical Engineering");
        int profile1GradYear = profile1.incrementGraduationYear();
        System.out.println(profile1GradYear);

        GreetingMessage gm = (String name) -> {
            System.out.println("Hello " + name);
        };

        gm.greet("Bao");

        Square s = new Square(4);
        Shape shape = Square::calculateArea;
        System.out.println("Area of a square with side length of " + s.sideLength + " is " + shape.getArea(s));
        ArrayList<Book> libraryBooks = Library.buildLibrary();
        libraryBooks.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("A");
        }).filter(book -> {
            return book.getTitle().startsWith("P");
                }).forEach(System.out::println);

        libraryBooks.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("A");
        }).filter(book -> {
            return book.getTitle().startsWith("P");
        }).forEach(book -> System.out.println(book.getTitle()));

/*
        Collection c1;
        List l1;
        Map m1;
        Set s3;
        HashMap hm1;
        TreeMap tm1;
        HashSet hs1;
        TreeSet ts1;

        HashMap<Integer, Student> map = new HashMap<>();
        map.put(101, s1);
        map.put(202, s2);

        map.get(202);

        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        Scanner scanner = new Scanner(System.in);
        double result = Math.pow(2.5, 13);
        System.out.println(result);

        for (Student s : hs1) {
            if (s.id == 3) {
                System.out.println(s);

                System.out.println(student1);
            }
        }

 */
    }
}