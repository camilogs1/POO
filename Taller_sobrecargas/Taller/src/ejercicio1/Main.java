package ejercicio1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) 
    {
        Scanner objleer=new Scanner(System.in);
        Cls_proce objproce = new Cls_proce();
        int cant, valoru, valorn=0, descu, iva=0, opc=1, aux;
        System.out.print("Ingrese cantidad de articulos: ");
        cant = objleer.nextInt();
        System.out.print("Ingrese valor unidad: ");
        valoru = objleer.nextInt();
        while(opc != 5)
    {
        System.out.println("\n Menu");
        System.out.println("1. Cliente normal");
        System.out.println("2. Cliente con descuento");
        System.out.println("3. Cliente con iva");
        System.out.println("4. Cliente con iva y descuento");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        opc=objleer.nextInt();
        switch (opc)
        {
            case 1: valorn = objproce.proceso(valoru, cant);
                    break;
            case 2: System.out.print("\n Digite porcentaje del descuento: ");
                    descu = objleer.nextInt();
                    valorn = objproce.proceso(cant, valoru, descu);
                    break;
            case 3: System.out.println("Ingrese valor iva. \n1 -> 5% \n2 -> 10% \n3 -> 15%");
                    aux = objleer.nextInt();
                    if (aux == 1)
                        iva = 5;
                    if(aux == 2)
                        iva = 10;
                    if (aux == 3)
                        iva = 15;
                    valorn = objproce.proceso(cant, valoru, iva);
                    break;
            case 4: System.out.println("Ingrese valor iva. \n1 -> 5% \n2 -> 10% \n3 -> 15%");
                    aux = objleer.nextInt();
                    if (aux == 1)
                        iva = 5;
                    if(aux == 2)
                        iva = 10;
                    if (aux == 3)
                        iva = 15;
                    System.out.println("\n Digite porcentaje del descuento: ");
                    descu = objleer.nextInt();
                    valorn = objproce.proceso(cant, valoru, iva, descu);
            case 5: opc = 5;
                    break;
            default: System.out.print("Seleccione una opción valida");
                     break;
        }
        System.out.println("\n El valor neto es: " + valorn);
    }
    }
}
