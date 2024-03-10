package OOP_Training;

import java.util.Scanner;

public class NewInput {
    public static float readNum() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return scanner1.nextFloat();
    }

    public static Operation readOperation() {
        boolean b = true;
        Operation operation = null;
        while (b) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Choose a. Add, b. Subtract, c. Multiply, or d. Divide");
            String opsStr = scanner2.next();
            b = false;
            switch (opsStr) {
                case ("a"):
                    operation = Operation.ADD;
                    break;
                case ("b"):
                    operation = Operation.SUBTRACT;
                    break;
                case ("c"):
                    operation = Operation.MULTIPLY;
                    break;
                case ("d"):
                    operation = Operation.DIVIDE;
                    break;
                default:
                    b = true;
            }
        }
        return operation;
    }
}
