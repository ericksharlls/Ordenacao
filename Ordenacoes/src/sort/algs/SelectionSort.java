package sort.algs;

public class SelectionSort {

	static int vetor[] = {20, 19, 11, 17, 1, 2, 6, 4, 9, 5};
	static int posicaoDoMenorNumero = 0; 

	public static void main(String[] args) {
		selectionSort(vetor);
		for (int e : vetor) {
			System.out.print(e + ", ");
		}
		System.out.println();
	}

	static void selectionSort(int[] vetor) {
		for (int indice = 0; indice < vetor.length - 1; indice++) {
			posicaoDoMenorNumero = indice;

			// O metodo 'encontreAPosicaoDoMenorNumero' eh invocado com a finalidade de se encontrar a posicao do menor numero de um subarray formado a partir do 
			// vetor (array) inicial, que foi dado como entrada do programa. Esse subarray se inicia na posicao 'indice' do vetor de entrada do programa.
			// Caso seja encontrado um elemento menor que o elemento armazenado na posicao 'indice', a posicao deste sera atribuida a variavel 'posicaoDoMenorNumero', 
			// como pode ser visto no corpo do metodo 'encontreAPosicaoDoMenorNumero'.
			encontreAPosicaoDoMenorNumero(indice, vetor);

			// Apos a execucao da linha anterior, a variavel global 'posicaoDoMenorNumero', tem armazenado o indice do menor numero do subarray considerado a partir da posicao 'indice' do array de entrada.
			// Caso 'posicaoDoMenorNumero' seja diferente de 'indice', � feita a troca dos elementos que estao nas posicoes 'posicaoDoMenorNumero' e 'indice'.
			// Mas caso o indice do menor numero do subarray ('posicaoDoMenorNumero') considerado seja igual a 'indice', a troca nao se faz necessaria, pois o  
			// elemento que jah estah na posicao 'indice', jah eh o menor do subarray considerado no momento (subarray a partir das posicao 'indice').
			if (posicaoDoMenorNumero != indice) {
				// Troca dos elementos das posicoes 'posicaoDoMenorNumero' e 'indice' do vetor de entrada 
				troca(posicaoDoMenorNumero, indice, vetor);
			}
			for (int e : vetor) {
				System.out.print(e + ", ");
			}
			System.out.println();
			
		}
	}

	static void encontreAPosicaoDoMenorNumero(int indiceInicialDoSubArray, int[] subArray) {
		for (int k = indiceInicialDoSubArray + 1; k < vetor.length; k++) {
			if (vetor[posicaoDoMenorNumero] > vetor[k]) {
				posicaoDoMenorNumero = k;
			}
		}
	}

	static void troca(int posicao1, int posicao2, int[] vetor) {
		vetor[posicao1] = vetor[posicao2] + vetor[posicao1];
		vetor[posicao2] = vetor[posicao1] - vetor[posicao2];
		vetor[posicao1] = vetor[posicao1] - vetor[posicao2];
	}

}
