package RHR_APP;
import java.util.Scanner;

abstract class User{
    // class variables
    public Scanner scn = new Scanner(System.in);
    public String firstName;
    public String lastName;
    public String classification;
    public String userID;
    public String username;
    public String password;
    public String workEmail;
    public String workPhoneNumber;
    public boolean loggedIn = false;

    // Maybe add clockedIn and Age
    

    // default constructor
    public User() {
    }

    // public User(String FirstName, String LastName, String UserID, String UserName, String Password, String WorkEmail, String PersonalEmail, String HomePhoneNumber, String WorkPhoneNumber) {
    //     this.firstName = FirstName;
    //     this.lastName = LastName;
    //     this.userID = UserID;
    //     this.username = UserName;
    //     this.password= Password;
    //     this.workEmail = WorkEmail;
    //     this.personalEmail = PersonalEmail;
    //     this.homePhoneNumber = HomePhoneNumber;
    //     this.workPhoneNumber = WorkPhoneNumber;
    // }

    public User(String FirstName, String LastName, String Classification, String UserID, String Username, String Password, String WorkEmail, String WorkPhoneNumber) {
        setFirstName(FirstName);
        setLastName(LastName);
        setClassification(Classification);
        setUserID(UserID);
        setUsername(Username);
        setPassword(Password);
        setWorkEmail(WorkEmail);
        setWorkPhoneNumber(WorkPhoneNumber);
    }

    ///// MUTATORS /////

    public void setFirstName(String FirstName) {
        /*
        while (!validName(FirstName)) {
            System.out.println("Invalid. Enter first name again.");
            FirstName = scn.nextLine();
        }
        */
        this.firstName = FirstName;
    }

    public void setLastName(String LastName) {
        while (!validName(LastName)) {  // validName shown in class
            System.out.println("Invalid. Enter last name again.");
            LastName = scn.nextLine();
        }
        this.lastName = LastName;
    }

    public void setClassification(String Classification) {
        this.classification = Classification;
    }
    
    public void setUserID(String UserID) {
        this.userID = UserID;
    }

    public void setUsername(String Username) {
        this.username = Username;
    }

    public void setPassword(String Password) {
        while (!validPassword(Password)) {
            System.out.println("Invalid. Enter password again.");
            Password = scn.nextLine();
        }
        this.password = Password;
    }

    public void setWorkEmail(String WorkEmail) {
        while (!validEmail(WorkEmail)) {
            System.out.println("Invalid email address. Enter again.");
            WorkEmail = scn.nextLine();
        }
        this.workEmail = WorkEmail;
    }

    public void setWorkPhoneNumber(String WorkPhoneNumber) {
        this.workPhoneNumber = WorkPhoneNumber;
    }

