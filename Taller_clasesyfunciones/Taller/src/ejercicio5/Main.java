package ejercicio5;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) 
    {
    Scanner objleer=new Scanner(System.in);
    Cls_ope objope = new Cls_ope();
    int n, facto;
    
    System.out.print("Ingrese numero: ");
    n = objleer.nextInt();
    
    facto = objope.facto(n);
    
    System.out.println("El factorial del numero " + n + " es: " + facto);
    
    }
}
