package Week04;

// 0 ( Imports
import java.util.ArrayList;
import java.util.Iterator;
import java.time.LocalDate;
import java.time.Period;

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
    
    // 2 ( Constructor
    public Winkel (String winkelnaam) {
        this.winkelnaam = winkelnaam;
        this.bestellingen = new ArrayList<>();
    }
    
    // 3 ( Methods
    public String plaatsBestelling (Bestelling bestelling) {
        double totaleWaarde = 0.0;
        for (Product product : bestelling.getProducten()) {
            totaleWaarde += product.getPrijs();
        }
        
        if (totaleWaarde >= 15) {
            this.bestellingen.add(bestelling);
            
            //Uitgeschakeld tot verdere informatie.
            //    int aantal = 0;
            //    for (Bestelling bestelling : this.bestellingen) {
            //        aantal++;
            //    }
            //    Bestelling bestelling = new Bestelling(aantal, klant);
            //    this.bestellingen.add(bestelling);
            
            return "Bestelling geplaatst";
        } else {
            return "Bestelling heeft een kleinere waarde dan 15 euro.";
        }
    }
    
    public Bestelling bestellingPickUp (int bestellingId, Klant klant) {
        Bestelling pickupBestelling = null;
        for (Bestelling bestelling : this.bestellingen) {
            if (bestelling.getBestellingId() == bestellingId && bestelling.getKlant() == klant) {
                pickupBestelling = bestelling;
                this.bestellingen.remove(bestelling);
                return pickupBestelling;
            }
        }
        return pickupBestelling;
    }
    
    public void verwijderBestellingen () {
        LocalDate nu = LocalDate.now();
        Iterator<Bestelling> iterator = this.bestellingen.iterator();
        
        while (iterator.hasNext()) {
            Bestelling bestelling = iterator.next();
            if (Period.between(bestelling.getOrderdatum(), nu).getDays() == 14) {
                iterator.remove();
            }
        }
    }
    
    public double waardeBestellingen () {
        double totaleWaarde = 0.0;
        for (Bestelling bestelling : this.bestellingen) {
            for (Product product : bestelling.getProducten()) {
                totaleWaarde += product.getPrijs();
            }
            totaleWaarde += bestelling.getServiceKosten();
        }
        return totaleWaarde;
    }
    
    // 4 ( Getters & Setters
    public void setWinkelnaam (String winkelnaam) {
        this.winkelnaam = winkelnaam;
    }
    
    public String getWinkelnaam () {
        return this.winkelnaam;
    }
    
    public ArrayList<Bestelling> getBestellingen () {
        return this.bestellingen;
    }
}
