import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionPostgreSQL {
    // URL de connexion (remplace "affaires_judiciaires" par le nom de ta base)
    private static final String URL = "jdbc:postgresql://localhost:5432/affaires_judiciaires";
    private static final String USER = "postgres";  // Ton utilisateur PostgreSQL
    private static final String PASSWORD = "Rodrigue";  // Mot de passe PostgreSQL

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Connexion à la base
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie à PostgreSQL !");
        } catch (SQLException e) {
            System.err.println("Erreur de connexion : " + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        // Test de connexion
        getConnection();
    }
}