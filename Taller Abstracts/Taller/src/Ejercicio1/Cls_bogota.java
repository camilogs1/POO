package Ejercicio1;


public class Cls_bogota extends Abstract
{
    
    public float valor_gaso, capacidad_t;

    public Cls_bogota(float valor_gaso, float capacidad_t) {
        this.valor_gaso = valor_gaso;
        this.capacidad_t = capacidad_t;
    }
    
    float result, aux, aux2;

    @Override
    public float gasolina() {
        result = valor_gaso * capacidad_t;  
        aux = (float) (result * 0.15);
        aux2 = capacidad_t * 500;
        result = result + aux + aux2;
        return result;
    }
    
    
}
