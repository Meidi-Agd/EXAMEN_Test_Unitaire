package InventoryManager;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    /**
     * Ajout d'un produit dans l'inventaire
     * @param produit
     * @param quantite
     */
    public void ajoutProduit(String produit, int quantite) {
        this.inventory.put(produit, quantite);
    }

    /**
     * Suppression d'un produit de l'inventaire
     * @param produit
     * @param quantite
     * @throws IllegalArgumentException
     */
    public void supprProduct(String produit, int quantite) throws IllegalArgumentException {
        if (!this.inventory.containsKey(produit)) {
            throw new IllegalArgumentException("Pas de produit trouvé");
        }
        int currentQuantity = this.inventory.get(produit);
        if (quantite > currentQuantity) {
            throw new IllegalArgumentException("Quantité de produit a supprimer trop importante");
        }
        else
            this.inventory.put(produit, currentQuantity - quantite);
    }

    /**
     * Récupération de la quantité d'un produit
     * @param product
     * @return
     */
    public int recupStock(String product) {
        return this.inventory.getOrDefault(product, 0);
    }
}
