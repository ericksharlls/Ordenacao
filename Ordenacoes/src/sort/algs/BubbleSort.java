package sort.algs;
import java.util.Date;

public class BubbleSort{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int vetorPiorCaso[] = Utilitario.inputToArray();
				Date dt  = new Date();
								
				// Variavel para informar se o vetor já está ordenado
				boolean precisaSerOrdenado = true;
				
				// Para contar a quantidade de operacoes que influencia na complexidade do Algoritmo.
				int contadorDeOperacoes = 0;
				long time1 = dt.getTime();
				while (precisaSerOrdenado) {
					// Caso o vetor jah esteja ordenado, ele tera suas posicoes percorridas uma unica vez e 
					// a variavel precisaSerOrdenado nunca recebera 'true'. Essa possibilidade ilustra o melhor caso do Algoritmo, que eh O(n).
					precisaSerOrdenado = false;
					for (int i = 0; i < vetorPiorCaso.length - 1; i++) { //vetor.length - 1 
						if (vetorPiorCaso[i] > vetorPiorCaso[i + 1]) {
							// Fazendo a troca dos numeros sem utilizar variavel auxiliar
							vetorPiorCaso[i + 1] = vetorPiorCaso[i] + vetorPiorCaso[i + 1];
							vetorPiorCaso[i] = vetorPiorCaso[i + 1] - vetorPiorCaso[i];
							vetorPiorCaso[i + 1] = vetorPiorCaso[i + 1] - vetorPiorCaso[i];
							precisaSerOrdenado = true;
						}
						contadorDeOperacoes++;
					}
					for (int e : vetorPiorCaso) {
						System.out.print(e + ", ");
					}
					System.out.println();
				}
				Date dt2  = new Date();
				long time2 = dt2.getTime();
				System.out.println("Contador:" + contadorDeOperacoes);

				System.out.println("Tempo de execução ms: "+(time2-time1));
		

	}

}
