package RHR_APP;

import java.util.Scanner;

public class Evaluations{
    Scanner scn = new Scanner(System.in);

    private byte evaluationScore;
    private String evaluationDetails;

    public Evaluations(){
    }

    //creates Evaluations Object, which holds a score(byte) and details about the evaluation(string)
    public Evaluations(byte score, String details){
        evaluationScore = score;
        evaluationDetails = details;
    }

    //returns evaluation score
    public short getScore(){
        return evaluationScore;
    }

    //returns evaluation details
    public String getDetails(){
        return evaluationDetails;
    }

    //updates score value.
    public void setScore(byte score){
        System.out.println("Give your evaluatee a score out of 10: ");
        score = (byte)scn.nextByte();
        if(score > 10 || score < 0){
            System.out.print("Invalid input. Please select a score from 0 to 10: ");
            score = (byte)scn.nextByte();
        }
    }

    //updates detail value
    public void setDetails(String details){
        System.out.print("Give a short description of your evaluation: ");
        details = (String)scn.nextLine();
    }

    //displays all evaluation details of an employee
    public void displayEvaluation(){
        System.out.println(this.evaluationScore);
        System.out.println();
        System.out.println(this.evaluationDetails);
        System.out.println();

    }


}
