package ejercicio3;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) 
    {
        Scanner objleer=new Scanner(System.in);
        Cls_ope objope = new Cls_ope();
        int cant, valoru,valorb, iva, valorn;
        
        System.out.print("Ingrse cantidad de unidades vendidas: ");
        cant = objleer.nextInt();
        System.out.print("Ingrese el valor unitario del producto: ");
        valoru = objleer.nextInt();
        
        valorb = cant * valoru;
        
        iva = objope.iva(valorb);
        valorn = objope.valorn(valorb, iva);
        
        System.out.println("El valor bruto ganado es de: " + valorb);
        System.out.println("El valor del iva es de: " + iva);
        System.out.println("El valor neto ganado es de: " + valorn);
        
    }
}
