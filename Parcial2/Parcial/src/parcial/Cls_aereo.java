package parcial;


public class Cls_aereo extends Abstract
{
    public float num_p, cant_p, tasa_a;

    public Cls_aereo(float num_p, float cant_p, float tasa_a) {
        this.num_p = num_p;
        this.cant_p = cant_p;
        this.tasa_a = tasa_a;
    }
    
    float result, aux;
    
    @Override
    public float viaje() {
        result = num_p * cant_p;
        aux = (float) (result * 0.19);
        result = result + aux + tasa_a;
        return result;
    }
    
}
