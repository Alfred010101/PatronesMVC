
package model;

/**
 *
 * @author Alfred
 */
public class CalculatorModel
{
    private int resultado;

    public void sumar(int num1, int num2) 
    {
        resultado = num1 + num2;
    }

    public int getResultado() 
    {
        return resultado;
    }
}
