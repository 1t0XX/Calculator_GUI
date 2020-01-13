import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorActionListener implements ActionListener {

    JTextField argument1;
    JTextField argument2;
    JTextField result;

    public CalculatorActionListener(JTextField arg1, JTextField arg2, JTextField res){

    argument1 = arg1;
    argument2 = arg2;
    result = res;
}

 @Override

    public void actionPerformed(ActionEvent e) {

     double double1 = 0;
     double double2 = 0;

     if (!argument1.getText().equals("")) {
         double1 = Double.valueOf(argument1.getText());
     }
     if (!argument2.getText().equals("")) {
         double2 = Double.valueOf(argument2.getText());

     }

     double resultValue = 0.0;

     CalculatorButton targetButton = (CalculatorButton) e.getSource();

     switch (targetButton.getOperation()) {

         case "+":
             resultValue = double1 + double2;
             break;
         case "-":
             resultValue = double1 - double2;
             break;
         case "/":
             resultValue = double1 / double2;
             break;

         case "*":
             resultValue = double1 * double2;
             break;

         case "^":
             resultValue = Math.pow(double1, double2);
             break;
     }

     result.setText(Double.toString(resultValue));

     }
 }