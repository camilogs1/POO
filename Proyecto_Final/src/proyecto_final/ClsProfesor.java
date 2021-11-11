/*
 Profesor
 */
package proyecto_final;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClsProfesor extends ClsBaseAbstract{
    
    Connection cnnConnection;
    Statement state;
    ResultSet result;

    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/base_universidad?zeroDateTimeBehavior=convertToNull";
    String user = "root";
    String password = "";

    public int id;

    public ClsProfesor(int id) {
        this.id = id;
    }
    
    int bandera;
    
    @Override
    public void Conexion() {
        try {
            Class.forName(driver);
            cnnConnection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(ClsProfesor.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public int Adicionar(String nombre_profesor, String email_profesor, int telefono_profesor){
        Conexion();
        bandera = 0;
        String queryII = "INSERT INTO profesor (ID, nombre, email, telefono) " +
                        "VALUES ('"+id+"', '"+nombre_profesor+"', '"+email_profesor+"',"
                        + " '"+telefono_profesor+"')";
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
            result = state.executeQuery("SELECT * FROM profesor WHERE ID = '"+id+"'");
        } catch (SQLException e){
            Logger.getLogger(ClsProfesor.class.getName()).log(Level.SEVERE, null, e);
        }
        return result;
    }

    public int Anular() {
        Conexion();
        bandera = 0;
        String Pactivo="no";
        String queryII = "UPDATE profesor SET activo = '"+Pactivo+"' WHERE (ID = '"+id+"')";
        try {
            state = cnnConnection.createStatement();
            bandera = state.executeUpdate(queryII);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bandera;
    } 
    
     public int Modificar(String nombre_profesor, String email_profesor, int telefono_profesor){
        Conexion();
        bandera = 0;
        String queryII = "UPDATE profesor SET nombre = '"+nombre_profesor+"',"
                + "email = "+email_profesor+", telefono = "+telefono_profesor+" WHERE (ID = '"+id+"')";
        try {
            state = cnnConnection.createStatement();
            bandera = state.executeUpdate(queryII);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bandera;
    }
}
