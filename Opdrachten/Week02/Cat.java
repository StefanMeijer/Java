package Week02;

/**
 * A hairy cat
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class Cat {
    // 1 ( Fields
    private String name;
    private double pleasureLevel;

    // 2 ( Constructor
    public Cat(String name) {
        this.name = name;
        this.pleasureLevel = 3.0;
    }
    
    // 3 ( Methods
    public void pleasure() {
        if (this.pleasureLevel <= 4.7) {
            this.pleasureLevel += 0.3;
        } else {
            this.pleasureLevel = 5.0;
        }
    }
    
    public boolean isHappy() {
        return this.pleasureLevel > 3.5;
    }
    
    // 4 ( Getters & Setters
    public void setName (String name) {
        this.name = name;
    }
    
    public String getName () {
        return this.name;
    }
    
    public void setPleasureLevel (double pleasureLevel) {
        this.pleasureLevel = pleasureLevel;
    }
    
    public double getPleasureLevel () {
        return this.pleasureLevel;
    }
}
