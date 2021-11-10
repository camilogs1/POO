/*
 Estudiante
 */
package proyecto_final;

import java.sql.ResultSet;

public class ClsEstudiante extends ClsBaseAbstract{

    public int id;

    public ClsEstudiante(int ID) {
        this.id = ID;
    }
        
    int bandera=0;
    ResultSet result;
    
    @Override
    public void Conexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int Adicionar(String nombre_estudiante, String carrera, String email_estudiante, int telefono_estudiante){
        //ID YA ESTA DECLARADO EN EL CONSTRUCTOR NO HAY
        //          QUE PASARLA COMO PARAMETRO
        //SQL
        return bandera;
    }

    @Override
    ResultSet Consultar() {
        //Esto es pq todavia no se retorna nada...
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    ResultSet Anular() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public int Modificar(String nombre_estudiante, String carrera, String email_estudiante, int telefono_estudiante){
        //ID YA ESTA DECLARADO EN EL CONSTRUCTOR NO HAY
        //          QUE PASARLA COMO PARAMETRO
        //SQL
        return bandera;
    }
}
