package Tentamen;

/**
 * Een snack voor een vending machine
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class Snack {
    // 1 ( Fields
    private String naam;
    private double prijs;
    
    // 2 ( Constructor
    public Snack (String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }
    
    // 4 ( Getters & Setters
    public void setNaam (String naam) {
        this.naam = naam;
    }
    
    public String getNaam () {
        return this.naam;
    }
    
    public void setPrijs (double prijs) {
        this.prijs = prijs;
    }
    
    public double getPrijs () {
        return this.prijs;
    }
}
