/*
 Clase abstracta para el uso de las funciones necesarias
 */
package proyecto_final;

import java.sql.ResultSet;

public abstract class ClsBaseAbstract {
   
    abstract public void Conexion();
    abstract ResultSet Consultar();
    abstract public int Anular();
}
