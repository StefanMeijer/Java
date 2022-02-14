/**
 * A nice book to read..
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class Book {
    // 1 ) Fields
    private String title;
    private String author;
    private boolean hardcover;
    private double price;
    private int timesRead;
    
    // 2 ) Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.hardcover = true;
        this.price = price;
        this.timesRead = 0;
    }

    // 3 ) Methods
    public void setTimesRead (int timesRead) {
        this.timesRead = timesRead;
    }
}
