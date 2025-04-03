package view;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Alfred
 */
public class CalculatorView extends JFrame
{

    private final JTextField txtNum1 = new JTextField(10);
    private final JTextField txtNum2 = new JTextField(10);
    private final JButton btnSumar = new JButton("Sumar");
    private final JLabel lblResultado = new JLabel("Resultado: ");

    public CalculatorView()
    {
        setTitle("Calculadora MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new FlowLayout());

        add(new JLabel("Número 1:"));
        add(txtNum1);
        add(new JLabel("Número 2:"));
        add(txtNum2);
        add(btnSumar);
        add(lblResultado);
    }

    public int getNumero1()
    {
        return Integer.parseInt(txtNum1.getText());
    }

    public int getNumero2()
    {
        return Integer.parseInt(txtNum2.getText());
    }

    public void setResultado(int resultado)
    {
        lblResultado.setText("Resultado: " + resultado);
    }

    public JButton getBotonSumar()
    {
        return btnSumar;
    }
}
