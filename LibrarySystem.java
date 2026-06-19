import java.util.Scanner;

// Parent Class: Member
class Member {
    int memberId;
    String memberName;

    // Constructor to initialize basic data members
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    // Method to display basic member info
    public void displayDetails() {
        System.out.println("Member ID : " + memberId);
        System.out.println("Member Name : " + memberName);
    }
}

// Child Class: PremiumMember extending Member
class PremiumMember extends Member {
    String membershipType;
    double membershipFee; // Challenge extension field

    // Constructor using super() to call parent constructor
    public PremiumMember(int memberId, String memberName, String membershipType, double membershipFee) {
        super(memberId, memberName); 
        this.membershipType = membershipType;
        this.membershipFee = membershipFee;
    }

    // Overridden method calling super + adding new fields
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Membership Type : " + membershipType);
        System.out.println("Membership Fee : " + membershipFee);
        
        // Challenge extension logic: Active if > 0, else Inactive
        String status = (membershipFee > 0) ? "Active" : "Inactive";
        System.out.println("Membership Status: " + status);
    }
}

// Main Class for Execution
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Prompts
        System.out.println("Enter Member ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        System.out.println("Enter Member Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Membership Type:");
        String type = scanner.nextLine();

        System.out.println("Enter Membership Fee:");
        double fee = scanner.nextDouble();

        System.out.println(); // Blank line for clean output formatting

        // Displaying Expected Output
        System.out.println("Member Details");
        PremiumMember pm = new PremiumMember(id, name, type, fee);
        pm.displayDetails();

        scanner.close();
    }
}