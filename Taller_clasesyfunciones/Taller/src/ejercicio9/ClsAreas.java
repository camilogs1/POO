package ejercicio9;

public class ClsAreas {

    double result;
    public double hallar_area_cuadrado(double lado)
    {
        result = lado * lado;
        return result;
    }
    
    public double hallar_area_rectangulo(double largo, double ancho)
    {
        result = largo * ancho;
        return result;
    }
    
    public double hallar_area_circulo(double radio)
    {
        result = Math.PI * radio * radio;
        return result;
    }  
}
