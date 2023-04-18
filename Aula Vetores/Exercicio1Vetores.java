package ExVetoresMatrizes;

import java.util.Scanner;

public class Exercicio1Vetores {

	public static void main(String[] args) {
	
		
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6,};
		int pesq, posicao=-1, num;
		
		 System.out.print("Digite o número que você deseja encontrar: ");
	     pesq = leia.nextInt();
	     
	     for (num = 0; num < vetorInteiros.length; num++) {
	            if (vetorInteiros[num] == pesq) {
	                posicao = num;
	            }
	        }
	     
	     if (posicao == -1) {
	    	 System.out.printf("\nO número %d não foi encontrado", pesq);
	     }else {
	    	 System.out.printf("\nO número %d está localizado na posição: %d", pesq, posicao);
	     }

	}

}
