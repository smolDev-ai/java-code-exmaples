package ifchallenge;

public class Main 
{
    public static void main(String[] args) 
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        if(gameOver)
        {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // STEP 1: insert a code segment here
        // STEP 2: set the existing score value to 10_000
        // STEP 3: set the existing levelcompleted value to 8
        // STEP 4: set bonus to 200
        // STEP 5: use the same if check as above
        
        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver)
        {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }    
}
