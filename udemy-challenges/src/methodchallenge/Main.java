package methodchallenge;

public class Main
{
    // Write two methods
    // the first method should be named displayHighScorePosition
    // the first method should have two parameters one for a player's name,
    // and one for the player's position
    // the first method should print out a message like "name managed to get into
    // position 2 on the leaderboard."

    // the second method should be named calculateHighScorePosition
    // this method should have only one parameter: player score
    // should return:
    // 1: score is greater than or equal to 1000
    // 2: score is greater than or equal to 500, but less than 1000
    // 3: score is greater than or equal to 100, but less than 500
    // 4: all other scores

    // call both methods with the following scores
    // 1500
    // 1000
    // 500
    // 100
    // 25

    public static void displayHighScorePosition(String name, int position)
    {
        System.out.println(name + " managed to get to position " + position);
    }

    public static int calculateHighScorePosition(int score)
    {
        if(score >= 1000)
        {
            return 1;
        } else if(score >= 500) {
            return 2;
        } else if(score >= 100)
        {
            return 3;
        }

        return 4;
    }


    public static void main(String[] args)
    {
        int score = 1500;
        displayHighScorePosition("Player 1", calculateHighScorePosition(score));

        score = 1000;
        displayHighScorePosition("Player 2", calculateHighScorePosition(score));

        score = 500;
        displayHighScorePosition("Player 3", calculateHighScorePosition(score));

        score = 100;
        displayHighScorePosition("Player 4", calculateHighScorePosition(score));

        score = 25;
        displayHighScorePosition("Player 5", calculateHighScorePosition(score));

    }
}