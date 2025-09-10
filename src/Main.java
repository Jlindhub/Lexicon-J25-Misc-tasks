import java.util.Scanner;
import static java.lang.System.*;
public class Main {
    static Scanner sc = new Scanner(in);
    public static void main(String[] args) {

        //TESTBED AREA TESTBED AREA TESTBED AREA TESTBED AREA TESTBED AREA TESTBED AREA TESTBED AREA TESTBED AREA
        arrayExample.StudentListMaker(sc);

        //NO MORE TESTBED NO MORE TESTBED NO MORE TESTBED NO MORE TESTBED NO MORE TESTBED NO MORE TESTBED
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
        }
    }
}