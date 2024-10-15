public class Partie {
    private String nom;
    private String role; // Demandeur ou Défendeur
    private String coordonnees;

    public Partie(String nom, String role, String coordonnees) {
        this.nom = nom;
        this.role = role;
        this.coordonnees = coordonnees;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(String coordonnees) {
        this.coordonnees = coordonnees;
    }

    @Override
    public String toString() {
        return "Partie{" +
                "nom='" + nom + '\'' +
                ", role='" + role + '\'' +
                ", coordonnees='" + coordonnees + '\'' +
                '}';
    }
}
