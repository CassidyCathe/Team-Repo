package basicClassesCoding;
public class HardSkill {
    // class variables
    private String title;
    private String level;    


    // default Constructor
    public HardSkill() {
    }


    ///// MUTATORS /////

    // sets title of hardskill
    public void setTitle(String title){
        this.title = title;
    }

    // sets level of hardskill
    public void setLevel(String level) {
        this.level = level;
    }

    ///// END OF MUTATORS /////


    ///// ACCESSORS /////

    // retrieves title of hardskill
    public String getTitle(String title) {
        return title;
    }

    // retrieves level of hardskill
    public String getLevel(){
        return level;
    }

    ///// END OF ACCESSORS /////


    ///// METHODS /////

    // displays title and level of employee
    public void displayDetails(){
        System.out.println("--- Hard Skills ---");
        System.out.println("Title: " + title);
        System.out.println("Level: " + level);
        System.out.println("");
    }
}