/*
 Profesor
 */
package proyecto_final;

import java.sql.ResultSet;

public class ClsProfesor extends ClsBaseAbstract{

    public int id;

    public ClsProfesor(int id) {
        this.id = id;
    }
    
    int bandera;
    ResultSet result;
    
    @Override
    public void Conexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int Adicionar(String nombre_profesor, String email_profesor, int telefono_profesor){
        //ID YA ESTA DECLARADO EN EL CONSTRUCTOR NO HAY
        //          QUE PASARLA COMO PARAMETRO
        //SQL
        return bandera;
    }
    
    @Override
    ResultSet Consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    ResultSet Anular() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    
     public int Modificar(String nombre_profesor, String email_profesor, int telefono_profesor){
        //ID YA ESTA DECLARADO EN EL CONSTRUCTOR NO HAY
        //          QUE PASARLA COMO PARAMETRO
        //SQL
        return bandera;
    }
}
