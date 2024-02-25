package basicClassesCoding;

public class MainDriver {

    public static void main(String[] args) {

        // person class testing
        Person sethRogen = new Person();
        sethRogen.setName("Seth Rogen");
        sethRogen.setAge(41);

        sethRogen.displayDetails();

        // job class testing
        Job actor = new Job();
        actor.setTitle("Actor");
        actor.setExperience(292);

        actor.displayDetails();

        // //hard skills class testing
        // HardSkill directing = new HardSkill();
        // directing.setTitle();
        // directing.setLevel();

        // directing.displayDetails();

    }

}
