package RHR_APP;

import java.util.ArrayList;
import java.util.List;

public class TempArrays {
    private List<String> userFirstNames;
    private List<String> userLastNames;
    private List<String> userUsernames;
    private List<String> userPasswords;
    private List<String> userWorkEmails;
    private List<String> userPersonalEmails;
    private List<String> userHomePhoneNumbers;
    private List<String> userWorkPhoneNumbers;

    public TempArrays() {
        userFirstNames = new ArrayList<>();
        userLastNames = new ArrayList<>();
        userUsernames = new ArrayList<>();
        userPasswords = new ArrayList<>();
        userWorkEmails = new ArrayList<>();
        userPersonalEmails = new ArrayList<>();
        userHomePhoneNumbers = new ArrayList<>();
        userWorkPhoneNumbers = new ArrayList<>();
    }

    public void addUser(String firstName, String lastName, String username, String password, String workEmail, String personalEmail, String workPhoneNumber, String personalPhoneNumber) {
        userFirstNames.add(firstName);
        userLastNames.add(lastName);
        userUsernames.add(username);
        userPasswords.add(password);
        userWorkEmails.add(workEmail);
        userPersonalEmails.add(personalEmail);
        userHomePhoneNumbers.add(workPhoneNumber);
        userWorkPhoneNumbers.add(personalPhoneNumber);
    }

    public void displayEmployees() {
        for (int i = 0; i < userFirstNames.size(); i++) {
            String firstName = userFirstNames.get(i);
            String lastName = userLastNames.get(i);
            String username = userUsernames.get(i);
            String password = userPasswords.get(i);
            String workEmail = userWorkEmails.get(i);
            String personalEmail = userPersonalEmails.get(i);
            String workPhoneNumber = userWorkPhoneNumbers.get(i);
            String personalPhoneNumber = userHomePhoneNumbers.get(i);
            System.out.println("First Name: " + firstName + ", Last Name: " + lastName +
                    ", Username: " + username + ", Password: " + password +
                    ", Work Email: " + workEmail + ", Personal Email: " + personalEmail +
                    ", Work Phone Number: " + workPhoneNumber + ", Personal Phone Number: " + personalPhoneNumber);
        }
    }

    public static void main(String[] args) {
        TempArrays tempArrays = new TempArrays();
        tempArrays.addUser("John", "Doe", "johndoe", "password123", "john.doe@example.com", "john.doe@gmail.com", "+1234567890", "+1987654321");
        tempArrays.addUser("Jane", "Smith", "janesmith", "password456", "jane.smith@example.com", "jane.smith@gmail.com", "+1987654321", "+1234567890");
        tempArrays.addUser("", "", "", "", "", "", "", "");
        
        tempArrays.displayEmployees();
    }
}
