package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
      try{
          return DriverManager.getConnection("jdbc:mysql://localhost/dbcomjava?useTimezone=true&serverTimezone=America/Sao_Paulo", "root", "");
      }catch (SQLException e){
          throw new RuntimeException(e);
      }
    }
}
