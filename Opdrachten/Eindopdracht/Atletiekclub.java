package Eindopdracht;

// 0 ( Imports
import java.util.ArrayList;
import java.time.Duration;

/**
 * Informatie van een Atletiekclub.
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class Atletiekclub {
    // 1 ( Fields
    private String naam;
    private ArrayList<Statestiekenregistratie> statestiekenregistratie;
    
    // 2 ( Constructor
    public Atletiekclub (String naam) {
        this.naam = naam;
        this.statestiekenregistratie = new ArrayList<>();
    }

    // 3 ( Methods
    public void addStatestiek (Statestiekenregistratie statestiekenregistratie) {
        this.statestiekenregistratie.add(statestiekenregistratie);
    }
    
    public Atleet krijgClubRecord () {
        Duration clubRecord = Duration.parse("P1DT0H0M0S"); //Put highest time possible = 1 day
        Atleet atleet = null;
        
        for (Statestiekenregistratie statestiekenregistratie : this.statestiekenregistratie) {
            int comparedTime = statestiekenregistratie.berekenSnelsteRondeTijd().compareTo(clubRecord);
            
            if (comparedTime == -1) {
                clubRecord = statestiekenregistratie.berekenSnelsteRondeTijd();
                atleet = statestiekenregistratie.getAtleet();
            }
        }
        
        return atleet;
    }
    
    // 4 ( Getters & Setters
    public void setNaam (String naam) {
        this.naam = naam;
    }
    
    public String getNaam () {
        return this.naam;
    }
    
    public ArrayList<Statestiekenregistratie> getStatestiekenregistraties () {
        return this.statestiekenregistratie;
    }
}
