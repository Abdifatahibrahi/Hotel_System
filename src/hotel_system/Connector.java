
package hotel_system;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;


public class Connector {
    public Connection createConnection() throws SQLException{
      Connection conn = null;
      MysqlDataSource data = new MysqlDataSource();
      
      data.setServerName("localhost");
      data.setPortNumber(3306);
      data.setUser("root");
      data.setPassword("kudiinbalaya");
      data.setDatabaseName("hotel_system");
      
      conn = (Connection) data.getConnection();
     
      return conn;
    }
}
