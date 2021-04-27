import logics.DB_Connection;
import logics.Identity;
import logics.Product;
import logics.ProductMapper;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
//        Connection connection = DB_Connection.getConnection();
//        ProductMapper productMapper = new ProductMapper(connection);
        Identity identity = new Identity();
        Product product = Identity.getProduct(1L);
    }
}
