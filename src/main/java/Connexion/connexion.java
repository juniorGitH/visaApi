
package Connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MxMElmBs
 */
public class connexion {

    public static Connection connecter() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Renseignement des identifiants de la connexion
        String url = "jdbc:mysql://localhost:3306/visa";
        String username = "root";
        String password = "";
        //Code de connexion
        try {
            Connection con;
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Reussie");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(connexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
