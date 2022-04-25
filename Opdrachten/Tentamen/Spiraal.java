package Tentamen;

// 0 ( Imports
import java.util.ArrayList;

/**
 * Een spiraal met snacks
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class Spiraal {
    // 1 ( Fields
    private int code;
    private ArrayList<Snack> snacks;
    
    // 2 ( Constructor
    public Spiraal (int code) {
        this.code = code;
        this.snacks = new ArrayList<>();
    }
    
    // 3 ( Methods
    public void snackToevoegen (Snack snack) {
        if (this.getAantalSnacks() < 12) {
            if (this.getAantalSnacks() > 0) {
                for (Snack snacksInSpiraal : this.snacks) {
                    if (snacksInSpiraal.getNaam() == snack.getNaam()) {
                        snacks.add(snack);
                    } else {
                        System.out.println("De gekozen snack hoort niet thuis in deze spiraal.");
                    }
                }
            } else {
                this.snacks.add(snack);
            }
        } else {
            System.out.println("Spiraal zit vol.");
        }
    }
    
    // 4 ( Getters & Setters
    public void setCode (int code) {
        this.code = code;
    }
    
    public int getCode () {
        return this.code;
    }
    
    public ArrayList<Snack> getSnacks () {
        return this.snacks;
    }
    
    public int getAantalSnacks () {
        return this.snacks.size();
    }
}
