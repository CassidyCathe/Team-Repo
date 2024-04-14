package RHR_APP;

import java.util.ArrayList;

public class TempArrays {
    private ArrayList<Object[]> arrays;

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

    public void readItemsInArray(int arrayIndex) {
        if (arrayIndex >= 0 && arrayIndex < arrays.size()) {
            Object[] array = arrays.get(arrayIndex);
            System.out.print("Items in array " + arrayIndex + ": ");
            for (Object item : array) {
                System.out.print(item + " ");
            }
            System.out.println();
        } else {
            System.err.println("Array index out of bounds");
        }
    }

    /*
    public void findUser(String userName, String passWord) {
        boolean found = false;
        for (int i = 0; i < arrays.size(); i++) {
            
        } 
        if (found) {
            return indexOfUser;
        
        } else {
            System.our.println("User not found.");
        }
    }
    */

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



    public static void main (String[] args) {
        TempArrays tempArrays = new TempArrays();
        tempArrays.addArray(new String[]{"Cassidy", "Larcomb", "154586", "cLarcomb", "fakePW", "cLarcomb@gmail.com", "c2Larcomb@gmail.com", "2704448888", "2705558888"});
        String cass = "casserole";
        tempArrays.readItemsInArray(0);
        tempArrays.editItemInArray(0, 0, cass);
        tempArrays.readItemsInArray(0);
    }
}
