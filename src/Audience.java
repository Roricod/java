import java.util.List;

public class Audience {
    private String date;
    private String heure;
    private String lieu;
    private List<Partie> participants;

    // Constructor
    public Audience(String date, String heure, String lieu, List<Partie> participants) {
        this.date = date;
        this.heure = heure;
        this.lieu = lieu;
        this.participants = participants;
    }

    // Getters and Setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public List<Partie> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Partie> participants) {
        this.participants = participants;
    }

    // Override toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "Audience{" +
                "date='" + date + '\'' +
                ", heure='" + heure + '\'' +
                ", lieu='" + lieu + '\'' +
                ", participants=" + participants +
                '}';
    }
}
