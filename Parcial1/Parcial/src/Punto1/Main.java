package Punto1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) 
    {
    Scanner objleer=new Scanner(System.in);
    int estrato, numM, valorM, descu, result;
    double cantV;
    Cls_proce objproce = new Cls_proce();
    
    System.out.print("\tSISTEMA UNIVERSITARIO\n");
    System.out.print("Ingrese su estrato socioeconomico: ");
    estrato = objleer.nextInt();
    
    if (estrato <= 2)
    {
        System.out.print("\tTIPO 1\n");
        System.out.print("Ingrese numero de materias: ");
        numM = objleer.nextInt();
        System.out.print("Ingrese valor materia: ");
        valorM = objleer.nextInt();
        System.out.print("Ingrese el descuento otorgado: ");
        descu = objleer.nextInt();
        result = objproce.matricula(numM, valorM, descu);
    }
    else if (estrato <= 4)
    {
        System.out.print("\tTIPO 2\n");
        System.out.print("Ingrese numero de materias: ");
        numM = objleer.nextInt();
        System.out.print("Ingrese valor materia: ");
        valorM = objleer.nextInt();
        result = objproce.matricula(numM, valorM);
    }
    else
    {
        System.out.print("\tTIPO 3\n");
        System.out.print("Ingrese numero de materias: ");
        numM = objleer.nextInt();
        System.out.print("Ingrese valor materia: ");
        valorM = objleer.nextInt();
        System.out.print("Ingrese donativo voluntario: ");
        cantV = objleer.nextInt();
        result = objproce.matricula(numM, valorM, cantV);
    }
    System.out.println("El valor de matricula a pagar es de " + result);
    }
}
