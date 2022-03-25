package Eindopdracht;

// 0 ( Imports
import java.time.LocalDate;

/**
 * Informatie van een Atleet.
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class Atleet {
    // 1 ( Fields
    private String naam;
    private String geslacht;
    private LocalDate geboortedatum;

    // 2 ( Constructor
    public Atleet (String naam, String geslacht, String geboortedatum) {
        this.naam = naam;
        this.geslacht = geslacht;
        this.geboortedatum = LocalDate.parse(geboortedatum);
    }
    // 3 ( Methods
    
    // 4 ( Getters & Setters
    public void setNaam (String naam) {
        this.naam = naam;
    }
    
    public String getNaam () {
        return this.naam;
    }
    
    public void setGeslacht (String geslacht) {
        this.geslacht = geslacht;
    }
    
    public String getGeslacht () {
        return this.geslacht;
    }
    
    public void setGeboortedatum (String geboortedatum) {
        this.geboortedatum = LocalDate.parse(geboortedatum);
    }
    
    public LocalDate getGeboortedatum () {
        return this.geboortedatum;
    }
}
