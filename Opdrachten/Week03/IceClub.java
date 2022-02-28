package Week03;

// 0 ( Imports
import java.util.ArrayList;
import java.time.LocalDate;    
import java.time.Period;
/**
 * Ice club membership information
 *
 * @author Stefan Meijer
 * @version 1.0
 */
public class IceClub {
    // 1 ( Fields
    private String iceClubName;
    private ArrayList<Member> members;
    private LocalDate now;
    
    // 2 ( Constructor
    public IceClub(String iceClubName) {
        this.iceClubName =  iceClubName;
        this.members = new ArrayList<>();
        this.now = LocalDate.now();
    }   
    // 3 ( Methods
    public void addMembership (Member member) {
        this.members.add(member);
    }
    
    public double calculateTotalProfit () {
        if(!this.members.isEmpty()) {
            double profit = 0.0;
            for (Member member : this.members) {
                int age = this.getYearsBetweenDateAndNow(member.getDateOfBirth());
                int subscriptionTime = this.getYearsBetweenDateAndNow(member.getDayOfRegistration());
                int multiplier = 100;
                
                if(subscriptionTime >= 5 ){
                    multiplier = 80; //80 = 20% discount
                }

                if (age < 12) {
                    profit += getDiscount(5.0, multiplier);
                } else if (age < 18) {
                    profit += getDiscount(7.5, multiplier);
                } else if (age <= 65) {
                    profit += getDiscount(10.0, multiplier);
                } else {
                    profit += getDiscount(30.35, multiplier);
                }
            }
            return profit;
        }
        return 0.0;
    }
    
    public Member determineOldestMember () {
        if(!this.members.isEmpty()) {
            Member oldestMember = null;
            int calculateAge = 0; //put minimum age
            int age = 0; //put minimum age
            for (Member member : this.members) {
                LocalDate dateOfBirth = member.getDateOfBirth();
                calculateAge = this.getYearsBetweenDateAndNow(dateOfBirth);
                age = Math.max(calculateAge,age);
                if (calculateAge == age) {
                    oldestMember = member;
                }
            }
            return oldestMember;
        }
        return null;
    }
    
    public Member determineYoungestMember () {
        if(!this.members.isEmpty()) {
            Member youngestMember = null;
            int calculateAge = 999; //put maximum age
            int age = 999; //put maximum age
            for (Member member : this.members) {
                LocalDate dateOfBirth = member.getDateOfBirth();
                calculateAge = this.getYearsBetweenDateAndNow(dateOfBirth);
                age = Math.min(calculateAge,age);
                if (calculateAge == age) {
                    youngestMember = member;
                }
            }
            return youngestMember;
        }
        return null;
    }
    
    public Member determineLongestMembership () {
        if(!this.members.isEmpty()) {
            Member longestMember = null;
            LocalDate oldDate = now; //put highest date possible
            for (Member member : this.members) {
                LocalDate dayOfRegistration = member.getDayOfRegistration();
                if (dayOfRegistration.isBefore(oldDate)) {
                    oldDate = dayOfRegistration;
                    longestMember = member;
                }
            }
            return longestMember;
        }
        return null;
    }

    // 4 ( Getters & Setters
    public void setIceClubName (String iceClubName) {
        this.iceClubName = iceClubName;
    }
    
    public String getIceClubName () {
        return this.iceClubName;
    }
    
    public int getYearsBetweenDateAndNow(LocalDate date) {
        return Period.between(date, now).getYears();
    }
    
    public double getDiscount (double euro, int multiplier) {
        return euro / 100 * multiplier;
    }
}
