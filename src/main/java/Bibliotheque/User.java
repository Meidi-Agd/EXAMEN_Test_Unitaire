package Bibliotheque;

import java.util.List;

public class User {
    /**
     * Déclaration des variables en private
     */
    private String name;
    private List<Book> borrowedBooks;

    /**
     * Création de l'objet book
     * @param name
     * @param borrowedBooks
     */
    public User(String name, List<Book> borrowedBooks) {
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    /**
     * Récupération du titre
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Récupération de l'auteur
     * @return
     */
    public String getborrowedBooks(){
        return borrowedBooks.toString()
                ;
    }
}
