
package mikael;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 1886519
 */
public class ConnectionFactory {
    
    private String url;
    private String usr;
    private String pwd;

    public ConnectionFactory() {
        this.url = "jdbc:mysql://localhost/sakila";
        this.usr = "root";
        this.pwd = "1234";
    }
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, usr, pwd);
    }
    
    
    
}