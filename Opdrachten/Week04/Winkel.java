package Week04;

// 0 ( Imports
import java.util.ArrayList;


/**
 * Een winkeltje met click & collect
 *
 * @author Stefan Meijer
 * @version 1.0 */
public class Winkel
{
    // 1 ( Fields
    private String winkelnaam;
    private ArrayList<Bestelling> bestellingen;
    private Bestelling bestelling;
    
    // 2 ( Constructor
    public Winkel (String winkelnaam) {
        this.winkelnaam = winkelnaam;
        this.bestellingen = new ArrayList<>();
    }
    
    // 3 ( Methods
    public void plaatsBestelling () {
        
    }
    
    public void bestellingPickUp () {
        
    }
    
    public void verwijderBestellingen () {
        
    }
    
    public void waardeBestellingen () {
        
    }
    // 4 ( Getters & Setters
    public void setWinkelnaam (String winkelnaam) {
        this.winkelnaam = winkelnaam;
    }
    
    public String getWinkelnaam () {
        return this.winkelnaam;
    }
}
