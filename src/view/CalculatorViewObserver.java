package view;

import javax.swing.*;
import java.awt.*;
import model.CalculatorObserver;

/**
 *
 * @author Alfred
 */
public class CalculatorViewObserver extends JFrame implements CalculatorObserver
{

    private final JTextField txtNum1 = new JTextField(10);
    private final JTextField txtNum2 = new JTextField(10);
    private final JButton btnSumar = new JButton("Sumar");
    private final JLabel lblResultado = new JLabel("Resultado: 0");

    public CalculatorViewObserver()
    {
        setTitle("Calculadora con Observer");
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

    public JButton getBotonSumar()
    {
        return btnSumar;
    }

    @Override
    public void actualizar(int resultado)
    {
        lblResultado.setText("Resultado: " + resultado);
    }
}
