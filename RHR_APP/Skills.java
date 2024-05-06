package RHR_APP;

import java.util.Scanner;

public class Skills{
    Scanner scn = new Scanner(System.in);

    private String skillName;
    private String skillProficency;
    private String skillDetails;

    public Skills(){
    }
    //instantiates Skill Object with a name, proficency, and details about the skill.
    public Skills(String name, String proficency, String details){
        skillName = name;
        skillProficency = proficency;
        skillDetails = details;
    }
    
    //returns name of the skill.
    public String getSkillName(){
        return skillName;
    }

    //returns proficency of the skill
    public String getSkillProficency(){
        return skillProficency;
    }

    //returns skill description
    public String getSkillDescription(){
        return skillDetails;
    }

    //updates skill name.
    public String setSkillName(String name){
        System.out.print("Input a skill: ");
        name = (String)scn.nextLine();
        return name;
    }

    //updates skill proficency
    public String setSkillProficency(String proficency){
        System.out.print("Input Skill Proficency: ");
        proficency = (String)scn.nextLine();
        return proficency;
    }

    //updates skill description
    public String setSkillDescription(String details){
        System.out.print("Give a short description of the skill: ");
        details = (String)scn.nextLine();
        return details;
    }


    //shows skill info for user to look at.
    public void displaySkillInfo(){
        System.out.println(skillName);
        System.out.println();
        System.out.println(skillProficency);
        System.out.println();
        System.out.println(skillDetails);
        System.out.println();

    }
}
