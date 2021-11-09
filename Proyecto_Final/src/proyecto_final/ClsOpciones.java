/*
 Opciones de usuario para Main
 */
package proyecto_final;

import java.util.Scanner;

public class ClsOpciones {
    
    Scanner objleer=new Scanner (System.in);
    
    public int menuPrincipal(){
        int opc;
        System.out.print("\n\t Bienvenido");
        System.out.print("\n\t Menu principal");
        
        System.out.print("\n1. Menu estudiante");
        System.out.print("\n2. Menu profesor");
        System.out.print("\n3. Menu Materia");
        System.out.print("\n4. Salir");
                
        System.out.print("\nSeleccione una opción valida: ");
        opc = objleer.nextInt();
        return opc;
    }
    
    public int menuCRUD(){
        int opc;
        System.out.print("\n1. Adicionar");
        System.out.print("\n2. Consultar"); 
        System.out.print("\n3. Modificar"); 
        System.out.print("\n4. Anular"); 
        System.out.print("\n5. Salir"); 
        System.out.print("\nSeleccione una opción valida: ");
        opc = objleer.nextInt();
        return opc;
    }
}
