package ejercicio1;


public class Cls_Operaciones 
{
    public int salariob (int valorh, int numh)
    {
        int salb;
        
        salb = valorh * numh;
        
        return salb;
    }
    
    public int deducciones (int salb)
    {
        int dedu;
        
        dedu = (int) (salb * 0.05);
        
        return dedu;
    }
    
    public int aux_trans (int salb)
    {
        int auxt;
        
        auxt = (int) (salb * 0.08);
        
        return auxt;
    }
    
    public int salarion (int salb, int dedu, int auxt)
    {
        int saln;
        
        saln = (salb - dedu) + auxt;
        
        return saln;
    }
}
