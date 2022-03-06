package Week04;

// 0 ( Imports
/**
 * Een klant bij een winkeltje
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class Klant
{
    // 1 ( Fields
    private String klantnaam;
    private String adres;
    private String postcode;
    private String stad;
    
    // 2 ( Constructor
    public Klant (String klantnaam, String adres, String postcode, String stad) {
        this.klantnaam = klantnaam;
        this.adres = adres;
        this.postcode = postcode;
        this.stad = stad;
    }
    
    // 3 ( Methods
    
    // 4 ( Getters & Setters
    public void setKlantnaam (String klantnaam) {
        this.klantnaam = klantnaam;
    }
    
    public String getKlantnaam () {
        return this.klantnaam;
    }
    
    public void setAdres (String adres) {
        this.adres = adres;
    }
    
    public String getAdres () {
        return this.adres;
    }
    
    public void setPostcode (String postcode) {
        this.postcode = postcode;
    }
    
    public String getPostcode () {
        return this.postcode;
    }
    
    public void setStad (String stad) {
        this.stad = stad;
    }
    
    public String getStad () {
        return this.stad;
    }
}
