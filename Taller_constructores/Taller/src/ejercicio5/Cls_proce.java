package ejercicio5;


public class Cls_proce 
{
    private int salb;

    public Cls_proce(int salb) {
        this.salb = salb;
    }
    
    public int dedu()
    {
        int dedu=0;
        if (salb <= 3200000)
            dedu = (int) (salb * 0.08);
        else
            dedu = (int) (salb * 0.09);
        return dedu;
    }
    
    public int auxt()
    {
        int auxt;
        if (salb >= 1600000)
            auxt = (int) (salb * 0.1);
        else
            auxt=0;
        return auxt;
    }
    
    public int saln (int dedu, int auxt)
    {
        int saln;
        
        saln = (salb + auxt) - dedu;
        
        return saln;
    }
}
