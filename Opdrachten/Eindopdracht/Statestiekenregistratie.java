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
        this.rondeTijden = new ArrayList<>();
    }
    
    // 3 ( Methods
    public void rondeToevoegen (String tijd) {
        rondeTijden.add(Duration.parse(tijd));
    }
    
    public String berekenTotaleRondesMetTijd () {
        return "";
    }
    
    public double berekenTotaleAfstandInKM () {
        double totaleAfstand = 0.0;
        for (Duration duration : this.rondeTijden) {
            totaleAfstand += 0.4;
        }
        return totaleAfstand;
    }
    
    public Duration berekenGemiddeldeTijdPerRonde () {
        return null;
    }
    
    public double berekenMaximaleSnelheid () {
        return 0.0;
    }
    
    public Duration berekenTotaletijd () {
        long seconds = 0;
        for (Duration tijd : this.rondeTijden) {
            seconds += tijd.toSeconds();
        }
        Duration totaleTijd = Duration.parse("PT" + seconds + "S"); // Put total amount of seconds to duration format
        return totaleTijd;
    }
    
    public Duration berekenSnelsteRondeTijd () {
        Duration lowest = Duration.parse("P1DT0H0M0S"); //Put highest time possible = 1 day
        for (Duration tijd : this.rondeTijden) {
            int comparedTime = tijd.compareTo(lowest);
            
            //1 = higher, 0 = equal, -1 is lower
            if (comparedTime == -1) {
                lowest = tijd;
            }
        }
        return lowest;
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
