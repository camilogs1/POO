package ejercicio3;

public class Cls_ope 
{
    public int iva (int valorb)
    {
        int iva;
        
        iva = (int) (valorb * 0.16);
        
        return iva;
    }
    
    public int valorn (int valorb, int iva)
    {
        int valorn;
        
        valorn = valorb - iva;
        
        return valorn;
    }
}
