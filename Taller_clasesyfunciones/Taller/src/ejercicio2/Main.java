package ejercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
    Scanner objleer=new Scanner(System.in);
    Cls_operaciones objope=new Cls_operaciones();
    int n1,n2,aux;
    double resulta, resultp;
    
   
    System.out.print("Ingrese el lado: ");
    n1=objleer.nextInt();
    resulta = objope.hallar_area_cuadrado(n1);
    resultp = objope.hallar_perimetro_cuadrado(n1);
    System.out.println("\n El area del cuadrado es: " + resulta);
    System.out.println("\n El numero perimetro del cuadrado es: " + resultp);
    
    }
}
