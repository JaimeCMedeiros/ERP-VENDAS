
package erp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jaime
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/erp?user=root&password=root&serverTimezone=UTC & characterEncoding = UTF-8 & useUnicode = yes");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
