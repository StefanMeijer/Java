package Week03;


// 0 ( Imports
import java.util.ArrayList;
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
    
    // 2 ( Constructor
    public IceClub(String iceClubName) {
        this.iceClubName =  iceClubName;
        this.members = new ArrayList<>();
    }   
    // 3 ( Methods
    public void addMembership (Member member) {
        this.members.add(member);
    }
    
    public void calculateTotalProfit () {
        
    }
    
    public void determineOldestMember () {
        
    }
    
    public void determineYoungestMember () {
        
    }
    
    public void determineLongestMembership () {
        
    }

    // 4 ( Getters & Setters
    public void setIceClubName (String iceClubName) {
        this.iceClubName = iceClubName;
    }
    
    public String getIceClubName () {
        return this.iceClubName;
    }
}
