package ejercicio4;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) 
    {
        Scanner objleer=new Scanner(System.in);
        Cls_ope objope = new Cls_ope();
        int salb, dedu, auxt, saln;
        
        System.out.print("Ingrese el salario basico del empleado: ");
        salb = objleer.nextInt();
        //el salario minimo es de 800.000 y el auxilio de transporte es del 5%
        dedu = objope.dedu(salb);
        auxt = objope.auxt(salb);
        saln = objope.saln(salb, dedu, auxt);
        
        System.out.println("Las deducciones son de: " + dedu);
        System.out.println("El auxilio de transporte es de: " + auxt);
        System.out.println("El salario neto es de: " + saln);
        
        
    }
}
