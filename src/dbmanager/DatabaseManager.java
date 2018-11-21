package dbmanager;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseManager {
    private String databasePath;
    private Connection connection;

    public DatabaseManager(String databasePath) {
        this.databasePath = databasePath;
        connect();
    }

    private void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + databasePath);
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
