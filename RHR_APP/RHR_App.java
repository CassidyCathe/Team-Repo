package RHR_APP;

import java.util.Scanner;
//import java.io.IOException;

public class RHR_App {
    public static void main (String[] args){
        // Instantiate objects and Variables
        TempArrays tempArrays = new TempArrays(); // Temporary Arrays object to act as a substitute database
        Scanner scn = new Scanner(System.in); // Scanner for user input
        Employee employeeUser = null; // Empty employee object
        Manager managerUser = null; // Empty manager object
        boolean appOn = true;
        //char userClassification;

        // Fills array with our temporary data
        
        
        while (appOn == true) {
            

            tempArrays.populateArrays(tempArrays);
        

            String[] user = loginMenu(scn, tempArrays, employeeUser, managerUser);
        
            
            if (user[2] == "Employee") {
                //while (appOn == true) {
                    //currentMenu = loginMenu(scn, tempArrays, employeeUser, managerUser);
                    employeeUser = new Employee(user[0], user[1], user[2], user[3], user[4], user[5], user[6], user[7]);
                    employeeUser.setLoggedInStatus(true);
                    System.out.println();
                    while (employeeUser.getLoggedInStatus() == true) {
                        employeeHomeMenu(scn, employeeUser, tempArrays);
                    }
                //}
            } else if (user[2] == "Manager") {
                //while (appOn == true) {
                    //menuManager(chce, scn, tempArrays, managerUser);
                    managerUser = new Manager(user[0], user[1], user[2], user[3], user[4], user[5], user[6], user[7]);
                    managerUser.setLoggedInStatus(true);
                    System.out.println();
                    while (managerUser.getLoggedInStatus() == true) {
                        managerHomeMenu(scn, managerUser, tempArrays);
                    }
                //}
            }

        }
        
    }

        // LOGIN MENUS

