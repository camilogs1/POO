package ejercicio1;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) 
    {
        Scanner objleer=new Scanner(System.in);
        Cls_Operaciones objope = new Cls_Operaciones();
        int valorh, numh, salb, dedu, auxt, saln;
        
        System.out.print("Ingrese valor hora trabajada: ");
        valorh=objleer.nextInt();
        System.out.print("Ingrese numero de horas trabajadas: ");
        numh=objleer.nextInt();
        
        salb = objope.salariob(valorh, numh);
        dedu = objope.deducciones(salb);
        auxt = objope.aux_trans(salb);
        saln = objope.salarion(salb, dedu, auxt);
        
        System.out.println("El salario bruto del trabajador es de: "+ salb);
        System.out.println("Las deducciones son: " + dedu);
        System.out.println("El auxilio de transporte es de: "+ auxt);
        System.out.println("El salario neto del trabajador es de: " + saln);
        
    }
    
}
