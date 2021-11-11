/*
 Materia
 */
package proyecto_final;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClsMateria extends ClsBaseAbstract{
    
    Connection cnnConnection;
    Statement state;
    ResultSet result;

    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/base_universidad?zeroDateTimeBehavior=convertToNull";
    String user = "root";
    String password = "";
    
    public int id;

    public ClsMateria(int id) {
        this.id = id;
    }
    
    @Override
    public void Conexion() {
    try {
            Class.forName(driver);
            cnnConnection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(ClsMateria.class.getName()).log(Level.SEVERE, null, e);
        }
   }

    int bandera;
    
    public int Adicionar(String nombre_materia, String salon, int ID_estudiante, int ID_profesor) throws SQLException{
        Conexion();
        //Validando que el estudiante y profesor existan
        ClsEstudiante objVerificar = new ClsEstudiante(ID_estudiante);
        ResultSet verificarEstudiante = objVerificar.Consultar();
        ClsProfesor objVerificarProfe = new ClsProfesor(ID_profesor);
        ResultSet verificarProfe = objVerificarProfe.Consultar();
        //Falta declarar SQL para utilizar el [.next()]
        if(verificarEstudiante.next() && verificarProfe.next())
        {
            //SI entra al IF es pq exixten ent se adiciona el registro
            bandera = 0;
            String queryII = "INSERT INTO materia (ID_materia, nombre_materia, salon, ID_profesor, ID_estudiante) " +
                        "VALUES ('"+id+"', '"+nombre_materia+"', '"+salon+"',"
                        + " '"+ID_profesor+"', "+ID_estudiante+")";
            try {
                state = cnnConnection.createStatement();
                bandera = state.executeUpdate(queryII);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else
        {
            //este es el error
            bandera=0;
        }
        return bandera;
    }
    
    
    @Override
    ResultSet Consultar() {
        try {
            Conexion();
            state = cnnConnection.createStatement();
            result = state.executeQuery("SELECT * FROM materia WHERE ID_materia = '"+id+"'");
        } catch (SQLException e){
            Logger.getLogger(ClsMateria.class.getName()).log(Level.SEVERE, null, e);
        }
        return result;
    }

    public int Modificar(String nombre_materia, String salon, int ID_estudiante, int ID_profesor) throws SQLException{
        //Validando que el estudiante y profesor existan
        Conexion();
        ClsEstudiante objVerificar = new ClsEstudiante(ID_estudiante);
        ResultSet verificarEstudante = objVerificar.Consultar();
        ClsProfesor objVerificarProfe = new ClsProfesor(ID_profesor);
        ResultSet verificarProfe = objVerificarProfe.Consultar();
        //Falta declarar SQL para utilizar el [.next()]
        if(verificarEstudante.next() && verificarProfe.next()){
            bandera = 0;
            //SI entra al IF es pq exixten ent se adiciona el registro
            String queryII = "UPDATE materia SET nombre_materia = '"+nombre_materia+"', salon = '"+salon+"',"
                       + " ID_profesor = '"+ID_profesor+"', ID_estudiante = '"+ID_estudiante+"' WHERE (ID_materia = '"+id+"')";
            try {
                state = cnnConnection.createStatement();
                bandera = state.executeUpdate(queryII);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else
        {
        bandera=0;
        }
        
        return bandera;
    }
    
    public int Anular() {
        Conexion();
        bandera = 0;
        String Pactivo="no";
        String queryII = "UPDATE materia SET activo = '"+Pactivo+"' WHERE (ID_materia = '"+id+"')";
        try {
            state = cnnConnection.createStatement();
            bandera = state.executeUpdate(queryII);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bandera;
    }
}
