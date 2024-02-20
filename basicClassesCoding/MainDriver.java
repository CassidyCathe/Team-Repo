package basicClassesCoding;
import java.util.Scanner;

public class MainDriver {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Person bertram = new Person();
        bertram.setName(scn.nextLine());
        bertram.setAge(959594999);

        System.out.println(bertram.getName());

        bertram.displayDetails();
    }
    
}
