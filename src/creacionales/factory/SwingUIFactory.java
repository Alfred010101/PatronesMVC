/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creacionales.factory;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Alfred
 */
public class SwingUIFactory implements UIFactory
{

    @Override
    public JButton crearBoton()
    {
        return new JButton("Calcular");
    }

    @Override
    public JTextField crearCampoTexto()
    {
        return new JTextField(10);
    }

}
