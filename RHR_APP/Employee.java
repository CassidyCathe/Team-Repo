package RHR_APP;
public class Employee extends User {
    public Employee() {
    }

    public Employee(String FirstName, String LastName, String UserID, String Username, String Password, String WorkEmail, String PersonalEmail, String WorkPhoneNumber, String HomePhoneNumber) {
        setFirstName(FirstName);
        setLastName(LastName);
        setUserID(UserID);
        setUsername(Username);
        setPassword(Password);
        setWorkEmail(WorkEmail);
        setPersonalEmail(PersonalEmail);
        setWorkPhoneNumber(WorkPhoneNumber);
        setHomePhoneNumber(HomePhoneNumber);
    }

    public String[] getEmployeeVariables() {
        String[] arrayVariables = {firstName, lastName, userID, username, password, workEmail, personalEmail, workPhoneNumber, homePhoneNumber};
        return arrayVariables;
    }
}
