package Punto1;


public class Cls_proce 
{
    public int matricula (int numM, int valorM, int descu)
    {
        int result;
        
        result = (numM * valorM) - descu;
        
        return result;
    }
    
    public int matricula (int numM, int valorM)
    {
        int result;
        
        result = numM * valorM;
        
        return result;
    }
    
    public int matricula (int numM, int valorM, double cantV)
    {
        int result;
        
        result = (int) ((numM * valorM) + cantV);
        
        return result;
    }
}
