import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		double[][] numeros = new double[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				numeros[i][j] = sc.nextDouble();
			}
		}
		double[] vet = new double[M];
		for (int i = 0; i < M; i++) {
			double soma = 0.0;
			for (int j = 0; j < N; j++) {
				soma = soma + numeros[i][j];
//vai fazer os numeros da linha serem somados, o 0j eh o primeiro elemento, 1j o seg e assim po diante
			}
			vet[i] = soma;
		}
		for (int i = 0; i < M; i++) {
			System.out.printf("%.1f%n", vet[i]);
		}
		sc.close();
	}
}
