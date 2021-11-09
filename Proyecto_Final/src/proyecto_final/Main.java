package proyecto_final;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner objleer=new Scanner (System.in);
            //adiccionar cls's
            ClsOpciones opciones = new ClsOpciones();
            
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
            int opc, opcEstudiante=0, opcProfesor=0, opcMateria=0, bandera;
            opc = opciones.menuPrincipal();
            while (opc != 4){
                switch (opc){
                    case 1: 
                        System.out.print("\n\tBienvenido Estudiante");
                        opcEstudiante = opciones.menuCRUD();
                        while (opcEstudiante != 5){
                            switch (opcEstudiante){
                                case 1: 
                                    
                                    // ClsBaseAbstracta tiene: Conexion Adicionar, consultar, Modificar, Anular
                                    //                          Para pedir los datos
                                    // Esas Funciones son usadas en ClsEstudiante, ClsProfesor y Cls Materia
                                    
                                    System.out.print("Digite la id del estudiante: ");
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
                                        
                                        //Llamar las clases
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
                                default : System.out.println("Digite una opcion valida");
                            }
                            opcEstudiante = opciones.menuCRUD();
                    }
                    break;
                    case 2: 
                        System.out.print("\n\tMenu Profesor");
                        opcProfesor = opciones.menuCRUD();
                        while (opcProfesor != 5){
                            switch (opcProfesor){
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
                            opcProfesor = opciones.menuCRUD();
                    }
                    break;
                    case 3: 
                        System.out.println("\n\t Bienvenido Materia");
                        opcMateria = opciones.menuCRUD();
                        while (opcMateria != 5){
                            switch (opcMateria){
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
                            opcMateria = opciones.menuCRUD();
                    }
                    break;
                    default : System.out.println("Digite una Opcion valida: ");
                }
                opc = opciones.menuPrincipal();
            }
    }
}
