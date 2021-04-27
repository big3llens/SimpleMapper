package logics;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Identity {
    private static Map<Long, Product> products = new HashMap<>();
    private static Connection connection = DB_Connection.getConnection();
    private static ProductMapper productMapper = new ProductMapper(connection);

    public static void addPerson(Product product) {
        products.put(product.getId(), product);
    }

    public static Product getProduct(Long key) {
        if (products.containsKey(key)) {
            return products.get(key);
        }
        try {
            Product product = productMapper.findById(key);
            return product;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}
