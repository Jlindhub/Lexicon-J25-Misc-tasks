import java.util.Scanner;

public class GamePlayer
{
    private final int pMaxHealth;
    private final int pDamage;
    private boolean defending;
    private boolean charged;
    private int pHealth;
    public int getPHealth() {return pHealth;}
    public int pScore;

    GamePlayer()
    {
        pMaxHealth = 10;
        pHealth = 10;
        pDamage = 1;
        pScore = 0;
    }

    public void playerTurn(GameEnemy enemy, Scanner in)
    {
        if (charged)
        {
            System.out.println("you unleash a charged attack!!");
            enemy.TakeDamage(pDamage * 2);
            charged = false;
        }
        else
        {
            System.out.println("What do you want to do? \n" +
                    "1: attack for " + pDamage + " damage \n" +
                    "2: defend (halves incoming damage)\n" +
                    "3: Charge attack (double next damage, locks in next turn!)\n" +
                    "4: give up and die (quit game)");
            switch (in.nextInt())
            {
                case 1:
                    System.out.println("You attack!");
                    enemy.TakeDamage(pDamage);
                    break;
                case 2:
                    System.out.println("You defend!");
                    defending = true;
                    break;
                case 3:
                    System.out.println("You start charging!");
                    charged = true;
                    break;
                case 4:
                    System.out.println("You gave up!");
                    pHealth = 0;
                    break;
            }
        }
    }

    public void TakeDamage(int damage)
    {
        if (defending) pHealth -= damage / 2;
        else pHealth -= damage;
    }

    public void PrintStatus()
    {
        System.out.println("The hero (you!):");
        System.out.println("\n Health: " + pHealth + "/" + pMaxHealth +
                "\n Damage:" + pDamage + "score"+ pScore + "\n\n");
    }
}
