 public class Decision {
        private String dateDecision;
        private String resumeDecision;
        private String resultat;
    
        public Decision(String dateDecision, String resumeDecision, String resultat) {
            this.dateDecision = dateDecision;
            this.resumeDecision = resumeDecision;
            this.resultat = resultat;
        }
    
        public String getDateDecision() {
            return dateDecision;
        }
    
        public void setDateDecision(String dateDecision) {
            this.dateDecision = dateDecision;
        }
    
        public String getResumeDecision() {
            return resumeDecision;
        }
    
        public void setResumeDecision(String resumeDecision) {
            this.resumeDecision = resumeDecision;
        }
    
        public String getResultat() {
            return resultat;
        }
    
        public void setResultat(String resultat) {
            this.resultat = resultat;
        }
    
        @Override
        public String toString() {
            return "Decision{" +
                    "dateDecision='" + dateDecision + '\'' +
                    ", resumeDecision='" + resumeDecision + '\'' +
                    ", resultat='" + resultat + '\'' +
                    '}';
        }
    }
    
