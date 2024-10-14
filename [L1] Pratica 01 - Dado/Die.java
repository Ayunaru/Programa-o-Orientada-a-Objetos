import java.util.Random;

public class Die 
{
    int sideUp;
    Random random = new Random();

    void roll() 
    {
        sideUp = random.nextInt(6) + 1;
    }

    void Die() 
    {
        roll();
    }

    int getSideUp() 
    {
        return sideUp;
    }

}