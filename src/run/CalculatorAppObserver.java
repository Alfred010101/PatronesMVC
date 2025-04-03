
package run;

import controller.CalculatorControllerObserver;
import model.CalculatorModelObserver;
import view.CalculatorViewObserver;

/**
 *
 * @author Alfred
 */
public class CalculatorAppObserver
{
    public static void main(String[] args)
    {
        CalculatorViewObserver vista = new CalculatorViewObserver();
        CalculatorModelObserver modelo = new CalculatorModelObserver();
        CalculatorControllerObserver controller = new CalculatorControllerObserver(vista, modelo);

        vista.setVisible(true);
    }
}
