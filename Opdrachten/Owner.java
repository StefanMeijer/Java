/**
 * An owner of a cat
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class Owner {
    // 1 ( Fields
    private Cat cat;
    private String name;

    // 2 ( Constructor
    public Owner(String name) {
        this.name = name;
    }
    
    // 3 ( Methods
    public void adoptCat (Cat cat) {
        this.cat = cat;
    }
    
    public boolean hasCat () {
        return this.cat != null;
    }
    
    public void pleasure () {
       if (this.hasCat()) {
          this.cat.pleasure();  
       }
    }
    
    public boolean isHappy () {
        if (this.hasCat()) {
            return this.cat.isHappy(); 
        } else {
            return false;
        }
    }
    
    // 4 ( Getters & Setters
    public void getCatname () {
        if (this.hasCat()) {
           System.out.println(this.cat.getName()); 
        }
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public String getName () {
        return this.name;
    }
}
