package Week04;

// 0 ( Imports
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Een bestelling bij een winkeltje
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class Bestelling
{
    // 1 ( Fields
    private int bestellingId;
    private Klant klant;
    private LocalDate orderdatum;
    private ArrayList<Product> producten;
    private double serviceKosten = 2.50;
    
    // 2 ( Constructor
    public Bestelling (int bestellingId, Klant klant) {
        this.bestellingId = bestellingId;
        this.klant = klant;
        this.orderdatum = LocalDate.now();
        this.producten = new ArrayList<>();
    }
    
    // 3 ( Methods
    public void addProduct (Product product) {
        this.producten.add(product);
    }
    
    // 4 ( Getters & Setters
    public void setBestellingId (int bestellingId) {
        this.bestellingId = bestellingId;
    }
    
    public int getBestellingId () {
        return this.bestellingId;
    }
    
    public void setKlant (Klant klant) {
        this.klant = klant;
    }
    
    public Klant getKlant () {
        return this.klant;
    }
    
    public void setOrderdatum (LocalDate orderdatum) {
        this.orderdatum = orderdatum;
    }
    
    public LocalDate getOrderdatum () {
        return this.orderdatum;
    }
    
    public void setServiceKosten (double serviceKosten) {
        this.serviceKosten = serviceKosten;
    }
    
    public double getServiceKosten () {
        return this.serviceKosten;
    }
    
    public ArrayList<Product> getProducten () {
        return this.producten;
    }
}
