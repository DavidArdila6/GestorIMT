
package Operaciones;


import From_End.Gestor;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;


public class CrearTabla {
    public static void main(String[] args) throws SQLException {
        String nombreArchivo = "jdbc:h2:./BD_Gestor";
        
        ConnectionSource conn = new JdbcConnectionSource(nombreArchivo);
        
        TableUtils.createTableIfNotExists(conn, Gestor.class);
    }
}
