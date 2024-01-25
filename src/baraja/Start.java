package baraja;

public class Start {

	public static void main(String[] args) {
		
		Baraja deck = new Baraja();
		System.out.println(deck);
		
		//deck.voltearCarta('A', 'C');
		//deck.voltearCarta('2', 'C');
		deck.barajar();
		System.out.println(deck);
	}
	
}
