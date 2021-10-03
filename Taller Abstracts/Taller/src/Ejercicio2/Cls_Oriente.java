package Ejercicio2;


public class Cls_Oriente extends Abstract
{
    public float valor_d, cant_p;

    public Cls_Oriente(float valor_d, float cant_p) {
        this.valor_d = valor_d;
        this.cant_p = cant_p;
    }
    
    float result, aux;
    
    @Override
    public float hospedaje() {
        result = valor_d * cant_p;
        aux = (float) (result * 0.10);
        result = result + aux;
        return result;
      }
    
}
