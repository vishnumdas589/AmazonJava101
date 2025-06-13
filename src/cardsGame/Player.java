import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

package cardsGame;

public class Player {
	String name;
	List<Card> cards;
	public int calculateValue(List<Card>cards) {
		int totalValue =0;
		for(Card card: cards) {
			totalValue += card.rank;
		}
		return totalValue;
		
	}
			
	
}
