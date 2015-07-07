package sort.algs;
import java.util.Scanner;

public class Utilitario{
	public static int size;
	public static int[] inputToArray()
	{
		Scanner in = new Scanner(System.in);
		Utilitario.size = in.nextInt();
		int vetor[] = new int[Utilitario.size];
		int cont = 0;
		while(in.hasNextInt()){
			vetor[cont] = in.nextInt();
			cont++;
		}
		in.close();
		return vetor;
	}

}