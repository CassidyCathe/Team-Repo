package basicClassesCoding;

public class Job {
    // class vairables
    private String Title;
    private int Experience;

    // constructor
    public Job() {
    }

    ///// MUTATORS /////

    // Sets the title of the job
    public void setTitle(String Title) {
        this.Title = Title;
    }

    // sets the length of experience
    public void setExperience(int Experience) {
        this.Experience = Experience;
    }

    ///// END OF MUTATORS /////

    ///// ACCESSORS /////

    // Sets the title of the job
    public String getTitle() {
        return Title;
    }

    // Sets the lenghth of experience for the job
    public int getExperience() {
        return Experience;
    }

    ///// END OF ACCESSORS /////

    ///// METHODS /////

    public void displayDetails() {
        System.out.println("--- Job Details ---");
        System.out.println("Job Title: " + Title);
        System.out.println("Length of Experience: " + Experience);
        System.out.println();
    }

}
