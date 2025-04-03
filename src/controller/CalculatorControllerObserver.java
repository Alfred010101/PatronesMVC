package controller;

import model.CalculatorModelObserver;
import view.CalculatorViewObserver;

/**
 *
 * @author Alfred
 */
public class CalculatorControllerObserver
{

    private final CalculatorViewObserver vista;
    private final CalculatorModelObserver modelo;

    public CalculatorControllerObserver(CalculatorViewObserver vista, CalculatorModelObserver modelo)
    {
        this.vista = vista;
        this.modelo = modelo;

        // Registrar la vista como observador del modelo
        this.modelo.agregarObserver(vista);

        // Manejar la acción del botón
        this.vista.getBotonSumar().addActionListener(e ->
        {
            int num1 = vista.getNumero1();
            int num2 = vista.getNumero2();
            modelo.sumar(num1, num2);
        });
    }
}
