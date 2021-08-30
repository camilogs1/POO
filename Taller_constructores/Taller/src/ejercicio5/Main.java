package ejercicio5;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) 
    {
        Scanner objleer=new Scanner(System.in);
        int salb, dedu, auxt, saln;
        System.out.print("Ingrese el salario del empleado: ");
        salb = objleer.nextInt();
        //el salario minimo es de 800.000 y el auxilio de transporte es del 10%
        Cls_proce objproce = new Cls_proce(salb);
        dedu = objproce.dedu();
        auxt = objproce.auxt();
        saln = objproce.saln(dedu, auxt);
        
        System.out.println("Las deducciones son de: " + dedu);
        System.out.println("El auxilio de transporte es de: " + auxt);
        System.out.println("El salario neto del trabajador es de: " + saln);
    }
}
