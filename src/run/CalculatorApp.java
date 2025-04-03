package run;

import controller.CalculatorController;
import model.CalculatorModel;
import view.CalculatorView;

/**
 *
 * @author Alfred
 */
public class CalculatorApp
{

    public static void main(String[] args)
    {
        CalculatorView vista = new CalculatorView();
        CalculatorModel modelo = new CalculatorModel();
        CalculatorController controller = new CalculatorController(vista, modelo);

        vista.setVisible(true);
    }
}
