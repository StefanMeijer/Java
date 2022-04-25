package Tentamen;

// 0 ( Imports
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Een vending machine voor snacks
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class VendingMachine {
    // 1 ( Fields
    private double tempratuur;
    private ArrayList<Spiraal> spiralen;
    
    // 2 ( Constructor
    public VendingMachine () {
        this.tempratuur = 8.0;
        this.spiralen = new ArrayList<>();
    }
    
    // 3 ( Methods
    public void spiraalToevoegen (Spiraal spiraal) {
        this.spiralen.add(spiraal);
    }
    
    public ArrayList<Snack> snackOphalen (int code, double geld, int aantal) {
        double totaal = 0.0;
        ArrayList<Snack> gekozenSnack = new ArrayList<>();
        
        if (aantal > 0 && geld > 0.0) {
            for (Spiraal spiraal : this.spiralen) {
                if (spiraal.getCode() == code) {
                    if (spiraal.getAantalSnacks() >= aantal) {
                        int index = 0;
                        while (index < aantal) {
                            Iterator<Spiraal> it = this.spiralen.iterator();
                            while (it.hasNext()) {
                                Spiraal s = it.next();
                                
                                Snack snack = spiraal.getSnacks().get(index);
                                
                                totaal += snack.getPrijs();
                                
                                if (totaal < geld) {
                                    gekozenSnack.add(snack);
                                    spiraal.getSnacks().remove(snack);
                                } else {
                                    System.out.println("Niet genoeg geld in de machine gedaan.");
                                }
                            }
                            index++;
                        }
                    } else {
                        System.out.println("Niet genoeg snacks in de spiraal voor dit aantal.");
                    }
                } else {
                    System.out.println("De ingevoerde code is ongeldig.");
                }
            }
        } else {
            System.out.println("Voer een geldig aantal snacks of geld in.");
        }
        
        return gekozenSnack;
    }
    
    public double benodigdeTempratuur () {
        if (this.getAantalSpiralen() == 6) {
            this.setTempratuur(this.getTempratuur() - 0.2);
        }
        
        if (this.getAantalSpiralen() % 5 == 0) {
            this.setTempratuur(this.getTempratuur() - 0.1);
        }
        
        if (this.getAantalSpiralen() > 8) {
            this.setTempratuur(this.getTempratuur() + 0.1);
        }
        
        return this.getTempratuur();
    }
    
    // 4 ( Getters & Setters
    public void setTempratuur (double tempratuur) {
        this.tempratuur = tempratuur;
    }
    
    public double getTempratuur () {
        return this.tempratuur;
    }
    
    public ArrayList<Spiraal> getSpiralen () {
        return this.spiralen;
    }
    
    public double getAantalSpiralen () {
        return this.spiralen.size();
    }
}
