package utilizacion_libreria;

import java.util.Scanner;
import Letras_numeros.validar;

public class Utilizacion_libreria {

    
    public static void main(String[] args) {
        Scanner objleer = new Scanner(System.in);
        Letras_numeros.validar objvalidar = new Letras_numeros.validar();
        String cadena, dato;
        boolean resp;
        
        //leer cadena
        System.out.print("Digite cadena a validar: ");
        dato = objleer.nextLine();
        System.out.print("Digite numero a validar: ");
        cadena = objleer.nextLine();
        resp = objvalidar.validar_cadena(dato);
        if (resp == true)
            System.out.println("\n Si son solo letras");
        else
            System.out.println("\n No son solo letras");
        
        //leer cadena y verificar solo numeros
        resp = objvalidar.validar_numero(cadena);
        if (resp == true)
            System.out.println("\n Si son solo numeros");
        else
            System.out.println("\n No son solo numeros");
    }
}
