
package labo2;

public class ItemInventaire extends Item {
    /* variables d'instances */
    private int qteEnStock = 0;
    private int qteMinimumRequise = 0;
    
    ItemInventaire() {
        super();
    }
    
    ItemInventaire(String description, double prix) {
        super(description, prix);
    }
    
    ItemInventaire(String description, double prix,
            boolean TPSApplicable, boolean TVQApplicable){
        super(description, prix, TPSApplicable, TVQApplicable);
    }
    
    ItemInventaire(String description, double prix,
            boolean TPSApplicable, boolean TVQApplicable, 
            int qteEnStock, int qteMinimumRequise){
        super(description, prix, TPSApplicable, TVQApplicable);
        this.qteEnStock = qteEnStock;
        this.qteMinimumRequise = qteMinimumRequise;
    }
    
    /* Constructeur de copie */
    ItemInventaire(ItemInventaire itemACopier) {
        super(itemACopier);
        qteEnStock = itemACopier.qteEnStock;
        qteMinimumRequise = itemACopier.qteMinimumRequise;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "Qte stock: " + qteEnStock + "\n" +
                "Qte min: " + qteMinimumRequise + "\n";
    }
    
    public boolean equals(Object autreItem) {
        return super.equals(autreItem) &&
                this.qteEnStock == ((ItemInventaire)autreItem).qteEnStock &&
                this.qteMinimumRequise == ((ItemInventaire)autreItem).qteMinimumRequise;
    }
}
