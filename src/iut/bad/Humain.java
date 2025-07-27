package iut.bad;

// public class Humain
public abstract class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void details() {
        System.out.println(toString());
    }

    // public void manger() {
    // System.out.println(prenom + " mange.");
    // }

    // public void boire() {
    //     System.out.println(prenom + " boit.");
    // }

    // Implementation de l'interface Consommation
    @Override
    public void manger() {
        System.out.println(prenom + " mange.");
    }

    // Implementation de l'interface Consommation
    @Override
    public void boire() {
        System.out.println(prenom + " boit.");
    }

    // Methode toString pour afficher les detailes de l'humain
    @Override
    public String toString() {
        return nom + " " + prenom + ", " + age + " ans";
    }

    // public void ami(Humain h) {
    // System.out.println(this.prenom + " est ami avec " + h.prenom);
    // }

    // surcharge
    // Méthode ami avec paramètre par défaut
    public void ami(Humain h) {
    ami(h, 100); // appel par défaut
    }

    // Methode ami avec parametre de duree
    public void ami(Humain h, int duree) {
        System.out.println(this.prenom + " est ami avec " + h.prenom + " depuis " + duree + " jours.");
    }

}
