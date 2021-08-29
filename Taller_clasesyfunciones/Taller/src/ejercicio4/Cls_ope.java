package ejercicio4;


public class Cls_ope
{
    public int dedu (int salb)
    {
        int dedu;
        if (salb <= 3200000)
            dedu = (int) (salb * 0.08);
        else
            dedu = (int) (salb * 0.09);
        
        return dedu;
    }
    
    public int auxt (int salb)
    {
        int auxt;
        if (salb <= 1600000)
            auxt = (int) (salb * 0.05);
        else
            auxt = 0;
        
        return auxt;
    }
    
    public int saln (int salb, int dedu, int auxt)
    {
        int saln;
        
        saln = (salb + auxt) - dedu;
        
        return saln;
    }
}
