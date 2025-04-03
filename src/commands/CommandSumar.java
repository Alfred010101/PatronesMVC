package commands;

import model.CalculatorModel;
import view.CalculatorView;

/**
 *
 * @author Alfred
 */
public class CommandSumar implements Command
{

    private final CalculatorModel model;
    private final CalculatorView vista;

    public CommandSumar(CalculatorModel model, CalculatorView vista)
    {
        this.model = model;
        this.vista = vista;
    }

    @Override
    public void ejecutar()
    {
        int num1 = vista.getNumero1();
        int num2 = vista.getNumero2();
        model.sumar(num1, num2);
        vista.setResultado(model.getResultado());
    }
}
