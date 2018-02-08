
public class Card {
	String suit;
	int numb;
	
public Card(String suit, int numb) {
	this.suit=suit;
	this.numb=numb;
}

private String getSuit() {
	return suit;
}

private void setSuit(String suit) {
	this.suit = suit;
}

private int getNumb() {
	return numb;
}

private void setNumb(int numb) {
	this.numb = numb;
}


}
