package RHR_APP;
public class RHR_App {
    public static void Main (String[] args){
        TempArrays tempUsers = new TempArrays();
        initializeUsers(tempUsers);
        tempUsers.displayUser(0);
        tempUsers.displayAllUsers();
    }

    public static void initializeUsers(TempArrays tempUsers) {
        tempUsers.addUser("John", "Doe", "1010038378", "johndoe", "password123", "john.doe@example.com", "john.doe@gmail.com", "+1234567890", "+1987654321");
        tempUsers.addUser("Jane", "Smith", "1234327888", "janesmith", "password456", "jane.smith@example.com", "jane.smith@gmail.com", "+1987654321", "+1234567890");
        tempUsers.addUser("Cassidy", "Larcomb", "5514522143", "johndoe", "password123", "john.doe@example.com", "john.doe@gmail.com", "+1234567890", "+1987654321");
        tempUsers.addUser("Alexandria", "Johnson", "5458169844", "janesmith", "password456", "jane.smith@example.com", "jane.smith@gmail.com", "+1987654321", "+1234567890");
        tempUsers.addUser("Ethan", "James", "8412526699", "johndoe", "password123", "john.doe@example.com", "john.doe@gmail.com", "+1234567890", "+1987654321");
    }


}

