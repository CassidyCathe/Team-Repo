package RHR_APP;


public class Employee extends User {
    public Employee() {
    }

    public Employee(String FirstName, String LastName, String Classification, String UserID, String Username, String Password, String WorkEmail, String WorkPhoneNumber) {
        setFirstName(FirstName);
        setLastName(LastName);
        setClassification(Classification);
        setUserID(UserID);
        setUsername(Username);
        setPassword(Password);
        setWorkEmail(WorkEmail);
        setWorkPhoneNumber(WorkPhoneNumber);
    }

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

    public void displayEvaluation() {
        System.out.println(firstName);
        System.out.println(lastName);
        
    }
}
