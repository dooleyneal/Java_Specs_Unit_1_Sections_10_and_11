import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Task 2: Explain the rules

        >>Let's play Pokerito. Type anything when you're ready.
        |
        >>It's like Poker, but a lot simpler.
        >> (new line)
        >> • There are two players, you and the computer.
        >> • The dealer will give each player one card.
        >> • Then, the dealer will draw five cards (the river)
        >> • The player with the most river matches wins!
        >> • If the matches are equal, everyone's a winner!
        >> (new line)
        >> • Ready? Type anything if you are.
        |
        */
        System.out.println(">>Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();

        System.out.println(" \n>> • There are two players, you and the computer.\n" +
                "        >> • The dealer will give each player one card.\n" +
                "        >> • Then, the dealer will draw five cards (the river)\n" +
                "        >> • The player with the most river matches wins!\n" +
                "        >> • If the matches are equal, everyone's a winner!\n" +
                "        >> • Ready? Type anything if you are.");
        scan.nextLine();
        

        /*Task 3: Present the user with a card
         println 'Here's your card:'
         <show card>
         <new line>
         println 'Here's the computer's card:'
         <show computer's card>
        */
        System.out.println("Here's your card: ");
        String yourCard = randomCard();
        System.out.println(yourCard);

        String computerCard = randomCard();
        System.out.println("Here's the computer's card: ");
        System.out.println(computerCard);


        int yourMatches = 0;
        int computerMatches =0;

        /** Task 4 - Draw five cards
         * 
         * • print:  Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         *      Card 1 
         *      <2 new lines>
         *      <print card>
         *      Card 2
         *      <2 new lines>
         *      <print card>
         *      ...
         */
        System.out.println("Now, the dealer will draw your five cards. Press enter to continue.");
        scan.nextLine();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Press enter to continue.");
            scan.nextLine();
            String randCard = randomCard();
            if (randCard.equals(yourCard)) {
                yourMatches ++;
            }
            System.out.println("Card" + i);
            System.out.println(randCard);
        }

        System.out.println("Now, the dealer will draw the computer's five cards. Press enter to continue.");
        scan.nextLine();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Press enter to continue.");
            scan.nextLine();
            String randCard = randomCard();
            if (randCard.equals(computerCard)) {
                computerMatches ++;
            }
            System.out.println("Card" + i);
            System.out.println(randCard);
        }

        /** Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         * 
         * • If you have more matches, print: You win!. 
         * • If the computer has more matches, print: The computer wins! 
         * • If the matches are equal, print: everyone wins!.
         */

        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        if (yourMatches > computerMatches) {
            System.out.println("You win");
        }
        else if (yourMatches < computerMatches) {
            System.out.println("You lose");
        }
        else {
            System.out.println("Tie");
        }
         scan.close();
    }

    /** Task 1
     * 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */
    public static String randomCard() {
        int randNum = (int)(13*Math.random() + 1);
        switch (randNum) {
            case 1: return "   _____\n"+
                    "  |A _  |\n"+
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";

            case 2: return "   _____\n"+
                    "  |2    |\n"+
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";

            case 3: return "   _____\n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n";

            case 4: return "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";

            case 5: return "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6: return  "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7: return "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";

            case 8: return "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";

            case 9: return "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10: return "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";

            case 11: return "   _____\n" +
                    "  |J  ww|\n"+
                    "  | o {)|\n"+
                    "  |o o% |\n"+
                    "  | | % |\n"+
                    "  |__%%[|\n";

            case 12: return "   _____\n" +
                    "  |Q  ww|\n"+
                    "  | o {(|\n"+
                    "  |o o%%|\n"+
                    "  | |%%%|\n"+
                    "  |_%%%O|\n";

            case 13: return "   _____\n" +
                    "  |K  WW|\n"+
                    "  | o {)|\n"+
                    "  |o o%%|\n"+
                    "  | |%%%|\n"+
                    "  |_%%%>|\n";

            default: return null;
        }
    }

}
