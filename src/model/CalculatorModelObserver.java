package model;

import java.util.*;

/**
 *
 * @author Alfred
 */
public class CalculatorModelObserver
{

    private int resultado;
    private final List<CalculatorObserver> observers = new ArrayList<>();

    public void sumar(int num1, int num2)
    {
        resultado = num1 + num2;
        notificarObservers();
    }

    public int getResultado()
    {
        return resultado;
    }

    public void agregarObserver(CalculatorObserver observer)
    {
        observers.add(observer);
    }

    private void notificarObservers()
    {
        for (CalculatorObserver observer : observers)
        {
            observer.actualizar(resultado);
        }
    }
}
