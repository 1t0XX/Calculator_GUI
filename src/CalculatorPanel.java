import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorPanel extends JPanel {

    public CalculatorPanel() {
        setLayout(new BorderLayout());

        //панель ввода

        JPanel insertPanel = new JPanel();
        insertPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;

        JLabel labelArgument1 = new JLabel("Аргумент 1");
        c.gridx = 0;
        c.gridy = 0;
        insertPanel.add(labelArgument1 , c);

        JTextField argument1 = new JTextField(10);
        c.gridx = 1;
        c.gridy = 0;
        insertPanel.add(argument1, c);


        JLabel labelArgument2 = new JLabel("Аргумент 2");
        c.gridx = 0;
        c.gridy = 1;
        insertPanel.add(labelArgument2 , c);

        JTextField argument2 = new JTextField(10);
        c.gridx = 1;
        c.gridy = 1;
        insertPanel.add(argument2, c);

        JLabel labelResult = new JLabel("Результат");
        c.gridx = 0;
        c.gridy = 2;
        insertPanel.add(labelResult , c);

        JTextField result = new JTextField(10);
        c.gridx = 1;
        c.gridy = 2;
        insertPanel.add(result, c);

        add(insertPanel , BorderLayout.CENTER);


        //панель клавиш

        JPanel controlPanel = new JPanel();
        JButton buttonAddition = new CalculatorButton("+");
        JButton buttonSubtraction = new CalculatorButton("-");
        JButton buttonDivision = new CalculatorButton("/");
        JButton buttonMultiply = new CalculatorButton("*");
        JButton buttonPower = new CalculatorButton("^");

        controlPanel.add(buttonAddition);
        controlPanel.add(buttonDivision);
        controlPanel.add(buttonMultiply);
        controlPanel.add(buttonPower);
        controlPanel.add(buttonSubtraction);

        add(controlPanel, BorderLayout.SOUTH);

        //обработчик событий

        ActionListener buttonListener = new CalculatorActionListener ( argument1 , argument2 , result);

        //навешиваем обработчики

        buttonAddition.addActionListener(buttonListener);
        buttonSubtraction.addActionListener(buttonListener);
        buttonDivision.addActionListener(buttonListener);
        buttonMultiply.addActionListener(buttonListener);
        buttonPower.addActionListener(buttonListener);

    }
}
