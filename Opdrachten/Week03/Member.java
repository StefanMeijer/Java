package Week03;

// 0 ( imports
import java.time.LocalDate;    
import java.time.format.DateTimeFormatter;

/**
 * Information about a member
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class Member {
    // 1 ( Fields
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private LocalDate dayOfRegistration;
    
    // 2 ( Constructor
    public Member(String firstname, String lastname, String dateOfBirth, String dayOfRegistration) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = LocalDate.parse(dateOfBirth ,DateTimeFormatter.ofPattern("d/MM/yyyy"));
        this.dayOfRegistration = LocalDate.parse(dayOfRegistration ,DateTimeFormatter.ofPattern("d/MM/yyyy"));
    }
    // 3 ( Methods
    
    // 4 ( Getters & Setters
    public void setFirstName (String firstname) {
        this.firstname = firstname;
    }
    
    public String getFirstname () {
        return this.firstname;
    }
    
    public void setLastName (String lastname) {
        this.lastname = lastname;
    }
    
    public String getLastName () {
        return this.lastname;
    }
    
    public void setDateOfBirth (LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public LocalDate getDateOfBirth () {
        return this.dateOfBirth;
    }
    
    public void setDayOfRegistration (LocalDate dayOfRegistration) {
        this.dayOfRegistration = dayOfRegistration;
    }
    
    public LocalDate getDayOfRegistration () {
        return this.dayOfRegistration;
    }
}
