import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
    {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Драйвер не найден");
        }
    }

    public static Connection getConnection (){
        try {
            return DriverManager.getConnection("jdbc:h2:test", "sa", "");
//                                                  jdbc:mysql://localhost:3306/?user=root   ?autoReconnect=true&useSSL=false   &useSSL=false
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
