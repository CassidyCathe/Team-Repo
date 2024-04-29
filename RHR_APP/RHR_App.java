package RHR_APP;

import java.util.Scanner;
import java.util.stream.Stream;
//import java.io.IOException;

public class RHR_App {
    public static void main (String[] args){
        // Instantiate objects and Variables
        TempArrays tempArrays = new TempArrays(); // Temporary Arrays object to act as a substitute database
        Scanner scn = new Scanner(System.in); // Scanner for user input
        Employee employeeUser = null; // Empty employee object
        Manager managerUser = null; // Empty manager object
        boolean loggedIn = false;
        //char userClassification;

        // Fills array with our temporary data
        tempArrays.populateArrays(tempArrays);
        
        // class RHR_APP.Employee
        String[] user = loginMenu(scn, tempArrays, employeeUser, managerUser);
        
        loggedIn = true;

        while (loggedIn == true) {
            
        
            if (user[2] == "Employee") {
                while (loggedIn == true) {
                    //currentMenu = loginMenu(scn, tempArrays, employeeUser, managerUser);
                    employeeUser = new Employee(user[0], user[1], user[2], user[3], user[4], user[5], user[6], user[7]);
                    System.out.println();
                    employeeHomeMenu(scn, employeeUser, tempArrays);
                }
            } else if (user[2] == "Manager") {
                while (loggedIn == true) {
                    ////choice = loginMenu(scn, tempArrays, employeeUser, managerUser);
                    //menuManager(chce, scn, tempArrays, managerUser);
                    managerUser = new Manager(user[0], user[1], user[2], user[3], user[4], user[5], user[6], user[7]);
                    System.out.println();
                    //managerHomeMenu(scn, managerUser, tempArrays);
                }
            }
            
        }
        
    }

        // Universal Login for application

        static String[] loginMenu (Scanner scn, TempArrays tempArrays, Employee employeeUser, Manager managerUser) {
            boolean logIn = false;
            //char classification = 'n';
            
            // Prompt user for login information
            System.out.println("Enter Username:");
            String userName = scn.nextLine();
            System.out.println("Enter Password:");
            String passWord = scn.nextLine();
            
            // Validate username and password
            while (logIn == false) {
                // Checks if user is found in the Database, if they are not, prompted to login again
                if (tempArrays.findUser(userName, passWord) >= 0 && tempArrays.findUser(userName, passWord) < tempArrays.returnArraySize()) {
                    // If user is an Employee, Employee object is created with the proper data
                    if (tempArrays.findClassification(tempArrays.findUser(userName, passWord)) == 'e') {
                        String[] user = tempArrays.returnItemsInArray(tempArrays.findUser(userName, passWord));
                        //employeeUser = new Employee(user[0], user[1], user[2], user[3], user[4], user[5], user[6], user[7]);
                        return user;
                        //classification = 'e';
                    }
                    // If user is a Manager, Manager object is created with the proper data
                    if (tempArrays.findClassification(tempArrays.findUser(userName, passWord)) == 'm') {
                        String[] user = tempArrays.returnItemsInArray(tempArrays.findUser(userName, passWord));
                        //managerUser = new Manager(user[0], user[1], user[2], user[3], user[4], user[5], user[6], user[7]);
                        return user;
                        //classification = 'm';
                    }
                    System.out.println("You are now logged in");
                    logIn = true;
                    // Exits loop
                } else {
                    // Re-prompts User if they've entered incorrect information
                    System.out.println("Invalid Login Credentials, Please Try Again");
                    System.out.println("Enter Username:");
                    userName = scn.nextLine();
                    System.out.println("Enter Password:");
                    passWord = scn.nextLine();
                }
            }

            //employeeUser.displayUserInfo();
            System.out.println();
            return null;
        }


        

        //Employee Menus

