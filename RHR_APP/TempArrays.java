package RHR_APP;

import java.util.ArrayList;
import java.util.Scanner;

public class TempArrays {
    private ArrayList<Object[]> arrays;
    Scanner scn = new Scanner(System.in);

    public TempArrays() {
        arrays = new ArrayList<>();
    }

    public void addItemToArray(int arrayIndex, Object item) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            arrays.get(arrayIndex)[arrays.get(arrayIndex).length - 1] = item;
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    public void editItemInArray(int arrayIndex, int itemIndex, Object newItem) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            if (itemIndex >= 0 && itemIndex < arrays.get(arrayIndex).length) {
                arrays.get(arrayIndex)[itemIndex] = newItem;
            } else {
                System.err.println("Item index out of bounds");
            }
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    public void deleteItemFromArray(int arrayIndex, int itemIndex) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            if (itemIndex >= 0 && itemIndex < arrays.get(arrayIndex).length) {
                Object[] array = arrays.get(arrayIndex);
                Object[] newArray = new Object[array.length - 1];
                int newIndex = 0;
                for (int i = 0; i < array.length; i++) {
                    if (i != itemIndex) {
                        newArray[newIndex++] = array[i];
                    }
                }
                arrays.set(arrayIndex, newArray);
            } else {
                System.err.println("Item index out of bounds");
            }
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    public void deleteArrayFromList(int arrayIndex) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            arrays.remove(arrayIndex);
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    public void readItemsInArray(int arrayIndex) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            Object[] array = arrays.get(arrayIndex);
            System.out.print((arrayIndex + 1) + ": ");
            for (Object item : array) {
                System.out.print(item + " ");
            }
            System.out.println();
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    public int findUser(String userName, String passWord) {
        //boolean found = false;
        int returnVal = arrays.size();
        for (int i = 0; i < arrays.size(); i++) {
            if(userName.equals(arrays.get(i)[4]) && passWord.equals(arrays.get(i)[5])) {
                //found = true;
                returnVal = i;
            }
        }
        return returnVal;
    }

    public int findUserWithUsername(String userName) {
        //boolean found = false;
        int returnVal = arrays.size();
        for (int i = 0; i < arrays.size(); i++) {
            if(userName.equals(arrays.get(i)[4])) {
                //found = true;
                returnVal = i;
            }
        }
        return returnVal;
    }

    public char findClassification(int arrayIndex) {
        if(arrayIndex < 0 || arrayIndex >= arrays.size()){
            return 'n';
        }
        if(arrays.get(arrayIndex)[2].equals("Employee")) {
            return 'e';
        }
        if(arrays.get(arrayIndex)[2].equals("Manager")) {
            return 'm';
        } 
        else {
            return 'n';
        }
    }

    public String[] returnItemsInArray(int arrayIndex) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            Object[] array = arrays.get(arrayIndex);
            String[] arrayValues = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayValues[i] = String.valueOf(array[i]);
            }
            return arrayValues;
        } else {
            System.err.println("Array index out of bounds");
            return null;
        }
    }

    
    
    public int returnArraySize() {
        return arrays.size();
    }

    public void addArray(Object[] newArray) {
        arrays.add(newArray);
    }

    public void populateArrays(TempArrays tempArrays) {
        tempArrays.addArray(new String[]{"Seth", "Rogen", "Manager", "45859868", "sRogen", "sethPW_1234", "sRogen@gmail.com", "2701112222"});
        tempArrays.addArray(new String[]{"Cassidy", "Larcomb", "Employee", "85776935", "cLarcomb", "casPW_1234", "cLarcomb@gmail.com", "2702223333", "4.7", "Employee Evaluation Not Yet Filled Out"});
        tempArrays.addArray(new String[]{"Alexandria", "Johnson", "Employee", "45896712", "aJohnson", "lexPW_1234", "aJohnson@gmail.com", "2703334444", "4.5", "Employee Evaluation Not Yet Filled Out"});
        tempArrays.addArray(new String[]{"Ethan", "James", "Employee", "15425365", "eJames", "ethPW_1234", "eJames@gmail.com", "2704445555", "4.4", "Employee Evaluation Not Yet Filled Out"});
    }

    public void displayAllEmployees() {
        for (int i = 0; i < arrays.size(); i++) {
            readItemsInArray(i);
        }
        System.out.println();
    }
    
    


    //FIIIIIIXIIXXXX
    public void managerEmployeeMenu() {
        displayAllEmployees();
        int choice = scn.nextInt();
        System.out.println("1. Back");
        System.out.println("1. Back");
        System.out.println("1. Back");
        System.out.println("1. Back");
        System.out.println();
        switch (choice) {
            case 1:
                System.out.print("Exiting Display Menu");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public static void main (String[] args) {
        TempArrays tempArrays = new TempArrays();
        tempArrays.addArray(new String[]{"Cassidy", "Larcomb", "154586", "cLarcomb", "fakePW", "cLarcomb@gmail.com", "c2Larcomb@gmail.com", "2704448888", "2705558888"});
        tempArrays.addArray(new String[]{"TEST", "Larcomb", "154586", "cLarcomb", "fakePW", "cLarcomb@gmail.com", "c2Larcomb@gmail.com", "2704448888", "2705558888"});
        String cass = "casserole";
        tempArrays.readItemsInArray(0);
        tempArrays.editItemInArray(0, 0, cass);
        tempArrays.readItemsInArray(0);
        tempArrays.deleteArrayFromList(0);
        tempArrays.readItemsInArray(0);
    }
}
