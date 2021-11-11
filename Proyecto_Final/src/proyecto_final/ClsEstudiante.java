/*
 Estudiante
 */
package proyecto_final;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClsEstudiante extends ClsBaseAbstract{

    Connection cnnConnection;
    Statement state;
    ResultSet result;

    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/base_universidad?zeroDateTimeBehavior=convertToNull";
    String user = "root";
    String password = "";
    
    public int id;

    public ClsEstudiante(int ID) {
        this.id = ID;
    }
        
    int bandera;
    
    @Override
    public void Conexion() {
        try {
            Class.forName(driver);
            cnnConnection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(ClsEstudiante.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public int Adicionar(String nombre_estudiante, String carrera, String email_estudiante, int telefono_estudiante){
        Conexion();
        bandera = 0;
        String queryII = "INSERT INTO estudiante (ID, nombre, carrera, email, telefono) " +
                        "VALUES ('"+id+"', '"+nombre_estudiante+"', '"+carrera+"',"
                        + " '"+email_estudiante+"', "+telefono_estudiante+")";
        try {
            state = cnnConnection.createStatement();
            bandera = state.executeUpdate(queryII);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bandera;
    }

    @Override
    ResultSet Consultar() {
        try {
            Conexion();
            state = cnnConnection.createStatement();
            result = state.executeQuery("SELECT * FROM estudiante WHERE ID = '"+id+"'");
        } catch (SQLException e){
            Logger.getLogger(ClsEstudiante.class.getName()).log(Level.SEVERE, null, e);
        }
        return result;
    }

    @Override
    public int Anular() {
        Conexion();
        bandera = 0;
        String Pactivo="no";
        String queryII = "UPDATE estudiante SET activo = '"+Pactivo+"' WHERE (ID = '"+id+"')";
        try {
            state = cnnConnection.createStatement();
            bandera = state.executeUpdate(queryII);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bandera;
    }
    
    public int Modificar(String nombre_estudiante, String pcarrera, String email_estudiante, int telefono_estudiante){
        Conexion();
        bandera = 0;
        String queryII = "UPDATE estudiante SET nombre = '"+nombre_estudiante+"', carrera = '"+pcarrera+"',"
                       + " email = '"+email_estudiante+"', telefono = '"+telefono_estudiante+"' WHERE ID = '"+id+"'";
        try {
            state = cnnConnection.createStatement();
            bandera = state.executeUpdate(queryII);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bandera;
    }
}