package OOP_Training;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MathHelper {
    private float num = 1;
    private static float total;
    Operation operation;

    public MathHelper(float num, Operation operation) {
        this.operation = operation;
        this.num = num;
        doMath();
    }

    public void getTotal() {
        String message = String.format("%s %s to current Total, to get: %s.", operation.toString(), num, total);
        System.out.println(message);
    }

    public void doMath() {
        switch (operation) {
            case ADD:
                total += num;
                break;
            case SUBTRACT:
                total -= num;
                break;
            case MULTIPLY:
                total *= num;
                break;
            case DIVIDE:
                try {
                    float div = (total / num);
                    if ((div == Float.POSITIVE_INFINITY) || (div == Float.NEGATIVE_INFINITY) || (Float.isNaN(div))) {
                        throw new ArithmeticException();
                    } else {
                        total /= num;
                        break;
                    }
                } catch (ArithmeticException e) {
                    Logger.getLogger(MathHelper.class.getName()).log(Level.WARNING, "Division error occurred");
                }
        }
    }
}
