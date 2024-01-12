class Professeur extends Personne implements ProfesseurInterface {
    private String[] specialite;

    public Professeur(String nom, String prenom, int anneeNaissance, String email, String[] specialite) {
        super(nom, prenom, anneeNaissance, email);
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        StringBuilder specialitesString = new StringBuilder("[");
        for (int i = 0; i < specialite.length; i++) {
            specialitesString.append(specialite[i]);
            if (i < specialite.length - 1) {
                specialitesString.append(", ");
            }
        }
        specialitesString.append("]");

        return "Professeur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", anneeNaissance=" + anneeNaissance +
                ", email='" + email + '\'' +
                ", specialite=" + specialitesString.toString() +
                '}';
    }

    @Override
    public void enseigner() {
        System.out.println("Le professeur " + nom + " " + prenom + " enseigne");
    }

    @Override
    public void corrigerExamen() {
        System.out.println("Le professeur " + nom + " " + prenom + " corrige un examen");
    }
}


