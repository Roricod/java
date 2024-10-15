public class Main {
    public class MainApp {

        public static void main(String[] args) {
            System.out.println("Bienvenue dans l'application de gestion des dossiers judiciaires !");
            
            // Vous pouvez tester ici les différentes fonctionnalités
            Affaire affaire1 = new Affaire("AFF123", "Criminel", "2024-10-08", "Ouverte");
            System.out.println("Affaire: " + affaire1.getNumeroAffaire() + " créée avec succès.");
            
            // Ajoutez d'autres tests de vos objets ou méthodes ici
        }
    }
     
}
