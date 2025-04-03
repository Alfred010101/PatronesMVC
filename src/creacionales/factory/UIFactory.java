
package creacionales.factory;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Alfred
 */
public interface UIFactory 
{
    JButton crearBoton();
    JTextField crearCampoTexto();
}