import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper {
    private Connection connection;

    public ProductMapper(Connection connection) {
        this.connection = connection;
    }

    public Product findById(Long idProduct) throws SQLException{
        PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM PRODUCTS WHERE ID = ?");
        statement.setLong(1,idProduct);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getLong(1));
                product.setTitle(resultSet.getString(2));
                product.setPrice(resultSet.getInt(3));
                return product;
            }
        }
        return null;
    }

}
