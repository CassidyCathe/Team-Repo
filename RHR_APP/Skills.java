package RHR_APP;

import java.util.ArrayList;
import java.util.Scanner;

public class Skills{
    Scanner scn = new Scanner(System.in);

    private String skillName;
    private String skillProficency;
    private String skillDetails;

    public Skills(){
    }

    public Skills(String name, String proficency, String details){
        skillName = name;
        skillProficency = proficency;
        skillDetails = details;
    }

    public String getSkillName(){
        return skillName;
    }

    public String getSkillProficency(){
        return skillProficency;
    }

    public String getSkillDescription(){
        return skillDetails;
    }

    public String setSkillName(String name){
        System.out.print("Input a skill: ");
        name = (String)scn.nextLine();
        return name;
    }

    public String setSkillProficency(String proficency){
        System.out.print("Input Skill Proficency: ");
        proficency = (String)scn.nextLine();
        return proficency;
    }

    public String setSkillDescription(String details){
        System.out.print("Give a short description of the skill: ");
        details = (String)scn.nextLine();
        return details;
    }


    public void displaySkillInfo(){
        System.out.println(skillName);
        System.out.println();
        System.out.println(skillProficency);
        System.out.println();
        System.out.println(skillDetails);
        System.out.println();
    }
}
