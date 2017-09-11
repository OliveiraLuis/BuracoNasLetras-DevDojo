package dojo;

public class BuracoNasLetras {

	public static int numBuracos(String palavra) {
		int resposta = 0;
		for(int i=0; i<palavra.length(); i++) {
			resposta += numBuracoLetra(palavra.charAt(i));
		}
		return resposta;	
	}
	
	public static int numBuracoLetra(char letra) {
		int resposta = 0;
		
		if( 
			(letra == 'A') || (letra == 'D') ||
			(letra == 'O') || (letra == 'P') ||
			(letra == 'Q') || (letra == 'R')
		  ) {
			resposta = 1;
		}else if(letra == 'B') {  
			resposta = 2;
		}else {
			resposta = 0;
		}
		
		return resposta;
	}

}
