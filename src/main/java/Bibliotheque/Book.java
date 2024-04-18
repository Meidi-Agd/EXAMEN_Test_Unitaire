package Bibliotheque;

public class Book {
    /**
     * Déclaration des variables en private
     */
    private String titre;
    private String author;

    /**
     * Création de l'objet book
     * @param titre
     * @param author
     */
    public Book(String titre, String author) {
        this.titre = titre;
        this.author = author;
    }

    /**
     * Récupération du titre
     * @return
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Récupération de l'auteur
     * @return
     */
    public String getAuthor(){
        return author;
    }
}