    public void setLoggedInStatus(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
    
    ///// END OF MUTATORS /////


    ///// ACCESSORS /////

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getClassification() {
        return classification;
    }

    public String getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public boolean getLoggedInStatus() {
        return loggedIn;
    }
    

    ///// END OF ACCESSORS /////


    ///// METHODS /////

    //MORE NEEDED FOR ALL VARIABLES

    public void displayUserInfo() {
        System.out.print(this.firstName);
        System.out.print(" ");
        System.out.print(this.lastName);
        System.out.print(" ");
        System.out.print(this.classification);
        System.out.print(" ");
        System.out.print(this.userID);
        System.out.print(" ");
        System.out.print(this.username);
        System.out.print(" ");
        System.out.print(this.password);
        System.out.print(" ");
        System.out.print(this.workEmail);
        System.out.print(" ");
        System.out.print(this.workPhoneNumber);
        System.out.println();
    }
    
    public void editUserInfo() {
        System.out.println("Edit User Info:");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Username");
        System.out.println("4. Password");
        System.out.println("5. Work Email");
        System.out.println("6. Work Phone Number");
        System.out.println("7. Exit Account Edit Menu");
        
        int input = scn.nextInt();
        
            switch (input) {
                case 1:
                    System.out.println("Enter New First Name");
                    setFirstName(scn.nextLine());
                    break;
                case 2:
                    System.out.println("Enter New Last Name");
                    setLastName(scn.nextLine());
                    break;
                case 3:
                    System.out.println("Enter New Username");
                    setUsername(scn.nextLine());
                    break;
                case 4:
                    System.out.println("Enter New Password");
                    setPassword(scn.nextLine());
                    break;
                case 5:
                    System.out.println("Enter New Work Email");
                    setWorkEmail(scn.nextLine());
                    break;
                case 6:
                    System.out.println("Enter New Work Phone Number");
                    setWorkPhoneNumber(scn.nextLine());
                    break;
                case 7:
                    System.out.println("Exiting Account Edit Menu");
                    break;
                default:
                    System.out.println("Invalid Input");
                    System.out.println();
                    editUserInfo();
                    break;
            }

        
        
    }


    // Done, needs testing
    private boolean validEmail(String checkEmail) {
        boolean passes = true;
        int i = 0;
        char c;
        int numberOfAtSigns = 0;
        boolean numberOfCharactersAfterDotPasses = false;
        int dotLocation = 0;

        while (i < checkEmail.length() && passes) {
            c = checkEmail.charAt(i);
            // checks that email does not contain any invalid characters
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '@' || c == '.')) {
                passes = false;
            }
            // checks that @ sign and . are not at the beginning of the email
            if (c == '@') {
                numberOfAtSigns++;
                if (i == 0) {
                    passes = false;
                }
            } else if (c == '.') {
                dotLocation = i;
                if (i == 0) {
                    passes = false;
                }
            }
            i++;
        }
        int numberOfCharactersAfterLastDot = (checkEmail.length() - 1) - dotLocation;

        // checks that email has valid TLD
        if (numberOfCharactersAfterLastDot == 3 || numberOfCharactersAfterLastDot == 2) {
            numberOfCharactersAfterDotPasses = true;
        }

        // checks that email has only one @ sign, and the number of characters after the last dot is correct
        if (!(numberOfAtSigns == 1 && numberOfCharactersAfterDotPasses == true)) {
            passes = false;
        }
        return passes;

    }

    // Done, needs testing
    private boolean validPassword(String checkPassword) {
        boolean hasAlphabeticCharacter = false, hasNumericCharacter = false, hasSpecialCharacter = false, hasLength = false;
        boolean pass = false;
        char c = ' ';
        int ascii;
        int i = 0;

        // checks that length of password is at least 6 characters long
        if (checkPassword.length() >= 6) {
            hasLength = true;
        }
        // checks that password contains Letters, Numbers, and a Special character
        while ((i < checkPassword.length()) && !(hasSpecialCharacter && hasAlphabeticCharacter && hasNumericCharacter)) {
                c = checkPassword.charAt(i);
                ascii = (int)c;
                if ((ascii > 122 && ascii < 127) || (ascii > 90 && ascii < 97)
                        || (ascii > 57 && ascii < 65) || (ascii > 31 && ascii < 48)) {
                    hasSpecialCharacter = true;
                } else if ((ascii > 64 && ascii < 91) || (ascii > 96 && ascii < 123)) {
                    hasAlphabeticCharacter = true;
                } else if (ascii > 47 && ascii < 58) {
                    hasNumericCharacter = true;
                }
                i++;
        }
        // checks that password meets all requirements
        if (hasSpecialCharacter && hasAlphabeticCharacter && hasNumericCharacter && hasLength) {
            pass = true;
        }
        return pass;
    }

    // Done, needs testing
    private boolean validName(String checkName) {
        boolean pass = true;
        char c;   
        // checks that name does not contain any invalid characters
        for (int i = 0; i < checkName.length(); i++) {
            c = checkName.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == '-') || (c == ' ') || ((int) c == 39))) {
                pass = false;
            }
        }
        return pass;
    }

}



