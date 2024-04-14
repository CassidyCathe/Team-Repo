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

}
