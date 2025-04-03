package creacionales.factory;

import creacionales.view.CalculadoraModelConsole;
import creacionales.view.CalculadoraModelSwing;
import creacionales.view.CalculadoraVista;

/**
 *
 * @author Alfred
 */
public class VistaFactory
{

    public static CalculadoraVista crearVista(String tipo)
    {
        if (tipo.equalsIgnoreCase("Swing"))
        {
            return new CalculadoraModelSwing();
        } else if (tipo.equalsIgnoreCase("Consola"))
        {
            return new CalculadoraModelConsole();
        }
        throw new IllegalArgumentException("Tipo de vista no soportado");
    }
}
