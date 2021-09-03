package Punto2;


public class Cls_procesos 
{
    private int numimpul, valimpul, cantkilo, valorkilo, cantmetr, valorxmetr;

    public Cls_procesos(int numimpul, int valimpul, int cantkilo, int valorkilo, int cantmetr, int valorxmetr) {
        this.numimpul = numimpul;
        this.valimpul = valimpul;
        this.cantkilo = cantkilo;
        this.valorkilo = valorkilo;
        this.cantmetr = cantmetr;
        this.valorxmetr = valorxmetr;
    }
    
    public int telefono ()
    {
        int resultT;
        resultT = numimpul * valimpul;
        return resultT;
    }
    
    public int energia ()
    {
        int resultE;
        resultE = cantkilo * valorkilo;
        return resultE;
    }
    
    public int agua ()
    {
        int resultA;
        resultA = cantmetr * valorxmetr;
        return resultA;
    }
    
    public int total (int resultT, int resultE, int resultA)
    {
        int resultTo;
        resultTo = resultT + resultE + resultA;
        return resultTo;
    }
}
