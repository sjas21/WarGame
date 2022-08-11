/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wargame;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Jaswinder Singh Sehgal
 * @version final
 */
public class Game {
    

   public ArrayList <Player> players;// the players of the game
   
   public static void main(String[] args){
       Game g= new Game();
       Scanner sc = new Scanner(System.in);
       System.out.println("War!!! - The Conquest of Cards!");
       Player x = new Player();
       System.out.println("Enter Player 1 name : ");
       String n1=sc.next();
       System.out.println("Enter Player 2 name : ");
       String n2=sc.next();
       x.setPlayer1(n1);
       x.setPlayer2(n2);
       x.setPlayerID1((int)((Math.random()+1)*500000));
       x.setPlayerID2((int)((Math.random()+1)*500000));
       System.out.println();
       System.out.println("Welcome : "+x.getPlayer1()+" : "+x.getPlayerID());
       System.out.println("Welcome : "+x.getPlayer2()+" : "+x.getPlayerID2());

       System.out.println();
       System.out.println();
       System.out.println("/t/tINSTRUCTIONS/t/t");
       System.out.println("1.The game divides the deck of 52 cards into two players and then each player throws a random card.");
       System.out.println("2.The cards are matched and the winning card takes both the cards");
       System.out.println("3.If both the players throw same valued card, then its a WAR!");
       System.out.println("4.The player with maximum cards wins!");
       System.out.println(x);
       sc.close();
       x.play();
       
   }
   
   public Game()
   {
       players = new ArrayList<Player>();
   }

  
   
    /**
    * @return the players of this game
    */
   public ArrayList <Player> getPlayers() 
   {
       return players;
   }

   /**
    * @param players the players of this game
    */
   public void setPlayers(ArrayList <Player> players) 
   {
       this.players = players;
   }
   
   /**
    * Play the game. This might be one method or many method calls depending
    * on your game.
    */
   public void play(){
       
   }
   
   /**
    * When the game is over, use this method to declare and display a winning
    * player.
    */

   public static void declareWinner(){
       
   }
   
    
}
