package proyecto_final;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner objleer=new Scanner (System.in);
            //adiccionar cls's
            
            //variables estudiante
            int ID_estudiante, telefono_estudiante;
            String nombre_estudiante, carrera, email_estudiante;
            
            //variables profesor
            int ID_profesor, telefono_profesor;
            String nombre_profesor, email_profesor;
            
            //variables materia
            int ID_materia;
            String nombre_materia, salon;
            
            //variables menu y database
            ResultSet result;
            int opc=0, opc1=0, opc2=0, bandera;
            while (opc != 3)
            {
                System.out.print("\n\t Bienvenido");
                System.out.print("\n\t Menu principal");
                
                System.out.print("\n1. Menu estudiante");
                System.out.print("\n2. Menu profesor");
                System.out.print("\n3. Salir");
                
                System.out.print("\nSeleccione una opción valida: ");
                opc = objleer.nextInt();
                switch (opc)
                {
                    case 1: while (opc1 != 5)
                    {
                        System.out.print("\n\t Bienvenido estudiante");
                        System.out.print("\n1. Adicionar");
                        System.out.print("\n2. Consultar"); 
                        System.out.print("\n3. Modificar"); 
                        System.out.print("\n4. Anular"); 
                        System.out.print("\n5. Salir"); 
                        System.out.print("\nSeleccione una opción valida: ");
                        opc1 = objleer.nextInt();
                        switch (opc1)
                        {
                            case 1: System.out.print("Digite la id del estudiante: ");
                                    ID_estudiante = objleer.nextInt();
                                    System.out.print("Digite el nombre del estudiante: ");
                                    nombre_estudiante = objleer.next();
                                    System.out.print("Digite carrera del estudiante: ");
                                    carrera = objleer.next();
                                    System.out.print("Digite email del estudiante: ");
                                    email_estudiante = objleer.next();
                                    System.out.print("Digite telefono del estudiante: ");
                                    telefono_estudiante = objleer.nextInt();
                                    bandera = 0;
                                    if (bandera == 0)
                                    {
                                        System.out.println("Error adicionando registro ");
                                    }
                                    else
                                    {
                                        System.out.println("Registro adicionado");
                                    }
                            break;
                            case 2: System.out.print("Digite la id del estudiante: ");
                                    ID_estudiante = objleer.nextInt();
                                    /*
                                    result = clase consultar estudiante
                                    if (result.next()) 
                                    {
                                        System.out.println("Registro hallado");
                                        String prueba = result.getString("nombres");
                                        System.out.println("\n Perteneciente al estudiante con la id: " + result.getInt("ID")
                                        + " con el nombre: " + result.getString("nombre")
                                        + " inscrito con el email: " + result.getString("email")
                                        + " registrado con el telefono: " + result.getInt("telefono")
                                        + " perteneciente al programa: " + result.getString("carrera"));
                                        System.out.println("-----------------------------------------------------");
                                        }
                                    } 
                                    else System.out.println("Registro no existente");
                                    */
                            break;
                            case 3: System.out.print("Digite la id del estudiante: ");
                                    ID_estudiante = objleer.nextInt();
                                    System.out.print("Digite el nombre del estudiante: ");
                                    nombre_estudiante = objleer.next();
                                    System.out.print("Digite la carrera del estudiante: ");
                                    carrera = objleer.next();
                                    System.out.print("Digite el email del estudiante: ");
                                    email_estudiante = objleer.next();
                                    System.out.print("Digite el numero del estudiante: ");
                                    telefono_estudiante = objleer.nextInt();
                                    //clase modificar estudiante
                                    bandera = 0;
                                    if (bandera == 0)
                                    {
                                        System.out.println("Error modificando registro ");
                                    }
                                    else
                                    {
                                        System.out.println("Registro modificado");
                                    }
                            break;
                            case 4: System.out.print("Digite la id del estudiante: ");
                                    ID_estudiante = objleer.nextInt();
                                    /*
                                    result = clase anular estudiante
                                    if (result.next()) 
                                    {
                                        System.out.println("Registro ANULADO");
                                        System.out.println("-----------------------------------------------------");
                                    } 
                                    else System.out.println("Registro no existente");
                                    */
                            break;
                            default : System.out.println("Adios estudiante");
                        }
                    }
                    break;
                    case 2:
                            //menu profesor y opciones varias :)
                    break;
                    default : System.out.println("Saliendo del sistema");
                }
            }
    }
}
