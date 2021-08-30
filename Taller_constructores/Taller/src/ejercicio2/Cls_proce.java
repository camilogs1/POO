package ejercicio2;


public class Cls_proce 
{
    private int cantu, valoru;

    public Cls_proce(int cantu, int valoru) {
        this.cantu = cantu;
        this.valoru = valoru;
    }
    
    public int valorbruto()
    {
        int valorb;
        valorb = cantu * valoru;
        return valorb;
    }
    
    public int iva(int valorb)
    {
        int iva;
        
        iva = (int) (valorb * 0.1);
        return iva;
    }
    
    public int descu (int valorb)
    {
        int descu=0;
        if (cantu <= 20)
            descu = (int) (valorb * 0.12);
        if (cantu > 20 && cantu <= 50)
            descu = (int) (valorb * 0.2);
        if (cantu > 50)
            descu = (int) (valorb * 0.25);
        return descu;
    }
    
    public int valorn (int valorb, int iva, int descu)
    {
        int valorn;
        
        valorn = (valorb - descu) + iva;
        
        return valorn;
    }
}
