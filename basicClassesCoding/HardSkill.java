package basicClassesCoding;

public class HardSkill {
    private String title;
    private String level;    


//Default Constructor
public HardSkill(){

}

//Mutators
public void setTitle(String title){
    this.title = title;

}

public void setLevel(String level) {
    this.level = level;

}
//End Of Mutators

//Accessors
public String getTitle(String title) {
    return title;
}

public String getLevel(){
    return level;
}
//End Of Accessors

//Displays Title and Level of Employee.
public void displayDetails(){
    System.out.println("--- Hard Skills ---");
    System.out.println("Title: " + title);
    System.out.println("Level: " + level);
    System.out.println("");
}
}