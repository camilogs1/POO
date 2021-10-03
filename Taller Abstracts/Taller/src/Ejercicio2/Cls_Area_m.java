package Ejercicio2;


public class Cls_Area_m extends Abstract{

    public float valor_d, cant_p;

    public Cls_Area_m(float valor_d, float cant_p) {
        this.valor_d = valor_d;
        this.cant_p = cant_p;
    }
    
    float result;
    
    @Override
    public float hospedaje() {
        result = valor_d * cant_p;
        return result;
    }
}
