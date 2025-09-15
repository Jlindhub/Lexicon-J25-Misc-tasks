import java.util.Scanner;
import static java.lang.System.*;
public class Main {
    static Scanner sc = new Scanner(in);
    public static void main(String[] args) {

        //TESTBED AREA

        //NO MORE TESTBED

        out.println("please input your selection. \n 1 = age categorizer \n 2 = grade converter \n 3 = calculator");
        out.println(" 4 = Dice utility \n 5 = list maker example \n 6 = game instance... game");
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
                break;
            case 5:
                arrayExample.StudentListMaker(sc);
                break;
                case 6:
                    GameSimple gameInstance =  new GameSimple();
                    gameInstance.RunGame();
        }
    }
}