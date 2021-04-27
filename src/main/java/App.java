import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        Connection connection = DB_Connection.getConnection();
        ProductMapper productMapper = new ProductMapper(connection);
    }
}
