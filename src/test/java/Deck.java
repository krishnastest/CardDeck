import java.util.ArrayList;
import java.util.Collections;

public class Deck{

   // Attribute for Deck class, will be used when we create an object
   private final ArrayList<Card> cards;

//   ArrayList<Card> cards = new ArrayList<>();


   // Constructor of Deck class, returns an arraylist of cards
   public Deck() {
      cards = new ArrayList<>();
      for (Suites s: Suites.values()){
         for (Ranks r: Ranks.values()){
            this.cards.add(new Card(s,r));
         }
      }
   }

   // Method to create a deck if deck has no attribute
   public ArrayList<Card> createDeck(){

      for (Suites s: Suites.values()){
         for (Ranks r: Ranks.values()){
            this.cards.add(new Card(s,r));
         }
      }

      return cards;
   }

   //Method to shuffle the cards when deck has no attribute and is made to return and Arraylist of cards
   public ArrayList<Card> shuffleCards(ArrayList<Card> cards) {
       Collections.shuffle(cards);
       return cards;
   }

   // Method to shuffle cards directly on Deck object
   public ArrayList<Card> shuffle() {
      Collections.shuffle(cards);
      return cards;
   }

   //Get the size of deck
   public int size(){
      return cards.size();
   }

   //Draw a card from the deck
   public Card draw(){
      if(cards.isEmpty()){
         return null;
      }
      else {
         return cards.remove(cards.size() -1);
      }
   }

   @Override
   public String toString(){
      return String.valueOf(this.cards);
   }

   public static void main(String[] args) {
      Deck deck = new Deck();
      deck.shuffle();
      System.out.println("Size of deck is " +deck.size());
      Card card1 = deck.draw();
      System.out.println("First card is "+card1 + "\n" + "New Deck size is " + deck.size());
      Card card2 = deck.draw();
      System.out.println("Second card is "+card2 + "\n" + "New Deck size is " + deck.size());
      System.out.println(deck);

//      System.out.println(deck.shuffle());
//      Deck deck = new Deck();
//      ArrayList<Card> cards = deck.createDeck();
//      System.out.println(cards.get(0));
//      System.out.println(deck.shuffleCards(cards));
//      System.out.println(shuffleCards(cards));
   }

}
