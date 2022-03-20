package Week04;

// 0 ( Imports
/**
 * Een product dat in de winkel ligt
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class Product {
    // 1 ( Fields
    private String productnaam;
    private double prijs;
    
    // 2 ( Constructor
    public Product (String productnaam, double prijs) {
        this.productnaam = productnaam;
        this.prijs = prijs;
    }
    
    // 3 ( Methods
    
    // 4 ( Getters & Setters
    public void setProductnaam (String productnaam) {
        this.productnaam = productnaam;
    }
    
    public String getProductnaam () {
        return this.productnaam;
    }
    
    public void setPrijs (double prijs) {
        this.prijs = prijs;
    }
    
    public double getPrijs () {
        return this.prijs;
    }
}
