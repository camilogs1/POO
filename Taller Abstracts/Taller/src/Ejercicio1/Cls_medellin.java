package Ejercicio1;


public class Cls_medellin extends Abstract{

    public float valor_gaso, capacidad_t;

    public Cls_medellin(float valor_gaso, float capacidad_t) {
        this.valor_gaso = valor_gaso;
        this.capacidad_t = capacidad_t;
    }
    
    float result, aux;
    
    @Override
    public float gasolina() {
        result = valor_gaso * capacidad_t; 
        aux = (float) (result * 0.1);
        result = result + aux;
        return result;
    }
    
}
