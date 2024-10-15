 public class Preuve {
        private String description;
        private String typePreuve; // Document, Témoin, etc.
        private String statut;
    
        public Preuve(String description, String typePreuve, String statut) {
            this.description = description;
            this.typePreuve = typePreuve;
            this.statut = statut;
        }
    
        public String getDescription() {
            return description;
        }
    
        public void setDescription(String description) {
            this.description = description;
        }
    
        public String getTypePreuve() {
            return typePreuve;
        }
    
        public void setTypePreuve(String typePreuve) {
            this.typePreuve = typePreuve;
        }
    
        public String getStatut() {
            return statut;
        }
    
        public void setStatut(String statut) {
            this.statut = statut;
        }
    
        @Override
        public String toString() {
            return "Preuve{" +
                    "description='" + description + '\'' +
                    ", typePreuve='" + typePreuve + '\'' +
                    ", statut='" + statut + '\'' +
                    '}';
        }
    }
    