        static String[] loginMenu (Scanner scn, TempArrays tempArrays, Employee employeeUser, Manager managerUser) {
            boolean logIn = false;
            

            
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
                        return user;
                    }
                    // If user is a Manager, Manager object is created with the proper data
                    if (tempArrays.findClassification(tempArrays.findUser(userName, passWord)) == 'm') {
                        String[] user = tempArrays.returnItemsInArray(tempArrays.findUser(userName, passWord));
                        managerUser.setLoggedInStatus(true);
                        return user;
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

        static void logOut (Scanner scn, Employee user) {
            user.setLoggedInStatus(false);
            System.out.println("Logging Out");
            System.out.println();
            scn.nextLine();
        }

        static void logOut (Scanner scn, Manager user) {
            user.setLoggedInStatus(false);
            System.out.println("Logging Out");
            System.out.println();
        }
        

        // EMPLOYEE MENUS

        //done
        static void employeeHomeMenu (Scanner scn, Employee user, TempArrays tempArrays) {
            System.out.println("--HOME MENU--");
            System.out.println("Go to different Menu:");
            System.out.println("1. Home Menu");
            System.out.println("2. Employees Menu");
            System.out.println("3. Evaluation Menu");
            System.out.println();
            System.out.println("Accessible from Home Menu:");
            System.out.println("4. My Account");
            System.out.println();
            
            int input = scn.nextInt();

            switch (input) {
                case 1:
                    // Home Menu 
                    employeeHomeMenu(scn, user, tempArrays);
                    break;
                case 2:
                    // Employees Menu
                    employeeEmployeesMenu(scn, user, tempArrays);
                    break;
                case 3:
                    // Evaluation Menu
                    employeeEvaluationsMenu(scn, user, tempArrays);
                    break;
                case 4:
                    // Account Menu
                    employeeAccountMenu(scn, user, tempArrays, 1);
                    break;                 
                default:  
                    System.out.println("Invalid Input");
                    break;
            }
        }

        //done
        static void employeeEmployeesMenu (Scanner scn, Employee user, TempArrays tempArrays) {
            System.out.println("--EMPLOYEES MENU--");
            System.out.println("Go to different Menu:");
            System.out.println("1. Home Menu");
            System.out.println("2. Employees Menu");
            System.out.println("3. Evaluation Menu");
            System.out.println();
            System.out.println("Accessible from Employees Menu:");
            System.out.println("4. My Account");
            System.out.println("5. Display Employees");
            System.out.println();

            int input = scn.nextInt();

            switch (input) {
                case 1:
                    // Home Menu 
                    employeeHomeMenu(scn, user, tempArrays);
                    break;
                case 2:
                    // Employees Menu
                    employeeEmployeesMenu(scn, user, tempArrays);
                    break;
                case 3:
                    // Evaluation Menu
                    employeeEvaluationsMenu(scn, user, tempArrays);
                    break;
                case 4:
                    // Account Menu
                    employeeAccountMenu(scn, user, tempArrays, 2);
                    break;
                case 5:  
                    // Employee Menu for
                    employeeDisplayUsersMenu(scn, user, tempArrays);
                    break;                 
                default:  
                    System.out.println("Invalid Input");
                    break;
            }
        }

        //done
        static void employeeEvaluationsMenu(Scanner scn, Employee user, TempArrays tempArrays) {
            System.out.println("--EVALUATION MENU--");
            System.out.println("Go to different Menu:");
            System.out.println("1. Home Menu");
            System.out.println("2. Employees Menu");
            System.out.println("3. Evaluation Menu");
            System.out.println();
            System.out.println("Accessible from Evaluation Menu:");
            System.out.println("4. My Account");
            System.out.println("5. View My Evaluation");
            System.out.println();

            int input = scn.nextInt();

            switch (input) {
                case 1:
                    // Home Menu 
                    employeeHomeMenu(scn, user, tempArrays);
                    break;
                case 2:
                    // Employees Menu
                    employeeEmployeesMenu(scn, user, tempArrays);
                    break;
                case 3:
                    // Evaluation Menu
                    employeeEvaluationsMenu(scn, user, tempArrays);
                    break;
                case 4:
                    // Account Menu
                    employeeAccountMenu(scn, user, tempArrays, 3);
                    break;
                case 5:
                    //bankRecords.editAccount(act);
                    employeeEvaluationMenu(scn, user, tempArrays);
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
            System.out.println("3. Delete Account");
            System.out.println("4. Sign Out");
            System.out.println("5. Exit Account Menu");
            System.out.println();
            
            
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
                    System.out.println("Are you sure you want to delete your account?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println();
                    int input1 = scn.nextInt();
                    switch (input1) {
                        case 1:
                            System.out.println("Admin Authorization Needed to Delete Employee Account");
                            scn.nextLine();
                            System.out.println("Admin Username:");
                            String adminUsername = scn.nextLine();
                            System.out.println("Admin Password:");
                            String adminPassword = scn.next();
                            System.out.println();
                            
                            boolean accepted = false;

                            System.out.println(tempArrays.findUser(adminUsername, adminPassword));
                            
                            while (!accepted) {
                                if (tempArrays.findClassification(tempArrays.findUser(adminUsername, adminPassword)) == 'm') {
                                    tempArrays.deleteArrayFromList(tempArrays.findUser(user.getUsername(),user.getPassword()));
                                    logOut(scn, user);
                                    accepted = true;
                                }
                                else {
                                    System.out .println("Admin Authorization Failed");
                                    System.out.println("1. Re-Enter Authorization");
                                    System.out.println("2. Exit");
                                    System.out.println();

                                    int input2 = scn.nextInt();

                                    switch (input2) {
                                        case 1:
                                            scn.nextLine();
                                            System.out.println("Admin Username: ");
                                            adminUsername = scn.nextLine();
                                            System.out.println("Admin Password:");
                                            adminPassword = scn.next();
                                            System.out.println();
                                            break;
                                        case 2: 
                                            accepted = true;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                        }
                break;
                case 4:
                    logOut(scn, user);
                    break;
                case 5:
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
            int input = scn.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Exiting Display Menu");
                    employeeEmployeesMenu(scn, user, tempArrays);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

        //unfinished, missing evaluation stuff
        static void employeeEvaluationMenu(Scanner scn, Employee user, TempArrays tempArrays) {
            user.displayEvaluation();
            System.out.println();
            System.out.println("1. Back");
            System.out.println();
            int input = scn.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Exiting Evaluation Menu");
                    employeeEvaluationsMenu(scn, user, tempArrays);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }





        // MANAGER MENUS

        //done
        static void managerHomeMenu (Scanner scn, Manager user, TempArrays tempArrays) {
            System.out.println("--HOME MENU--");
            System.out.println("Go to different Menu:");
            System.out.println("1. Home Menu");
            System.out.println("2. Employees Menu");
            System.out.println("3. Evaluation Menu");
            System.out.println();
            System.out.println("Accessible from Home Menu:");
            System.out.println("4. My Account");
            System.out.println();
            
            int input = scn.nextInt();

            switch (input) {
                case 1:
                    // Home Menu 
                    managerHomeMenu(scn, user, tempArrays);
                    break;
                case 2:
                    // Employees Menu
                    managerEmployeesMenu(scn, user, tempArrays);
                    break;
                case 3:
                    // Evaluation Menu
                    managerEvaluationsMenu(scn, user, tempArrays);
                    break;
                case 4:
                    // Account Menu
                    managerAccountMenu(scn, user, tempArrays, 1);
                    break;                 
                default:  
                    System.out.println("Invalid Input");
                    break;
            }
        }

        //done
        static void managerEmployeesMenu (Scanner scn, Manager user, TempArrays tempArrays) {
            System.out.println("--EMPLOYEES MENU--");
            System.out.println("Go to different Menu:");
            System.out.println("1. Home Menu");
            System.out.println("2. Employees Menu");
            System.out.println("3. Evaluation Menu");
            System.out.println();
            System.out.println("Accessible from Employees Menu:");
            System.out.println("4. My Account");
            System.out.println("5. Display Employees");
            System.out.println();

            int input = scn.nextInt();

            switch (input) {
                case 1:
                    // Home Menu 
                    managerHomeMenu(scn, user, tempArrays);
                    break;
                case 2:
                    // Employees Menu
                    managerEmployeesMenu(scn, user, tempArrays);
                    break;
                case 3:
                    // Evaluation Menu
                    managerEvaluationsMenu(scn, user, tempArrays);
                    break;
                case 4:
                    // Account Menu
                    managerAccountMenu(scn, user, tempArrays, 2);
                    break;
                case 5:  
                    // Employee Menu for
                    managerDisplayUsersMenu(scn, user, tempArrays);
                    break;                 
                default:  
                    System.out.println("Invalid Input");
                    break;
            }
        }

        //undone
        static void managerEvaluationsMenu(Scanner scn, Manager user, TempArrays tempArrays) {
            System.out.println("--EVALUATION MENU--");
            System.out.println("Go to different Menu:");
            System.out.println("1. Home Menu");
            System.out.println("2. Employees Menu");
            System.out.println("3. Evaluation Menu");
            System.out.println();
            System.out.println("Accessible from Evaluation Menu:");
            System.out.println("4. My Account");
            System.out.println("5. Make An Evaluation");
            System.out.println();

            int input = scn.nextInt();

            switch (input) {
                case 1:
                    // Home Menu 
                    managerHomeMenu(scn, user, tempArrays);
                    break;
                case 2:
                    // Employees Menu
                    managerEmployeesMenu(scn, user, tempArrays);
                    break;
                case 3:
                    // Evaluation Menu
                    managerEvaluationsMenu(scn, user, tempArrays);
                    break;
                case 4:
                    // Account Menu
                    managerAccountMenu(scn, user, tempArrays, 3);
                    break;
                case 5:
                    //bankRecords.editAccount(act);
                    managerEvaluationMenu(scn, user, tempArrays);
                    break;                  
                default:  
                    System.out.println("Invalid Input");
                    break;
            }


            
        }

        //done
        static void managerAccountMenu(Scanner scn, Manager user, TempArrays tempArrays, int returnMenu) {
            System.out.println("Account Menu:");
            System.out.println("1. Display Account");
            System.out.println("2. Edit Account");
            System.out.println("3. Delete Account");
            System.out.println("4. Sign Out");
            System.out.println("5. Exit Account Menu");
            System.out.println();
            
            
            int input = scn.nextInt();

            switch (input) {
                case 1:
                    user.displayUserInfo();
                    managerAccountMenu(scn, user, tempArrays, returnMenu);
                    break;
                case 2:
                    user.editUserInfo();
                    managerAccountMenu(scn, user, tempArrays, returnMenu);
                    break;
                case 3:
                    System.out.println("Are you sure you want to delete your account?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println();
                    int input1 = scn.nextInt();
                    switch (input1) {
                        case 1:
                            System.out.println("Enter Password to Delete Account");
                            scn.nextLine();
                            String adminUsername = user.getUsername();
                            System.out.println("Admin Password:");
                            String adminPassword = scn.next();
                            System.out.println();
                            
                            boolean accepted = false;
                            
                            while (!accepted) {
                                if (tempArrays.findClassification(tempArrays.findUser(adminUsername, adminPassword)) == 'm') {
                                    tempArrays.deleteArrayFromList(tempArrays.findUser(user.getUsername(),user.getPassword()));
                                    logOut(scn, user);
                                    accepted = true;
                                }
                                else {
                                    System.out .println("Incorrect Password");
                                    System.out.println("1. Re-Enter Password");
                                    System.out.println("2. Exit");
                                    System.out.println();

                                    int input2 = scn.nextInt();

                                    switch (input2) {
                                        case 1:
                                            scn.nextLine();
                                            System.out.println("Admin Password:");
                                            adminPassword = scn.next();
                                            System.out.println();
                                            break;
                                        case 2: 
                                            accepted = true;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                        }
                break;
                case 4:
                    logOut(scn, user);
                    break;
                case 5:
                    switch (returnMenu) {
                        case 1:
                        managerHomeMenu(scn, user, tempArrays);
                        break;
                        case 2:
                        managerEmployeesMenu(scn, user, tempArrays);
                        break;
                        case 3:
                        managerEvaluationsMenu(scn, user, tempArrays);
                        break;
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
                    System.out.println();
                    managerAccountMenu(scn, user, tempArrays, returnMenu);
                    break;
            }
            
            System.out.println("Exiting Account Menu");
        }        

        //
        static void managerDisplayUsersMenu(Scanner scn, Manager user, TempArrays tempArrays) {
            tempArrays.displayAllEmployees();
            System.out.println("User View Menu:");
            System.out.println("1. Select Employee");
            System.out.println("2. Create User");
            System.out.println("3. Back");
            System.out.println();
            int input = scn.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter Username:");
                    String input1 = scn.nextLine();
                    System.out.println("What Would You Like To Do?");
                    System.out.println("1. Edit User");
                    System.out.println("2. Write Evaluation");
                    System.out.println("3. Delete User");
                    int input2 = scn.nextInt();
                    switch (input2) {
                        case 1:
                            //EDIT USER
                            break;
                        case 2:
                        case 3:
                            tempArrays.deleteArrayFromList(tempArrays.findUserWithUsername(input1));
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Exiting Display Menu");
                    managerEmployeesMenu(scn, user, tempArrays);
                    break;
                case 3:
                    System.out.print("Exiting Display Menu");
                    managerEmployeesMenu(scn, user, tempArrays);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

        //unfinished, missing evaluation stuff
        static void managerEvaluationMenu(Scanner scn, Manager user, TempArrays tempArrays) {
            tempArrays.displayAllEmployees();
            System.out.println("1. Back");
            System.out.println("2. Back");
            System.out.println("3. Back");
            System.out.println("4. Back");
            System.out.println();
            int input = scn.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Exiting Evaluation Menu");
                    managerEmployeesMenu(scn, user, tempArrays);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }



}  
