package ejercicio1;


public class Cls_proce 
{
    public int proceso (int valoru, int cant)
    {
        int valorn;
        
        valorn = cant * valoru;
        
        return valorn;
    }
    
    public int proceso (int cant, int valoru, int iva)
    {
        int valorn;
        
        valorn=(valoru * cant) * (1 + iva/100);
        
        return valorn;
    }
    
    public int proceso (int cant, int valoru, double descu)
    {
        int valorn;
        
        valorn =(int) ((cant * valoru) - (1 - descu/100));
        
        return valorn;
    }
    
    public int proceso (int cant, int valoru, int iva, int descu)
    {
        int valorn;
        
        valorn =((cant * valoru) - (1 - descu/100)) * (1 + iva/100);
        
        return valorn;
    }
}
