package RHR_APP;

import java.util.Scanner;
import java.util.stream.Stream;

public class RHR_App {
    public static void main (String[] args){
        TempArrays tempArrays = new TempArrays();
        Scanner scn = new Scanner(System.in);
        instantiateArrays(tempArrays);
        
        //this should be replaced by however the UI does it
        System.out.println("Enter Username:");
        String userName = scn.nextLine();
        System.out.println("Enter Password:");
        String passWord = scn.nextLine();
        
        //findUser(userName, passWord);
        
        // if Employee create Employee if Manager create Manager
        Employee employeeUser = new Employee();
        // this works: employeeUser = new Employee("Cassidy", "Larcomb", "Employee", "85776935", "cLarcomb", "casPW_1234", "cLarcomb@gmail.com", "2702223333");
        Manager managerUser = new Manager();
        

        //Can we create a UI manager that handles the rest after startup? or do we need soemthing else
        
    }


    public static void instantiateArrays(TempArrays tempArrays) {
        tempArrays.addArray(new String[]{"Seth", "Rogen", "Manager", "45859868", "sRogen", "sethPW_1234", "sRogen@gmail.com", "2701112222"});
        tempArrays.addArray(new String[]{"Cassidy", "Larcomb", "Employee", "85776935", "cLarcomb", "casPW_1234", "cLarcomb@gmail.com", "2702223333"});
        tempArrays.addArray(new String[]{"Alexandria", "Johnson", "Employee", "45896712", "aJohnson", "lexPW_1234", "aJohnson@gmail.com", "2703334444"});
        tempArrays.addArray(new String[]{"Ethan", "James", "Employee", "15425365", "eJames", "ethPW_1234", "eJames@gmail.com", "2704445555"});
    }

    /* 
    public void instantiateUser(TempArrays tempArrays, Employee employee, Manager manager) {
        for (int arrayIndex) {
            String[] user = tempArrays.returnItemsInArray(arrayIndex));
            if (user[2].equals("Manager")) {
                this.managerUser = new Manager(user[0], user[1], user[2], user[3], user[4], user[5], user[6], user[7], user[8]);
            } else if (user[2].equals("Employee")) {
                this.employeeUser = new Employee(user[0], user[1], user[2], user[3], user[4], user[5], user[6], user[7], user[8]);
            }
            
        }


        //fN, lN, iD, uN, pW, wE, pE, wP, pP
    }
    */

}



// personal phones number now, no more "home"?