/*
 Materia
 */
package proyecto_final;

import java.sql.ResultSet;

public class ClsMateria extends ClsBaseAbstract{

    public int id;

    public ClsMateria(int id) {
        this.id = id;
    }
    
    @Override
    public void Conexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int bandera;
    ResultSet result;
    
    public int Adicionar(String nombre_materia, String salon, int ID_estudiante, int ID_profesor){
        //Validando que el estudiante y profesor existan
        ClsEstudiante objVerificar = new ClsEstudiante(ID_estudiante);
        ResultSet verificarEstudante = objVerificar.Consultar();
        ClsProfesor objVerificarProfe = new ClsProfesor(ID_profesor);
        ResultSet verificarProfe = objVerificarProfe.Consultar();
        //Falta declarar SQL para utilizar el [.next()]
        /*if(verificarEstudante.next() && verificarProfe.next()){
            //SI entra al IF es pq exixten ent se adiciona el registro
        }else{
        Sino bandera=0;
        }
        */
        
        return bandera;
    }
    
    
    @Override
    ResultSet Consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int Modificar(String nombre_materia, String salon, int ID_estudiante, int ID_profesor){
        //Validando que el estudiante y profesor existan
        ClsEstudiante objVerificar = new ClsEstudiante(ID_estudiante);
        ResultSet verificarEstudante = objVerificar.Consultar();
        ClsProfesor objVerificarProfe = new ClsProfesor(ID_profesor);
        ResultSet verificarProfe = objVerificarProfe.Consultar();
        //Falta declarar SQL para utilizar el [.next()]
        /*if(verificarEstudante.next() && verificarProfe.next()){
            //SI entra al IF es pq exixten ent se adiciona el registro
        }else{
        Sino bandera=0;
        }
        */
        
        return bandera;
    }
    
    @Override
    ResultSet Anular() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
