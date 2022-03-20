package Eindopdracht;

// 0 ( Imports
import java.util.ArrayList;
import java.time.Duration;

/**
 * Informatie van statestiekenregistratie van een atleet.
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class Statestiekenregistratie {
    // 1 ( Fields
    private int rondeAfstand; // In meters
    private ArrayList<Duration> rondeTijden;
    private Atleet atleet;
    
    // 2 ( Constructor
    public Statestiekenregistratie(Atleet atleet) {
        this.rondeAfstand = 400;
        this.atleet = atleet;
    }
    
    // 3 ( Methods
    public void rondeToevoegen () {
        
    }
    
    public String berekenTotaleRondesMetRijd () {
        return "";
    }
    
    public double berekenTotaleAfstandInKM () {
        return 0.0;
    }
    
    public Duration berekenGemiddeldeTijdPerRonde () {
        return null;
    }
    
    public double berekenMaximaleSnelheid () {
        return 0.0;
    }
    
    public Duration berekenTotaletijd () {
        return null;
    }
    
    public Duration berekenSnelsteRondeTijd () {
        return null;
    }
    
    // 4 ( Getters & Setters
    public void setRondeAfstand (int rondeAfstand) {
        this.rondeAfstand = rondeAfstand;
    }
    
    public int getRondeAfstand () {
        return this.rondeAfstand;
    }
    
    public ArrayList<Duration> getRondeTijden () {
        return this.rondeTijden;
    }
    
    public void setAtleet (Atleet atleet) {
        this.atleet = atleet;
    }
    
    public Atleet getAtleet () {
        return this.atleet;
    }
}
