package parcial;


public class Cls_expreso extends Abstract
{
    public float num_p, cant_p;

    public Cls_expreso(float num_p, float cant_p) {
        this.num_p = num_p;
        this.cant_p = cant_p;
    }

    float result, aux;

    @Override
    public float viaje() {
      result = num_p * cant_p;
       aux = (float) (result * 0.2);
       result = result + aux;
       return result;
    }
    
    
}
