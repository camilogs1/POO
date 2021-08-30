package ejercicio2;

import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) 
    {
        Scanner objleer=new Scanner(System.in);
        int cantu, valoru, valorb, iva, descu, valorn;
        System.out.print("Ingrese la cantidad de articulos: ");
        cantu = objleer.nextInt();
        System.out.print("Ingrse el valor por unidad: ");
        valoru = objleer.nextInt();
        Cls_proce objproce = new Cls_proce(cantu , valoru);
        
        valorb = objproce.valorbruto();
        iva = objproce.iva(valorb);
        descu = objproce.descu(valorb);
        valorn = objproce.valorn(valorb, iva, descu);
        
        System.out.println("El valor bruto del producto es de: " + valorb);
        System.out.println("El iva es de: " + iva);
        System.out.println("El descuento es de: " + descu);
        System.out.println("El valor neto a pagar es de: " + valorn);
    }
}
