package controller;

import commands.Command;
import commands.CommandSumar;
import model.CalculatorModel;
import view.CalculatorView;

/**
 *
 * @author Alfred
 */
public class CalculatorControllerCommand
{

    public CalculatorControllerCommand(CalculatorView vista, CalculatorModel modelo)
    {
        vista.getBotonSumar().addActionListener(e ->
        {
            Command comando = new CommandSumar(modelo, vista);
            comando.ejecutar();
        });
    }
}
