
package wargame;

import java.util.ArrayList;
import java.util.Random;

/*
 * @author Jaswinder Singh Sehgal
 * @version final
 */
public class Player {
 
    private String playerID1; //variable for unique ID of player1
    private String playerID2; //variable for unique ID of player2
    private String player1;//variable for storing name of player1
    private String player2;//variable for storing name of player2

    
    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID1;
    }

    public String getPlayerID2() {
        return playerID2;
    }

    public void setPlayerID1(int givenID1) {
        playerID1 = givenID1+"";
    }

    public void setPlayerID2(int givenID2) {
        playerID2 = givenID2+"";
    }

    /**
     * Method where the game is programmed. 
     */
    public void play() {

        Random r = new Random();
        Card x =null;


        ArrayList<Card> deck = new ArrayList<Card>();//creation of arraylist
        for (int i = 0; i < 4; i++)//outer loop for four suits 
        {
            for (int j = 1; j <= 13; j++)//inner loop for thirteen values each suit can have
             {
                //System.out.println(Card.SUIT.HEARTS.toString());
                x = new Card(Card.getSuit(Card.SUITS[i]), Card.getValue(Card.VALUES[j]));
                deck.add(x);//adding each card combination to the arraylist deck to create a full deck
            }
        }

        //using arraylists for both the players cards
        ArrayList<Card> player1 = new ArrayList<Card>();
        ArrayList<Card> player2 = new ArrayList<Card>();

        // Deal the cards randomly to the two players.
        int cnt = 0;
        while (deck.size() > 0) {
            int nextCard = r.nextInt(deck.size());
            if (cnt % 2 == 0) {
                Card c1 = deck.remove(nextCard);
                player1.add(c1);
            } else {
                player2.add(deck.remove(nextCard));
            }
            cnt++;
        }

        int winner = -1, turns = 0;

        // Play war until someone runs out of cards.
        while (player1.size() > 0 && player2.size() > 0 && turns < Card.LIMIT) {

            // Show how many cards each team has,
            System.out.println("Player 1 - "+getPlayer1()+" has " + player1.size() + " cards and Player 2 - "+getPlayer2() +" has "+ player2.size() + " cards.");

            Card c1 = player1.remove(0);
            Card c2 = player2.remove(0);

            // Print out the new play.
            System.out.println("Player 1 - "+getPlayer1()+" plays " + c1 + " and Player 2 - "+ getPlayer2()+" plays " + c2);

            // War!
            if (c1.equalsForWar(c2)) {

                // Notify that we have a war.
                System.out.println("We have a war!!!");

                // Not enough cards for player 1 to carry out the war.
                if (player1.size() < 3) {
                    winner = 2;
                    System.out.println("Player 1 - "+getPlayer1()+" ran out of cards in a war battle.");
                    break;
                } // Same case for player 2.
                else if (player2.size() < 3) {
                    winner = 1;
                    System.out.println("Player 2 - "+getPlayer2()+" ran out of cards in a war battle.");
                    break;
                } // Have a battle. Put two cards in the "bin" and battle with the third card.
                else {

                    // Two cards taken from both players stored in tmp.
                    ArrayList<Card> tmp = new ArrayList<Card>();
                    for (int i = 0; i < 2; i++) {
                        tmp.add(player1.remove(0));
                        tmp.add(player2.remove(0));
                    }

                    // These are the next cards to battle.
                    Card c1extra = player1.remove(0);
                    Card c2extra = player2.remove(0);

                    // Print out cards played in battle.
                    System.out.println("In the card battle player 1 played " + c1extra + " and player 2 played " + c2extra);

                    // I'll use the no tie-breaker rule between these cards to simplify the game.
                    if (c1extra.beats(c2extra)) {

                        // Lots of cards to add! (8 in all)
                        player1.add(c1);
                        player1.add(c2);
                        player1.add(c1extra);
                        player1.add(c2extra);
                        for (Card c : tmp) {
                            player1.add(c);
                        }

                        System.out.println("Player 1 wins the battle and gets all 8 cards!");
                    } else {

                        // Here we do it for player 2 instead.
                        player2.add(c1);
                        player2.add(c2);
                        player2.add(c1extra);
                        player2.add(c2extra);
                        for (Card c : tmp) {
                            player2.add(c);
                        }

                        System.out.println("Player 2 wins the battle and gets all 8 cards!");
                    }
                }
            } // Regular case.
            else {
                if (c1.beats(c2)) {
                    player1.add(c1);
                    player1.add(c2);
                    System.out.println("Player 1 wins the battle and gets 2 cards.");
                } else {
                    player2.add(c1);
                    player2.add(c2);
                    System.out.println("Player 2 wins the battle and gets 2 cards.");
                }

            }

            turns++;
            System.out.println();
        }

        if (turns == Card.LIMIT) {
            System.out.println("Sorry, after 10000 turns no one won, so the game is a tie!");
        } // Assign winner if unassigned.
        else if (winner == -1) {
            if (player2.size() == 0) {
                winner = 1;
            } else {
                winner = 2;
            }
        }

        // Print out final winner.
        if (winner != -1) {
            System.out.println("Congratulations - The winner is player " + winner);
            if(winner==1)
            {
                System.out.println("Congratulations "+getPlayer1()+"!");
                System.out.println("Better Luck Next Time "+getPlayer2()+"!");
            }
            if(winner!=1)
            {
                System.out.println("Congratulations "+getPlayer2()+"!");
                System.out.println("Better Luck Next Time "+getPlayer1()+"!");
            }
        }

    }

    /**
     * @return the player1
     */
    public String getPlayer1() {
        return player1;
    }

    /**
     * @param player1 the player1 to set
     */
    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    /**
     * @return the player2
     */
    public String getPlayer2() {
        return player2;
    }

    /**
     * @param player2 the player2 to set
     */
    public void setPlayer2(String player2) {
        this.player2 = player2;
    }
    
}
