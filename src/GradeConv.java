import java.util.Scanner;

import static java.lang.System.out;

public class GradeConv {
    public static String GradeConverter(Scanner sc){
        String grade = "N/A - this shouldn't be a possible result";
        out.println("please input your score.");
        int input;
        boolean GoodNum = false;
        while(!GoodNum) {
            input = sc.nextInt();

            if (input > 100) {grade = ("CHEATER IDENTIFIED. PREPARE FOR DESTRUCTION... or try again.");}
            else if (input >= 90) {GoodNum = true; grade = "that's an A, good job!";}
            else if (input >= 80) {GoodNum = true; grade = "B, pretty good.";}
            else if (input >= 70) {GoodNum = true; grade = "C, not great, not terrible.";}
            else if (input >= 60) {GoodNum = true; grade = "D, you tried.";}
            else                  {GoodNum = true; grade = "F - Both as your grade and for your imminent demise.";}
        }
        return grade;
    }
}
