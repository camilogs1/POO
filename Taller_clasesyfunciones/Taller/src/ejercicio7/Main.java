package ejercicio7;

import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) 
    {
    Scanner objleer=new Scanner(System.in);
    Cls_fibo objfibo = new Cls_fibo();
    int n;
    System.out.print("Ingrese un numero: ");
    n = objleer.nextInt();
    int[]fibo = new int[n];
    
    fibo = objfibo.fibo(n);
    
    System.out.println("La serie fibonacci del numero " + n + " es: ");
    for (int i = 0; i < n; i++) 
         {
             System.out.print(fibo[i] + " ");
         }
    }
}
