/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmentquestion1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Kizito Asudo
 */
public class AssignmentQuestion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String subject;
        int mark;
        HashMap<String, Integer> subjects = new HashMap<String,Integer>();


        Scanner input=new Scanner(System.in);
        System.out.println("Enter Full name: ");
        String studentName=input.nextLine();


        for(int i=1;i<=5;i++){
            
            System.out.println("Enter subject number "+i+": ");
            subject=input.next();

            System.out.println("Enter the marks for subject number "+i+": ");
            mark=input.nextInt();
            
            subjects.put(subject, mark);
            

        }
        System.out.println("Student: "+studentName+"\n");
        subjects.forEach((s,m)->System.out.println(s+": "+m));
    }
    
}
