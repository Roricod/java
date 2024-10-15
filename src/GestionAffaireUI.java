import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class GestionAffaireUI extends JFrame {
    private JTextField numeroField, typeField, dateField, etatField;
    private AffaireDAO affaireDAO;

    public GestionAffaireUI() {
        // Configurer la connexion PostgreSQL
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/votre_bdd", "votre_utilisateur", "votre_mdp");
            affaireDAO = new AffaireDAO(conn);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Configuration de la fenêtre principale
        setTitle("Gestion des Affaires");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Champs de saisie pour les informations de l'affaire
        JLabel numeroLabel = new JLabel("Numéro d'Affaire:");
        numeroLabel.setBounds(20, 20, 150, 25);
        add(numeroLabel);

        numeroField = new JTextField();
        numeroField.setBounds(150, 20, 200, 25);
        add(numeroField);

        JLabel typeLabel = new JLabel("Type d'Affaire:");
        typeLabel.setBounds(20, 60, 150, 25);
        add(typeLabel);

        typeField = new JTextField();
        typeField.setBounds(150, 60, 200, 25);
        add(typeField);

        JLabel dateLabel = new JLabel("Date d'Ouverture:");
        dateLabel.setBounds(20, 100, 150, 25);
        add(dateLabel);

        dateField = new JTextField();
        dateField.setBounds(150, 100, 200, 25);
        add(dateField);

        JLabel etatLabel = new JLabel("État de l'Affaire:");
        etatLabel.setBounds(20, 140, 150, 25);
        add(etatLabel);

        etatField = new JTextField();
        etatField.setBounds(150, 140, 200, 25);
        add(etatField);

        // Bouton d'ajout d'une affaire
        JButton ajouterBtn = new JButton("Ajouter Affaire");
        ajouterBtn.setBounds(20, 180, 150, 25);
        add(ajouterBtn);

        ajouterBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero = numeroField.getText();
                String type = typeField.getText();
                String date = dateField.getText();
                String etat = etatField.getText();

                Affaire affaire = new Affaire(numero, type, date, etat);
                affaireDAO.ajouterAffaire(affaire);

                JOptionPane.showMessageDialog(null, "Affaire ajoutée avec succès !");
            }
        });

        // Bouton de liste des affaires
        JButton listerBtn = new JButton("Lister Affaires");
        listerBtn.setBounds(200, 180, 150, 25);
        add(listerBtn);

        listerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Affaire> affaires = affaireDAO.listerAffaires();
                for (Affaire affaire : affaires) {
                    System.out.println(affaire);
                }
            }
        });
    }

    public static void main(String[] args) {
        GestionAffaireUI ui = new GestionAffaireUI();
        ui.setVisible(true);
    }
}

