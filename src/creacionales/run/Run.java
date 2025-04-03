
package creacionales.run;

import creacionales.factory.VistaFactory;
import creacionales.view.CalculadoraVista;

/**
 *
 * @author Alfred
 */
public class Run
{

    public static void factoryMethod()
    {
        CalculadoraVista vista = VistaFactory.crearVista("Swing");
//        vista = VistaFactory.crearVista("Consola");
        vista.mostrar();
    }
}
