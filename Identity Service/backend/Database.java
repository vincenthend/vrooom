import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {

    private static final String connection_string = "jdbc:mysql://127.0.0.1:3306/vrooom_account";
    private final String username;
    private final String password;
    private Connection connection;

    public Database() throws Exception {

        connection = null;

        Env env = new Env();
        username = env.getUsername();
        password = env.getPassword();
    }

    public void openConnection() throws Exception {
        connection = DriverManager.getConnection(connection_string, username, password);
    }

    public void closeConnection() throws Exception {
        connection.close();
    }

    public static void main(String[] args) {
        try {
            Database database = new Database();

            database.openConnection();
            database.closeConnection();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}