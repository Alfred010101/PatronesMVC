package creacionales.view;

import javax.swing.JFrame;

/**
 *
 * @author Alfred
 */
public class CalculadoraModelSwing extends JFrame implements CalculadoraVista
{

    public CalculadoraModelSwing()
    {
        setTitle("Calculadora Swing");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mostrar()
    {
        setVisible(true);
    }
}
