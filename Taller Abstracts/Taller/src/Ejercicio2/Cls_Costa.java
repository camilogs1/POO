package Ejercicio2;


public class Cls_Costa extends Abstract{
    
    public float valor_d, cant_p, valor_p;

    public Cls_Costa(float valor_d, float cant_p, float valor_p) {
        this.valor_d = valor_d;
        this.cant_p = cant_p;
        this.valor_p = valor_p;
    }
    
    float result, aux;
    @Override
    public float hospedaje() {
        result = valor_d * cant_p + valor_p;
        return result;
    }
}
