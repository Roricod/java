import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AffaireDAO {

    private Connection conn;

    public AffaireDAO(Connection conn) {
        this.conn = conn;
    }

    // Ajouter une affaire dans la base de données
    public void ajouterAffaire(Affaire affaire) {
        String sql = "INSERT INTO affaires (numeroAffaire, typeAffaire, dateOuverture, etatAffaire) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, affaire.getNumeroAffaire());
            stmt.setString(2, affaire.getTypeAffaire());
            stmt.setString(3, affaire.getDateOuverture());
            stmt.setString(4, affaire.getEtatAffaire());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Lister toutes les affaires
    public List<Affaire> listerAffaires() {
        List<Affaire> affaires = new ArrayList<>();
        String sql = "SELECT * FROM affaires";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Affaire affaire = new Affaire(
                        rs.getString("numeroAffaire"),
                        rs.getString("typeAffaire"),
                        rs.getString("dateOuverture"),
                        rs.getString("etatAffaire")
                );
                affaires.add(affaire);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return affaires;
    }

    // Modifier une affaire existante
    public void modifierAffaire(Affaire affaire) {
        String sql = "UPDATE affaires SET typeAffaire = ?, dateOuverture = ?, etatAffaire = ? WHERE numeroAffaire = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, affaire.getTypeAffaire());
            stmt.setString(2, affaire.getDateOuverture());
            stmt.setString(3, affaire.getEtatAffaire());
            stmt.setString(4, affaire.getNumeroAffaire());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Supprimer une affaire
    public void supprimerAffaire(String numeroAffaire) {
        String sql = "DELETE FROM affaires WHERE numeroAffaire = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, numeroAffaire);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

