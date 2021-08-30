package ejercicio1;


public class Cls_peliculas 
{
    private double cantp, valorp;

    public Cls_peliculas(double cantp, double valorp) {
        this.cantp = cantp;
        this.valorp = valorp;
    }
    public double valorbruto ()
    {
        double valorb;
        valorb = cantp * valorp;
        return valorb;
    }
    
    public double descuentos (double valorb)
    {
        double valord;
        if(cantp >= 5)
        {
            valord = valorb * 0.1;
        }
        else
        {
            valord = 0;
        }
        return valord;
    }
    
    public double valorn (double valord, double valorb)
    {
        double valorn;
        valorn = valorb - valord;
        return valorn;
    }
}