import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
public class Main {
    static Scanner sc = new Scanner(in);
    public static void main(String[] args) {

        //TESTBED AREA

        //NO MORE TESTBED

        out.println("please input your selection. \n 1 = age categorizer \n 2 = grade converter \n 3 = calculator");
        out.println("4 = Dice utility \n ");
        switch (sc.nextInt()) {
            case 1:
                out.println(AgeCat.AgeCategorizer(sc));
                break;
            case 2:
                out.println(GradeConv.GradeConverter(sc));
                break;
            case 3:
                SimpleCalc.Calc(sc);
                break;
            case 4:
                Dicething.DiceMain(sc);
            case 5:
                arrayExample.StudentListMaker(sc);
        }
    }
    public static int countAvailableBooks(ArrayList<Boolean> Available){
        int count = 0;
        for (Boolean aBoolean : Available) { if (aBoolean) {count++;} }
        return count;
    }
    public static int countBorrowedBooks(ArrayList<Boolean> Available){
        int count = 0;
        for (Boolean aBoolean : Available) { if (!aBoolean) {count++;} }
        return count;
    }
    public static void displayLibraryStatistics(ArrayList<String> titles, ArrayList<Boolean> available, ArrayList<String> userNames){
        //assuming 1-1 corresponding index positions...
        out.println("ENTRY\tTITLE\tAVAILABLE");
        for(int i = 0; i < titles.size(); i++){
            out.println(i+"\t"+titles.get(i)+"\t"+available.get(i));
        }
        out.println("USER REGISTRY:");
        for(String user: userNames){
            out.println(user);
        }
    }

}