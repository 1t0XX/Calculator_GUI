import javax.swing.*;
import java.util.Arrays;

public class CalculatorButton extends JButton {

    private String operation;
    private static String[] availabelOperations = {"+", "-", "/", "*", "^"};

    public CalculatorButton(String userOperation) {
        super(userOperation);

        if (Arrays.asList(availabelOperations).contains((userOperation))) {
            operation = userOperation;
        } else {
            System.err.println("Попытка создать кнопку для несуществующей операции");
        }
    }

    public String getOperation() {
        return operation;
    }
}