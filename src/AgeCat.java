import java.util.Scanner;

import static java.lang.System.out;

public class AgeCat {
    public static String AgeCategorizer(Scanner sc){

        String result = "N/A - this shouldn't be a possible result";
        out.println("please input your age.");
        boolean GoodNum = false;
        int input;
        while(!GoodNum) {
            input = sc.nextInt();

            if (input < 0) {result = "you're either funny, or a time traveller. try again.";}
            else if (input < 13) {GoodNum = true; result = "you are a child. prepare for destruction."; }
            else if (input < 19) {GoodNum = true; result = "it smells like teen spirit in here.";}
            else if (input < 65) {GoodNum = true; result = "Adulthood is painful, isn't it?";}
            else                 {GoodNum = true; result = "How's retirement, Señor Senior?";}
        }
        return result;
    }
}
