package parcial;


public class Cls_terrestre extends Abstract
{
    public float num_p, cant_p;

    public Cls_terrestre(float num_p, float cant_p) {
        this.num_p = num_p;
        this.cant_p = cant_p;
    }

    float result, aux;
    
    @Override
    public float viaje() {
       result = num_p * cant_p;
       if (num_p >= 10)
           aux = (float) (result * 0.1);
       else
           aux = 0;
       result = result - aux;
       return result;
    }
    
    
}
