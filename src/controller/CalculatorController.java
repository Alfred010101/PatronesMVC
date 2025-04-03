package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CalculatorModel;
import view.CalculatorView;

/**
 *
 * @author Alfred
 */
public class CalculatorController
{

    private final CalculatorView vista;
    private final CalculatorModel modelo;

    public CalculatorController(CalculatorView vista, CalculatorModel modelo)
    {
        this.vista = vista;
        this.modelo = modelo;

        // Agregar acción al botón
        this.vista.getBotonSumar().addActionListener((ActionEvent e) ->
        {
            int num1 = vista.getNumero1();
            int num2 = vista.getNumero2();
            modelo.sumar(num1, num2);
            vista.setResultado(modelo.getResultado());
        });
    }
}
