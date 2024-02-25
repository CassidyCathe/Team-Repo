package basicClassesCoding;

public class Person {
    private String name;
    private int age;

    // default constructor
    public Person() {
    }

    ///// MUTATORS /////

    // sets name of person
    public void setName(String name) {
        this.name = name;
    }

    // sets age of person
    public void setAge(int age) {
        this.age = age;
    }

    ///// END OF MUTATORS /////

    ///// ACCESSORS /////

    // retrieves name of person
    public String getName() {
        return name;
    }

    // retrieves age of person
    public int getAge() {
        return age;
    }

    ///// END OF ACCESSORS /////

    ///// METHODS /////

    // displays name and age of person
    public void displayDetails() {
        System.out.println("--- Person Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
