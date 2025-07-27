// package iut.bad;

// public class Homme {
//     private String nom;
//     private String prenom;
//     private int age;

//     public Homme(String nom, String prenom, int age) {
//         this.nom = nom;
//         this.prenom = prenom;
//         this.age = age;
//     }
// }

package iut.bad;

public class Homme extends Humain {
    // Constructeur de la classe Homme
      public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public static void main(String[] args) {
        Femme f = new Femme("Durand", "Marie", 25);
        Homme h = new Homme("Dupont", "Jean", 30);

        h.ami(f);             // appel par défaut
        h.ami(f, 365);        // appel avec durée personnalisée

        h.manger();
        h.boire();

        f.manger();
        f.boire();
    }
}
