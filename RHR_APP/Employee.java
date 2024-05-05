package RHR_APP;

public class Employee extends User {
    public int evalScore;
    public String evalText;
    
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

    
    public void setEvalScore(int EvalScore) {
        this.evalScore = EvalScore;
    }

    public void setEvalText(String EvalText) {
        this.evalText = EvalText;
    }
    
    public int getEvalScore() {
        return evalScore;
    }

    public String getEvalText() {
        return evalText;
    }

    public void displayEvaluation() {
        System.out.println("Evaluation Score: " + evalScore);
        System.out.println();
        System.out.println(evalText);
        System.out.println();
    }
}
