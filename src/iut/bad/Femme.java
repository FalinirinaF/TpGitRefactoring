// package iut.bad;

// public class Femme {
//     private String nom;
//     private String prenom;
//     private int age;

//     public Femme(String nom, String prenom, int age) {
//         this.nom = nom;
//         this.prenom = prenom;
//         this.age = age;
//     }
// }


package iut.bad;

public class Femme extends Humain {
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public static void main(String[] args) {
    Homme h = new Homme("Dupont", "Jean", 30);
    Femme f = new Femme("Durand", "Marie", 28);

    f.ami(h);
    f.ami(h, 200);

    // 👇 Test de boire() et manger()
    f.manger();
    f.boire();

    h.manger();
    h.boire();
    }

}
