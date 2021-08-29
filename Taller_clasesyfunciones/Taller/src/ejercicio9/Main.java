package ejercicio9;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner objleer=new Scanner(System.in); 
        ClsAreas objarea=new ClsAreas();
        int n1,n2,aux;
        double resulta, resultp;
        
        System.out.print("Que figura desea trabajar:\n 1 --> cuadrado. \n 2 --> rectangulo. \n 3 --> circulo. \n 4 --> salir \n");
        aux=objleer.nextInt();
        while (aux != 4)
        {
            switch (aux)
                {
                  case 1: System.out.print("Ingrese el lado: ");
                          n1=objleer.nextInt();
                          resulta = objarea.hallar_area_cuadrado(n1);
                          System.out.println("\n El area del cuadrado es: " + resulta);
                          break;
                  case 2: System.out.print("Ingrese el largo: ");
                          n1=objleer.nextInt();
                          System.out.print("Ingrese el ancho: ");
                          n2=objleer.nextInt();
                          resulta = objarea.hallar_area_rectangulo(n1, n2);
                          System.out.println("\n El area del rectangulo es: " + resulta);
                          break;
                   case 3: System.out.print("Ingrese el radio: ");
                          n1=objleer.nextInt();
                          resulta = objarea.hallar_area_circulo(n1);
                          System.out.println("\n El area del circulo es: " + resulta);
                          break;
                   default: System.out.print("Seleccione una opción valida");
                            break;
                }
            System.out.print("Que figura desea trabajar:\n 1 --> cuadrado. \n 2 --> rectangulo. \n 3 --> circulo. \n 4 --> salir \n");
            aux=objleer.nextInt();
        }
        
    }  
}

