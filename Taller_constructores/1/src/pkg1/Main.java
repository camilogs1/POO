package pkg1;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) 
    {
        Scanner objleer=new Scanner(System.in); 
        double valorb, desc, valorn, valord ,cantp, valorp;
        System.out.print("Ingrese la cantidad de peliculas: ");
        cantp = objleer.nextInt();
        System.out.print("Ingrese valor pelicula: ");
        valorp = objleer.nextInt();
        Cls_peliculas objpeli = new Cls_peliculas(cantp, valorp);
        
        valorb = objpeli.valorbruto();
        valord = objpeli.descuentos(valorb);
        valorn = objpeli.valorn(valord, valorb);
        
        System.out.println("El valor bruto de las peliculas es: " + valorb);
        System.out.println("El valor de decuento otorgado es: " + valord);
        System.out.println("El valor neto a pagar es de: " + valorn);
        
    }
    
}
