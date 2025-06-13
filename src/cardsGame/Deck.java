import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



package cardsGame;

public class Deck {
	ArrayList<Card> cards;
	public void shuffle(List<Card> cards) {
		
		Collections.shuffle(cards);
		
	}
	public Card dealCard(ArrayList<Card> cards) {
		
		return cards.remove(cards.size() -1);
		
	}

	
	
	
	
	

}
 