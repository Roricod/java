public class Affaire {
    private String numeroAffaire;
    private String typeAffaire;
    private String dateOuverture;
    private String etatAffaire;

    // Constructeur
    public Affaire(String numeroAffaire, String typeAffaire, String dateOuverture, String etatAffaire) {
        this.numeroAffaire = numeroAffaire;
        this.typeAffaire = typeAffaire;
        this.dateOuverture = dateOuverture;
        this.etatAffaire = etatAffaire;
    }

    // Getters et Setters
    public String getNumeroAffaire() {
        return numeroAffaire;
    }

    public void setNumeroAffaire(String numeroAffaire) {
        this.numeroAffaire = numeroAffaire;
    }

    public String getTypeAffaire() {
        return typeAffaire;
    }

    public void setTypeAffaire(String typeAffaire) {
        this.typeAffaire = typeAffaire;
    }

    public String getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(String dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public String getEtatAffaire() {
        return etatAffaire;
    }

    public void setEtatAffaire(String etatAffaire) {
        this.etatAffaire = etatAffaire;
    }

    @Override
    public String toString() {
        return "Affaire{" +
                "numeroAffaire='" + numeroAffaire + '\'' +
                ", typeAffaire='" + typeAffaire + '\'' +
                ", dateOuverture='" + dateOuverture + '\'' +
                ", etatAffaire='" + etatAffaire + '\'' +
                '}';
    }
}
