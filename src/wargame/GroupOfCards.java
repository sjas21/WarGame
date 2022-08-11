
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wargame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
 
/**
 *
 * @author ranjeet
 */
public class GroupOfCards {
    
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size;//the size of the grouping
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
 
    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }
 
    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
  
    /**
     * @author Jaswinder Singh Sehgal
     * @version final
     */
    public class Game {
 
        public Collection<Player> players;
  
        public Collection<Player> getPlayers() {
            return this.players;
        }
 
        public void setPlayers(Collection<Player> players) {
            this.players = players;
        }
 
  
    }
    
}
 