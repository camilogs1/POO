package ejercicio3;


public class Cls_pro 
{
    private int valorc;

    public Cls_pro(int valorc) {
        this.valorc = valorc;
    }
    int valorn, propina, iva;
    
    public int valorn()
    {
        iva = (int) (valorc * 0.15);
        
        valorn = valorc + iva;
        return valorn;
    }
    
    public int valorn_p()
    {
        propina = (int) (valorc * 0.1);
        iva = (int) (valorc * 0.15);
        
        valorn = valorc + propina + iva;
        return valorn;
    }
}
