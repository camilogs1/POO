package ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
    Scanner objleer=new Scanner(System.in);
    Cls_area objarea = new Cls_area();
    double radio, area;
    
    System.out.print("Ingrese el radio: ");
    radio=objleer.nextInt();
    
    area = objarea.hallar_area_circulo(radio);
    System.out.println("\n El area del circulo es: " + area);
    }
}
