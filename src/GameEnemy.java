import java.util.Random;

public class GameEnemy {

    Random rand = new Random();
    private final int mHealth;
    private final int damage;
    private final int scoreV;
    private boolean charged = false;
    private boolean defending = false;
    public int getScoreV() {return scoreV;}
    public int cHealth;


    GameEnemy(double mult) {
        mHealth = (int) ((rand.nextInt(2,6)+1)* mult);
        cHealth = mHealth;
        damage = (int) ((rand.nextInt(0,2)+1)* mult);
        scoreV = (int) (mult *10);
    }


    public void EnemyTurn(GamePlayer player){
        if(charged)
        {
            System.out.println("the enemy unleashes a charged attack!!!");
            player.TakeDamage(damage*2);
        }
        else
        {
            switch (rand.nextInt(3))
            {
                case 0:
                    System.out.println("the enemy attacks!");
                    player.TakeDamage(damage);
                    break;
                case 1:
                    System.out.println("the enemy defends!");
                    defending = true;
                    break;
                case 2:
                    System.out.println("the enemy starts charging!!");
                    charged = true;
                    break;
            }
        }
    }

    public void TakeDamage(int damage){
        if(defending)cHealth -= damage/2;
        else cHealth -= damage;
    }

    public void PrintStatus(){
        System.out.println("The enemy (Evil!)");
        System.out.println("\n Health: " + cHealth + "/" + mHealth +
                "\n Damage:" + damage + "\n\n");
    }
}
