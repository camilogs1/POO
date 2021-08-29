package ejercicio10;


public class ClsPerimetro 
{
    double result;
    public double hallar_perimetro_cuadrado(double lado)
    {
        result = 4 * lado;
        return result;
    }
    
    public double hallar_perimetro_rectangulo(double largo, double ancho)
    {
        result = 2* (largo + ancho);
        return result;
    }
    
    public double hallar_perimetro_circulo(double radio)
    {
        result = 2* (Math.PI * radio);
        return result;
    }
}
