

package cardsGame;
import java.util.List;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;


public class Card {
	private final String suit;
	private final String rank;
	public Card(String suit, String rank) {
		// TODO Auto-generated constructor stub
		this.suit =suit;
		this.rank = rank;
	}
	public int getValue() {
		switch(rank) {
		case "A" : return 11;
		case "J" : return 10;
		case "K" : return 10;
		case "Q" : return 10;
		default  : return Integer.parseInt(rank);
		}
	}
	public void getranksuit() {
		System.out.println(this.rank +" " + this.suit);
	}
	

}
