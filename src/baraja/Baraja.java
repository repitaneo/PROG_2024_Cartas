package baraja;

import java.util.Arrays;

public class Baraja {

	private Carta cartas[];
	
	
	public Baraja() {
		
		cartas = new Carta[52];

		int posicion = 0;
		for(int i=0;i<13;i++) {
			cartas[posicion++] = creadorCarta(i+1,'C');
		}
		for(int i=0;i<13;i++) {
			cartas[posicion++] = creadorCarta(i+1,'P');
		}
		for(int i=0;i<13;i++) {
			cartas[posicion++] = creadorCarta(i+1,'T');
		}
		for(int i=0;i<13;i++) {
			cartas[posicion++] = creadorCarta(i+1,'D');
		}
	}


	
	
	private Carta creadorCarta(int numero, char palo) {

		Carta carta = new Carta();
		switch(numero) {
		
			case 1: carta.setValor('A'); break;
			case 2: carta.setValor('2'); break;
			case 3: carta.setValor('3'); break;
			case 4: carta.setValor('4'); break;
			case 5: carta.setValor('5'); break;
			case 6: carta.setValor('6'); break;
			case 7: carta.setValor('7'); break;
			case 8: carta.setValor('8'); break;
			case 9: carta.setValor('9'); break;
			case 10: carta.setValor('D'); break;
			case 11: carta.setValor('J'); break;
			case 12: carta.setValor('Q'); break;
			case 13: carta.setValor('K'); break;
		}
		carta.setPalo(palo);
		
		return carta;
	}




	@Override
	public String toString() {
		return "Baraja " + Arrays.toString(cartas) ;
	}
	
	
	
	
	public void voltearCarta(char valor, char palo) {
		
		//Buscar Carta --valor, palo--
		System.out.println(buscarCarta(valor,palo));
		System.out.println(buscarIndiceCarta(valor,palo));
		
		//dar vuelta carta
		
	}
	
	
	/**
	 * Esta operación buscar una carta y devulve el objeto carta
	 * que se encuentra en el vector
	 * 
	 * @param valor de la carta
	 * @param palo de la carta
	 * @return una Carta que está en "cartas"
	 */
	private Carta buscarCarta(char valor, char palo) {
		
		Carta devolver = null;
		int i = 0;
		boolean encontrado = false;
		
		while((i<cartas.length)&&(!encontrado)) {
			
			if(cartas[i].getValor()==valor 
			   && cartas[i].getPalo()==palo) {
				
				encontrado = true;
				devolver = cartas[i];
			}
			i++;
		}
		return devolver;
	}
	
	
	
	private int buscarIndiceCarta(char valor, char palo) {
		
		int devolver = -1;
		int i = 0;
		boolean encontrado = false;
		
		while((i<cartas.length)&&(!encontrado)) {
			
			if(cartas[i].getValor()==valor 
			   && cartas[i].getPalo()==palo) {
				
				encontrado = true;
				devolver = i;
			}
			i++;
		}
		return devolver;
	}
	
	
}
