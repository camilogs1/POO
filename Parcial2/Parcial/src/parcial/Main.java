package parcial;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) 
    {
        Scanner objleer = new Scanner(System.in);
        float cant_p, num_p, result, tasa_a;
        int aux;
        System.out.print("Ingrese el numero de personas: ");
        num_p = objleer.nextFloat();
        System.out.print("Ingrese valor por personas: ");
        cant_p = objleer.nextFloat();
        System.out.print("Ingrese tipo de transporte: ");
        System.out.print("\nOpción 1 -> Aéreo\n Opción 2 -> Terrestre\n Opción 3 -> Expreso: ");
        aux = objleer.nextInt();
        switch (aux)
        {
            case 1: System.out.print("Ingrese la tasa aeroportuaria: ");
                    tasa_a = objleer.nextFloat();
                    Cls_aereo objaereo = new Cls_aereo(num_p, cant_p, tasa_a);
                    result = objaereo.viaje();
                    System.out.println("\t El valor a pagar es de: " + result);
            break;
            case 2: Cls_terrestre objterrestre = new Cls_terrestre(num_p, cant_p);
                    result = objterrestre.viaje();
                    System.out.println("\t El valor a pagar es de: " + result);
            break;
            case 3: Cls_expreso objexpreso = new Cls_expreso(num_p, cant_p);
                    result = objexpreso.viaje();
                    System.out.println("\t El valor a pagar es de: " + result);
            break;
        }
    }
    
}
