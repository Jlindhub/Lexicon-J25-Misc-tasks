import java.util.Random;
import java.util.Scanner;

public class Dicething {
    public static void DiceMain(Scanner sc) {
        Random random = new Random();

        while (true) {
            int[] result = DiceMaker(sc, random);
            int totalValue = 0;
            for (int i : result) {
                System.out.println(i);
                totalValue += i;
            }
            System.out.println("total: " + totalValue);
            double mid = (double) totalValue / result.length;
            System.out.println("average value: " + mid);
            System.out.println("continue? Q to quit, any to continue.");
            if(sc.next().equals("Q")){break;}
        }
    }

    private static int[] DiceMaker(Scanner sc, Random random) {
        System.out.println("how many dice do you want to roll?");
        int diceAmount = sc.nextInt();
        System.out.println("identical dice? 'yes' to apply, anything else to continue.");
        boolean identical = sc.next().equalsIgnoreCase("yes");

        int[] diceArr = new int[diceAmount];

        if (!identical) {
            for (int i = 0; i < diceAmount; i++) {

                System.out.println("dice-faces?");
                int faces = sc.nextInt();
                diceArr[i] = random.nextInt(0, faces) + 1;
            }
        } else {
            for (int i = 0; i < diceAmount; i++) {
                System.out.println("dice-faces?");
                int faces = sc.nextInt();
                diceArr[i] = random.nextInt(0, faces) + 1;
            }
        }
        return diceArr;
    }
}
