import java.sql.Connection;

public class ProductMapper {
    private Connection connection;

    public ProductMapper(Connection connection) {
        this.connection = connection;
    }
}
