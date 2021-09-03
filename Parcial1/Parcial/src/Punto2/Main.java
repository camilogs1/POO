package Punto2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) 
    {
        Scanner objleer=new Scanner(System.in);
        int numimpul, valimpul, cantkilo, valorkilo, cantmetr, valorxmetr;
        int resultT, resultE, resultA, resultTo;
        
        System.out.print("\tSERVICIO TELEFONO\n");
        System.out.print("Ingrese numero de impulsos: ");
        numimpul = objleer.nextInt();
        System.out.print("Ingrese valor de impulso: ");
        valimpul = objleer.nextInt();
        System.out.print("\tSERVICIO ENERGIA\n");
        System.out.print("Ingrese cantidad de kilovatios: ");
        cantkilo = objleer.nextInt();
        System.out.print("Ingrese valor de kilovatios: ");
        valorkilo = objleer.nextInt();
        System.out.print("\nSERVICIO AGUA\n");
        System.out.print("Ingrese cantidad de metros cubico: ");
        cantmetr = objleer.nextInt();
        System.out.print("Ingrese valor por metro cubico: ");
        valorxmetr = objleer.nextInt();
        Cls_procesos objproce = new Cls_procesos(numimpul, valimpul, cantkilo, valorkilo, cantmetr, valorxmetr);
        
        resultT = objproce.telefono();
        resultE = objproce.energia();
        resultA = objproce.agua();
        resultTo = objproce.total(resultT, resultE, resultA);
        
        System.out.print("\tSERVICIO TELEFONO\n");
        System.out.println("El valor a pagar es de " + resultT);
        System.out.print("\tSERVICIO ENERGIA\n");
        System.out.println("El valor a pagar es de " + resultE);
        System.out.print("\tSERVICIO AGUA\n");
        System.out.println("El valor a pagar es de " + resultA);
        System.out.print("\tTOTAL FACTURA\n");
        System.out.println("El valor a pagar es de " + resultTo);
    }
}
