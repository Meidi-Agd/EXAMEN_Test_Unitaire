package InventoryManagerTest;

import InventoryManager.InventoryManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryManagerTest {
    private final InventoryManager inventoryManager = new InventoryManager();


    @Test //Cas où le stock est suffisant (par exemple, 100 unités disponibles pour un produit donné)
    public void testSupprCentProduitSuffi() {
        inventoryManager.ajoutProduit("Huawei P60", 100);

        inventoryManager.supprProduct("Huawei P60", 10);
    }

    @Test //Cas où le stock est insuffisant (par exemple, 5 unités disponibles pour un produit donné).
    public void testSupprCinqProduitInsuffi() {
        inventoryManager.ajoutProduit("Huawei P60", 5);

        inventoryManager.supprProduct("Huawei P60", 10);
    }

    @Test //Cas où le stock est épuisé (par exemple, 0 unité disponible pour un produit donné).
    public void testSupprProduitVide() {
        inventoryManager.ajoutProduit("Huawei P60", 0);

        inventoryManager.supprProduct("Huawei P60", 10);
    }

    @Test //Cas où le produit n'existe pas dans l'inventaire.
    public void testSupprProduitIntrouvable() {
        inventoryManager.ajoutProduit("Huawei P60", 0);

        inventoryManager.supprProduct("Huawei P50", 10);
    }

    @Test //Cas où le produit n'existe pas dans l'inventaire.
    public void getStockAvailability() {
        inventoryManager.ajoutProduit("Huawei P60", 667);

        int nbStock = inventoryManager.recupStock("Huawei P60");
        System.out.println("Il y en a " + nbStock + " en stock");
    }

    @Test //Cas où le produit n'existe pas dans l'inventaire.
    public void getStockAvailabilityInexistant() {
        inventoryManager.ajoutProduit("Huawei P60", 667);

        int nbStock = inventoryManager.recupStock("Huawei P50");
        System.out.println("Il y en a " + nbStock + " en stock");
    }
}
