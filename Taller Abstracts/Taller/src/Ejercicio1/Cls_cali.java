package Ejercicio1;


public class Cls_cali extends Abstract
{
    public float valor_gaso, capacidad_t;

    public Cls_cali(float valor_gaso, float capacidad_t) {
        this.valor_gaso = valor_gaso;
        this.capacidad_t = capacidad_t;
    }
    
    float result, aux;

    @Override
    public float gasolina() {
        result = valor_gaso * capacidad_t;  
        aux = capacidad_t * 1200;
        result = result + aux;
        return result;
    }
}
