import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Personne[] personnes = new Personne[5];


        Etudiant etudiant1 = new Etudiant("Faye", "Ousmane", 1990, "fayeousbio@gmail.com", Classe.L3);
        Etudiant etudiant2 = new Etudiant("Diouf", "Ali", 1995, "dioufali@gmail.com", Classe.M1);
        Etudiant etudiant3 = new Etudiant("Diagne", "Saly", 2000, "diagnesaly@gmail.com", Classe.M2);


        Professeur professeur1 = new Professeur("Pape", "Faye", 1980, "fayepape@gmail.com", new String[]{"JAVA", "PHP"});
        Professeur professeur2 = new Professeur("Thomas", "Faye", 1975, "fayethomas@gmail.com", new String[]{"C,C++"});


        personnes[0] = etudiant1;
        personnes[1] = etudiant2;
        personnes[2] = etudiant3;
        personnes[3] = professeur1;
        personnes[4] = professeur2;


        for (Personne personne : personnes) {
            System.out.println(personne.toString());
        }
    }
}
