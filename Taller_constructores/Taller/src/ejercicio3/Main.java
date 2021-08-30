package ejercicio3;

import java.util.Scanner;


public class Main 
{
    public static void main(String[] args){
        Scanner objleer=new Scanner(System.in);
        int valorc, valorn=0,aux;
        System.out.print("Ingrese el valor de la comida: ");
        valorc = objleer.nextInt();
        Cls_pro objpro = new Cls_pro(valorc);
        
        System.out.println("¿Desea añadir propina?: \n1 -> si\n2 -> no");
        aux = objleer.nextInt();
        if (aux == 1)
        {
            valorn = objpro.valorn_p();
            System.out.println("El valor a pagar con propina incluida es de " + valorn);
        }
        else
        {
            valorn = objpro.valorn();
            System.out.println("El valor a pagar es de: " + valorn);
        }
    }
}
