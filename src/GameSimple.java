import java.util.Scanner;

public class GameSimple
{
    public void RunGame()
    {
        Scanner input = new Scanner(System.in);
        double mult=1;
        GamePlayer player = new GamePlayer();
        GameEnemy enemy = new GameEnemy(mult);

        System.out.println("new game started.");

        while (player.getPHealth() > 0)
        {
            enemy.PrintStatus();
            player.PrintStatus();

            player.playerTurn(enemy, input);
            if(enemy.cHealth <=0) //dead enemy handling
            {
                player.pScore += enemy.getScoreV();
                mult += 0.2;
                enemy = new GameEnemy(mult);
                System.out.println("an enemy has appeared!");
                continue;
            }

            enemy.EnemyTurn(player);
        }
    }

}
