package cardsGame;
import java.util.*;

public class Game {
	private Deck deck;
	private Player player1;
	private Player player2;
	public Game(String name1,String name2) {
		// TODO Auto-generated constructor stub
		this.deck = new Deck();
		deck.shuffle();
//		deck.showdeck();
		this.player1 = new Player(name1);
		this.player2 = new Player(name2);
		
		
		
	}

	public void startGame() {
		// TODO Auto-generated method stub
		player1.recieveCard(deck.dealCard());
		System.out.println(this.player1.name +" card value : "+ player1.gethandValue() );
		System.out.println("deckcount  : "+ deck.cardCount );
		
		player2.recieveCard(deck.dealCard());
		System.out.println(this.player2.name +" card value : "+ player2.gethandValue() );
		System.out.println("deckcount  : "+ deck.cardCount );
		
	}
	public static void main(String[] args) {
		Game newgame = new Game("vishnu", "amit");
		newgame.startGame();
	}

		
	

}
