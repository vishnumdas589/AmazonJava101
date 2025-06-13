



package cardsGame;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.*;

public class Deck {
	 List<Card> cards;
	int cardCount;
	
	
	public Deck() {
		// TODO Auto-generated constructor stub
		String [] ranks = {"A","2","3","4","5","6","7","8","9","10","K","J","Q"};
		String [] suits = {"Hearts", "Diamonds", "Clubs", "spades"};
		cards = new ArrayList();
		for (String suit: suits ) {
			for (String rank: ranks) {
				Card card= new Card(suit,rank); 
//				card.getranksuit();
				cards.add(card);
				cardCount++;
//				card.getranksuit();
			}
		}
		
	}
	public void shuffle() {
		
		Collections.shuffle(this.cards);
		
		
	}
	public Card dealCard( ) {
		if(cardCount > 0) {
			this.cardCount --;
			return this.cards.remove(this.cards.size() -1);
			
			
		}
		
		return null;
		
	}
	
	public void showdeck() {
		int counter = 0;
		while(counter < this.cardCount) {
			cards.get(counter).getranksuit();
			counter++;
		}
	}

	
	
	
	
	

}
 