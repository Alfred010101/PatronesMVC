/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.CalculatorControllerCommand;
import model.CalculatorModel;
import view.CalculatorView;

/**
 *
 * @author Alfred
 */
public class CalculatorAppCommand
{
    public static void main(String[] args)
    {
        CalculatorView vista = new CalculatorView();
        CalculatorModel modelo = new CalculatorModel();
        CalculatorControllerCommand controller = new CalculatorControllerCommand(vista, modelo);

        vista.setVisible(true);
    }
}
