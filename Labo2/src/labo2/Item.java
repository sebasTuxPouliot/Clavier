
package labo2;



public class Item {
    /* constantes de classes */
    public static final double TAUX_TPS = 0.05;
    public static final double TAUX_TVQ = 0.085;
    
    /* variables de classes */
    private static int nbItemsCrees = 0;
    
    /* variables d'instances */
    private int noUniqueIdentification;
    private String description;
    private double prix;
    boolean TPSApplicable;
    boolean TVQApplicable;
    
    /* constructeur sans paramètres */
    public Item() {
        description = "";
        prix = 0;
        TPSApplicable = false;
        TVQApplicable = false;
        nbItemsCrees = nbItemsCrees + 1;
        noUniqueIdentification = nbItemsCrees;       
    }
    
    public Item(String description, double prix) {
        this();
        this.description = description;
        this.prix = prix;
    }
    
    public Item(String description, double prix, boolean TPSApplicable, boolean TVQApplicable) {
            this(description, prix);
            this.TPSApplicable = TPSApplicable;
            this.TVQApplicable = TVQApplicable;
    }
    
    public Item(Item itemACopier) {
       this(itemACopier.description, itemACopier.prix, 
               itemACopier.TPSApplicable, itemACopier.TVQApplicable); 
    }
    
    /* getters d'instances */
    
    public String getDescription() {
        return description;
    }
    
    public double getPrix() {
        return prix;
    }
    
    public boolean isTPSApplicable() {
        return TPSApplicable;
    }
    
    public boolean isTVQApplicable() {
        return TVQApplicable;
    }
    
    @Override
    public String toString(){
        return "No ident: " + noUniqueIdentification + "\n" + 
               "Descript: " + description + "\n" +
               "Prix: " +  prix + "\n" +
               "TPS : " + TPSApplicable + "\n" +
               "TVQ : " + TVQApplicable + "\n";
        
    }
    
    @Override
    public boolean equals(Object autreItem) {
        return autreItem != null && 
                autreItem.getClass() == this.getClass() &&
                (
                this.description.equals(((Item)autreItem).getDescription()) &&
                (this.prix - ((Item)autreItem).prix < 0.01)
                );
    }
}
