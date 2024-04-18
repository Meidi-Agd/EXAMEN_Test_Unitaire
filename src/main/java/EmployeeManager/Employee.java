package EmployeeManager;

public class Employee {
    /**
     * Déclaration des variables en private
     */
    private String nom;
    private String prenom;
    private int anneeExp;
    private String niveau;

    /**
     * Création de l'objet employee
     * @param nom
     * @param prenom
     * @param anneeExp
     * @param niveau
     */
    public Employee(String nom, String prenom, int anneeExp, String niveau) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeExp = anneeExp;
        this.niveau = niveau;
    }

    /**
     * Récupération du Nom
     * @return le Nom en string
     */
    public String getNom() {
        return nom;
    }

    /**
     * Récupération du Prenom
     * @return le Prenom en string
     */
    public String getPrenom(){
        return prenom;
    }

    /**
     * Récupération du nombre d'année Exp
     * @return le nombre d'année d'experience en int
     */
    public int getAnneeExp(){
        return anneeExp;
    }

    /**
     * Récupération du nom du niveau
     * @return le nom du niveau en string
     */
    public String getNiveau(){
        return niveau;
    }
}