        //done
        static void employeeHomeMenu (Scanner scn, Employee user, TempArrays tempArrays) {
            System.out.println("Go to different Menu:");
            System.out.println("1. Home Menu");
            System.out.println("2. Employees Menu");
            System.out.println("3. Evaluation Menu");
            System.out.println();
            System.out.println("Accessible from Home Menu:");
            System.out.println("4. My Account");
            System.out.println();
            
            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    // Home Menu 
                    System.out.println("case 1 entered");
                    employeeHomeMenu(scn, user, tempArrays);
                    break;
                case 2:
                    // Employees Menu
                    System.out.println("case 2 entered");
                    employeeEmployeesMenu(scn, user, tempArrays);
                    break;
                case 3:
                    // Evaluation Menu
                    System.out.println("case 3 entered");
                    employeeEvaluationsMenu(scn, user, tempArrays);
                    break;
                case 4:
                    // Account Menu
                    System.out.println("case 4 entered");
                    employeeAccountMenu(scn, user, tempArrays, 1);
                    break;                 
                default:  
                    System.out.println("Invalid Input");
                    break;
            }
        }

        //done
        static void employeeEmployeesMenu (Scanner scn, Employee user, TempArrays tempArrays) {
            System.out.println("Go to different Menu:");
            System.out.println("1. Home Menu");
            System.out.println("2. Employees Menu");
            System.out.println("3. Evaluation Menu");
            System.out.println();
            System.out.println("Accessible from Employee Menu:");
            System.out.println("4. My Account");
            System.out.println("5. Display Employees");
            System.out.println();

            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    // Home Menu 
                    System.out.println("case 1 entered");
                    employeeHomeMenu(scn, user, tempArrays);
                    break;
                case 2:
                    // Employees Menu
                    System.out.println("case 2 entered");
                    employeeEmployeesMenu(scn, user, tempArrays);
                    break;
                case 3:
                    // Evaluation Menu
                    System.out.println("case 3 entered");
                    employeeEvaluationsMenu(scn, user, tempArrays);
                    break;
                case 4:
                    // Account Menu
                    System.out.println("case 4 entered");
                    employeeAccountMenu(scn, user, tempArrays, 2);
                    break;
                case 5:  
                    // Employee Menu for
                    System.out.println("case 5 entered");
                    employeeDisplayUsersMenu(scn, user, tempArrays);
                    break;                 
                default:  
                    System.out.println("Invalid Input");
                    break;
            }
        }

        //done
        static void employeeEvaluationsMenu(Scanner scn, Employee user, TempArrays tempArrays) {
            System.out.println("Go to different Menu:");
            System.out.println("1. Home Menu");
            System.out.println("2. Employees Menu");
            System.out.println("3. Evaluation Menu");
            System.out.println();
            System.out.println("Accessible from Evaluation Menu:");
            System.out.println("4. My Account");
            System.out.println("5. View My Evaluation");
            System.out.println();

            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    // Home Menu 
                    System.out.println("case 1 entered");
                    employeeHomeMenu(scn, user, tempArrays);
                    break;
                case 2:
                    // Employees Menu
                    System.out.println("case 2 entered");
                    employeeEmployeesMenu(scn, user, tempArrays);
                    break;
                case 3:
                    // Evaluation Menu
                    System.out.println("case 3 entered");
                    employeeEvaluationsMenu(scn, user, tempArrays);
                    break;
                case 4:
                    // Account Menu
                    System.out.println("case 4 entered");
                    employeeAccountMenu(scn, user, tempArrays, 3);
                    break;
                case 5:
                    //bankRecords.editAccount(act);
                    System.out.println("case 6 entered");
                    //employee.employeeEvaluationMenu();
                    break;                  
                default:  
                    System.out.println("Invalid Input");
                    break;
            }


            
        }

        //done
        static void employeeAccountMenu(Scanner scn, Employee user, TempArrays tempArrays, int returnMenu) {
            System.out.println("Account Menu:");
            System.out.println("1. Display Account");
            System.out.println("2. Edit Account");
            System.out.println("3. Exit Account Menu");
            
            
            int input = scn.nextInt();

            switch (input) {
                case 1:
                    user.displayUserInfo();
                    employeeAccountMenu(scn, user, tempArrays, returnMenu);
                    break;
                case 2:
                    user.editUserInfo();
                    employeeAccountMenu(scn, user, tempArrays, returnMenu);
                    break;
                case 3:
                    switch (returnMenu) {
                        case 1:
                        employeeHomeMenu(scn, user, tempArrays);
                        break;
                        case 2:
                        employeeEmployeesMenu(scn, user, tempArrays);
                        break;
                        case 3:
                        employeeEvaluationsMenu(scn, user, tempArrays);
                        break;
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
                    System.out.println();
                    employeeAccountMenu(scn, user, tempArrays, returnMenu);
                    break;
            }
            
            System.out.println("Exiting Account Menu");
        }

        //done
        static void employeeDisplayUsersMenu(Scanner scn, Employee user, TempArrays tempArrays) {
            tempArrays.displayAllEmployees();
            System.out.println("User View Menu:");
            System.out.println("1. Back");
            System.out.println();
            int choice = scn.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Exiting Display Menu");
                    employeeEmployeesMenu(scn, user, tempArrays);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

        //unfinished, needs evaluation stuff
        static void employeeEvaluationMenu(Scanner scn, Employee user, TempArrays tempArrays) {
            tempArrays.displayAllEmployees();
            System.out.println("1. Back");
            System.out.println();
            int choice = scn.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Exiting Display Menu");
                    employeeEmployeesMenu(scn, user, tempArrays);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }


        /*
        static void managerEmployeeAccountMenu(Scanner scn, Manager user, TempArrays tempArrays, int returnMenu) {
            System.out.println("Account Menu:");
            System.out.println("1. Display Account");
            System.out.println("2. Edit Account");
            System.out.println("3. Delete Account");
            System.out.println("4. Exit Account Menu");
            
            int input = scn.nextInt();
        
            switch (input) {
                case 1:
                    user.displayUserInfo();
                    managerEmployeeAccountMenu(scn, user, tempArrays, returnMenu);
                    break;
                case 2:
                    user.editUserInfo();
                    managerEmployeeAccountMenu(scn, user, tempArrays, returnMenu);
                    break;
                case 3:
                    tempArrays.deleteArrayFromList(tempArrays.findUser(user.getUsername(), user.getPassword()));
                    managerEmployeeAccountMenu(scn, user, tempArrays, returnMenu);
                    break;
                case 4:
                    switch (returnMenu) {
                        case 1:
                        employeeHomeMenu(scn, user, tempArrays);
                        break;
                        case 2:
                        employeeEmployeesMenu(scn, user, tempArrays);
                        break;
                        case 3:
                        employeeEvaluationsMenu(scn, user, tempArrays);
                        break;
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        
            System.out.println("Exiting Account Menu");
        }
        */

}  
