import javax.swing.*;

public class CalculatorApp extends JFrame {

    public CalculatorApp(){
        super("Калькулятор");

        this.setBounds(500, 500, 400, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        CalculatorPanel panel = new CalculatorPanel();

        setContentPane(panel);
        setVisible(true);
    }
}
