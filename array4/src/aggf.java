import java.util.Locale;
import java.util.Scanner;

public class aggf {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] nomes = new String[N];
		int[] idades = new int[N];
		double[] alturas = new double[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			alturas[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i<N; i++) {
			soma = soma + alturas[i];			
		}
		double media = soma / N;
		System.out.printf("Altura media: %.2f\n", media);
		
		
		int cont = 0;
		for (int i=0; i<N; i++) {
			if (idades[i] < 16) {
				cont++;
			}
		}
		double x = cont * 100.0 / N;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", x);
	//pra mostrar porcentagem tem que colocar %%
		
		sc.close();
	}

}
