package tradswitchchallenge;

public class TradSwitch
{
    /*

        In this challenge we'll be using the NATO alphabet to  replace a character or letter with NATO's standardized word.
        So, CAR would be: Charlie, Able, Roger

        NATO Alphabet:
        A - Able
        B - Baker
        C - Charlie
        D - Dog
        E - Easy
        F - Fox
        G - George
        H - How
        I - Item
        J - Jig
        K - King
        L - Love
        M - Mike
        N - Nan
        O - Oboe
        P - Peter
        Q - Queen
        R - Roger
        S - Sugar
        T - Tare
        U - Uncle
        V - Victor
        W - William
        X - X-ray
        Y - Yoke
        Z - Zebra

        STEP 1: Create a new char variable
        STEP 2: Use a traditional switch statement that tests the value in step 1
        STEP 3: Create cases for the characters: A, B, C, D, E
        STEP 4: Display a message in each case block with the letter and NATO word, then break
        STEP 5: Add a default block which displays the letter with a message saying not found


     */

    public static void tradSwitch(char letter)
    {
        switch(letter)
        {
            case 'A':
                System.out.println("A - Able");
                break;
            case 'B':
                System.out.println("B - Baker");
                break;
            case 'C':
                System.out.println("C - Charlie");
                break;
            case 'D':
                System.out.println("D - Dog");
                break;
            case 'E':
                System.out.println("E - Easy");
                break;
            default:
                System.out.println(letter + " Not Found");
                break;
        }
    }

    public static void main(String[] args)
    {
       tradSwitch('A');
        System.out.println();
       tradSwitch('B');
        System.out.println();
        tradSwitch('C');
        System.out.println();
        tradSwitch('D');
        System.out.println();
        tradSwitch('E');
        System.out.println();
        tradSwitch('F');
    }
}
