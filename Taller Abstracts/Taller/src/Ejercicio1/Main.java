package Ejercicio1;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner objleer = new Scanner(System.in);
        float valor_gaso, capacidad_t, result;
        int ciudad;
        System.out.print("Ingrese el valor de la gasolina: ");
        valor_gaso = objleer.nextFloat();
        System.out.print("Ingrese la capacidad del tanque: ");
        capacidad_t = objleer.nextFloat();
        System.out.print("Ingrese la ciudad: ");
        System.out.print("\nOpción 1 -> Medellin\n Opción 2 -> Cali\n Opción 3 -> Bogota: \n");
        ciudad = objleer.nextInt();
        switch (ciudad)
        {
            case 1:
                Cls_medellin objmedellin = new Cls_medellin(valor_gaso, capacidad_t);
                result = objmedellin.gasolina();
                System.out.println("\t El valor a pagar es de: " + result);
            break;
            case 2: Cls_cali objcali = new Cls_cali(valor_gaso, capacidad_t);
                    result = objcali.gasolina();
                    System.out.println("\t El valor a pagar es de: " + result);
            break;
            case 3: Cls_bogota objbogota = new Cls_bogota(valor_gaso, capacidad_t);
                    result = objbogota.gasolina();
                    System.out.println("\t El valor a pagar es de: " + result);
            break;
        }
    }
    
}
