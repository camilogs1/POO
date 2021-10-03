package Ejercicio2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) 
    {
        Scanner objleer = new Scanner(System.in);
        float valor_d, cant_p, result, valor_p;
        int zona;
        
        System.out.print("Ingrese el valor dia: ");
        valor_d = objleer.nextFloat();
        System.out.print("Ingrese la cantidad de personas: ");
        cant_p = objleer.nextFloat();
        System.out.print("Ingrese la zona a hospedarse: ");
        System.out.print("\nOpción 1 -> Área metropolitana\n Opción 2 -> Oriente\n Opción 3 -> Costa Atlántica: \n Opción 4 -> San Andrés");
        zona = objleer.nextInt();
        switch (zona)
        {
            case 1: Cls_Area_m objarea = new Cls_Area_m(valor_d, cant_p);
                    result = objarea.hospedaje();
                    System.out.println("El valor del alquiler es de: " + result);
            break;
            case 2: Cls_Oriente objoriente = new Cls_Oriente(valor_d, cant_p);
                    result = objoriente.hospedaje();
                    System.out.println("El valor del alquiler es de: " + result);
            break;
            case 3: System.out.print("Ingrese el valor del peaje aereo: ");
                    valor_p = objleer.nextFloat();
                    Cls_Costa objcosta = new Cls_Costa(valor_d, cant_p, valor_p);
                    result = objcosta.hospedaje();
                    System.out.println("El valor del alquiler es de: " + result);
            break;
            case 4: System.out.print("Ingrese el valor del peaje aereo: ");
                    valor_p = objleer.nextFloat();
                    Cls_San_A objsan = new Cls_San_A(valor_d, cant_p, valor_p);
                    result = objsan.hospedaje();
                    System.out.println("El valor del alquiler es de: " + result);
            break;
        }
    }
}
