package basicClassesCoding;
public class Job {
    // class variables
    private String Title;
    private int Experience;


    // default constructor
    public Job() {
    }


    ///// MUTATORS /////

    // sets the title of the job
    public void setTitle(String Title) {
        this.Title = Title;
    }

    // sets the length of experience
    public void setExperience(int Experience) {
        this.Experience = Experience;
    }

    ///// END OF MUTATORS /////


    ///// ACCESSORS /////

    // retrieves title of job
    public String getTitle() {
        return Title;
    }

    // retrieves experience on job
    public int getExperience() {
        return Experience;
    }

    ///// END OF ACCESSORS /////


    ///// METHODS /////

    // displays the job title and experience length
    public void displayDetails() {
        System.out.println("--- Job Details ---");
        System.out.println("Job Title: " + Title);
        System.out.println("Length of Experience: " + Experience);
        System.out.println();
    }
}