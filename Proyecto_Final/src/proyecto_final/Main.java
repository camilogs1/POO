package proyecto_final;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        
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
                            //Se crea el objeto de la clase ClsEstudiante para ser usada
                            // en cualquiera de las opciones Adicionar, Conuslta, Modificar, Anular
                            System.out.print("Digite la id del estudiante: ");
                            ID_estudiante = objleer.nextInt();
                            ClsEstudiante objEstudiante = new ClsEstudiante(ID_estudiante);
                            switch (opcEstudiante){
                                case 1: 
                                    
                                    // ClsBaseAbstracta tiene: Conexion, Adicionar, consultar, Modificar, Anular
                                    // Esas Funciones son usadas en ClsEstudiante, ClsProfesor y Cls Materia
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
                                    bandera = objEstudiante.Adicionar(nombre_estudiante, carrera, email_estudiante, telefono_estudiante);
                                    
                                    if (bandera == 0){
                                        System.out.println("Error adicionando registro ");
                                    }
                                    else{
                                        System.out.println("Registro adicionado");
                                    }
                                break;
                                case 2: result = objEstudiante.Consultar();
                                        if (result.next()) 
                                        {
                                            System.out.println("Registro hallado");
                                            if (result.getString("activo").equals("no"))
                                            {
                                                System.out.print("\nEl registro está anulado\n");
                                            }
                                            else
                                            {
                                                System.out.println("\n Perteneciente al estudiante con la id: " + result.getInt("ID")
                                                + " con el nombre: " + result.getString("nombre")
                                                + " inscrito con el email: " + result.getString("email")
                                                + " registrado con el telefono: " + result.getInt("telefono")
                                                + " perteneciente al programa: " + result.getString("carrera"));
                                                System.out.println("-----------------------------------------------------");
                                            }
                                        } 
                                        else System.out.println("Registro no existente");
                                break;
                                case 3: 
                                        System.out.print("Digite el nombre del estudiante: ");
                                        nombre_estudiante = objleer.next();
                                        System.out.print("Digite la carrera del estudiante: ");
                                        carrera = objleer.next();
                                        System.out.print("Digite el email del estudiante: ");
                                        email_estudiante = objleer.next();
                                        System.out.print("Digite el numero del estudiante: ");
                                        telefono_estudiante = objleer.nextInt();
                                        //clase modificar estudiante
                                        bandera = objEstudiante.Modificar(nombre_estudiante, carrera, email_estudiante, telefono_estudiante);
                                        
                                        if (bandera == 0){
                                            System.out.println("Error modificando registro ");
                                        }else{
                                            System.out.println("Registro modificado");
                                        }
                                break;
                                case 4: bandera = objEstudiante.Anular();
                                        if (bandera == 0) 
                                        {
                                            System.out.println("Error anulando registro");
                                        } 
                                        else
                                        {
                                            System.out.println("Registro ANULADO");
                                            System.out.println("-----------------------------------------------------");
                                        }
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
                            System.out.print("Digite la id del Profesor: ");
                            ID_profesor = objleer.nextInt();
                            ClsProfesor objProfesor = new ClsProfesor(ID_profesor);
                            switch (opcProfesor){
                                case 1: 
                                        System.out.print("Digite el nombre del Profesor: ");
                                        nombre_profesor = objleer.next();
                                        System.out.print("Digite email del Profesor: ");
                                        email_profesor = objleer.next();
                                        System.out.print("Digite telefono del Profesor: ");
                                        telefono_profesor = objleer.nextInt();
                                        bandera = objProfesor.Adicionar(nombre_profesor, email_profesor, telefono_profesor);
                                        if (bandera == 0)
                                        {
                                            System.out.println("Error adicionando registro ");
                                        }
                                        else System.out.println("Registro adicionado");
                                break;
                                case 2: result = objProfesor.Consultar();
                                        if (result.next()) 
                                        {
                                            System.out.println("Registro hallado");
                                            if (result.getString("activo").equals("no"))
                                            {
                                                System.out.print("\nEl registro está anulado");
                                            }
                                            else
                                            {
                                                System.out.println("\n Perteneciente al estudiante con la id: " + result.getInt("ID")
                                                + " con el nombre: " + result.getString("nombre")
                                                + " inscrito con el email: " + result.getString("email")
                                                + " registrado con el telefono: " + result.getInt("telefono"));
                                                System.out.println("-----------------------------------------------------");
                                            }
                                        } 
                                        else System.out.println("Registro no existente");
                                break;
                                case 3: System.out.print("Digite el nombre del Profesor: ");
                                        nombre_profesor = objleer.next();
                                        System.out.print("Digite email del Profesor: ");
                                        email_profesor = objleer.next();
                                        System.out.print("Digite telefono del Profesor: ");
                                        telefono_profesor = objleer.nextInt();
                                        //clase modificar estudiante
                                        bandera = objProfesor.Modificar(nombre_profesor, email_profesor, telefono_profesor);
                                        if (bandera == 0){
                                            System.out.println("Error modificando registro ");
                                        }else{
                                            System.out.println("Registro modificado");
                                        }
                                break;
                                case 4: bandera = objProfesor.Anular();
                                        if (bandera == 0) 
                                        {
                                            System.out.println("Error anulando registro");
                                        } 
                                        else
                                        {
                                            System.out.println("Registro ANULADO");
                                            System.out.println("-----------------------------------------------------");
                                        }
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
                            System.out.print("Digite el id de la materia: ");
                            ID_materia = objleer.nextInt();
                            ClsMateria objMateria = new ClsMateria(ID_materia);
                            switch (opcMateria){
                                case 1: //En adicionar hay que verificar que exista
                                    //Estudiante y profesor 
                                    System.out.print("Digite el nombre de la materia: ");
                                    nombre_materia = objleer.next();
                                    System.out.print("Digite El salon: ");
                                    salon = objleer.next();
                                    System.out.print("Digite la id del estudiante: ");
                                    ID_estudiante = objleer.nextInt();
                                    System.out.print("Digite la id del Profesor: ");
                                    ID_profesor = objleer.nextInt();
                                    bandera =  objMateria.Adicionar(nombre_materia, salon, ID_estudiante, ID_profesor);
                                    if (bandera == 0){
                                        System.out.println("Error adicionando registro: Estudiante o Profesor sin registro ");
                                    }else{
                                        System.out.println("Registro adicionado");
                                    }
                                break;
                                case 2: result = objMateria.Consultar();
                                        if (result.next()) 
                                        {
                                            System.out.println("Registro hallado");
                                            if (result.getString("activo").equals("no"))
                                            {
                                                System.out.print("\nEl registro está anulado");
                                            }
                                            else
                                            {
                                                System.out.println("\n Perteneciente a la materia con la id: " + result.getInt("ID_materia")
                                                + " con el nombre: " + result.getString("nombre_materia")
                                                + " asignado al salon: " + result.getString("salon"));
                                                System.out.println("-----------------------------------------------------");
                                            }
                                        } 
                                        else System.out.println("Registro no existente");
                                break;
                                case 3: //hay que verificar que exista
                                    //Estudiante y profesor 
                                    System.out.print("Digite el nombre de la materia: ");
                                    nombre_materia = objleer.next();
                                    System.out.print("Digite El salon: ");
                                    salon = objleer.next();
                                    System.out.print("Digite la id del estudiante: ");
                                    ID_estudiante = objleer.nextInt();
                                    System.out.print("Digite la id del Profesor: ");
                                    ID_profesor = objleer.nextInt();
                                    bandera =  objMateria.Adicionar(nombre_materia, salon, ID_estudiante, ID_profesor);
                                    if (bandera == 0){
                                        System.out.println("Error adicionando registro: Estudiante o Profesor sin registro ");
                                    }else{
                                        System.out.println("Registro adicionado");
                                    }
                                break;
                                case 4: bandera = objMateria.Anular();
                                        if (bandera == 0) 
                                        {
                                            System.out.println("Error anulando registro");
                                        } 
                                        else
                                        {
                                            System.out.println("Registro ANULADO");
                                            System.out.println("-----------------------------------------------------");
                                        }
                                break;
                                default : System.out.println("Adios Materia");
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
