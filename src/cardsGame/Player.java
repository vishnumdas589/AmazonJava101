
package cardsGame;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


public class Player {
	public String name;
	private List<Card> cards;
	private int handValue;
	public Player(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.handValue = 0;
		cards = new ArrayList();
		
	}
	
	public int gethandValue() {
		return this.handValue;
		
	}
	public void recieveCard(Card card) {
		this.cards.add(card);
		this.handValue += card.getValue();
		
	}
			
	
}
