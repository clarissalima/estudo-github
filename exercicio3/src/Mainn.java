import java.util.Locale;
import java.util.Scanner;

public class Mainn {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		
		
		double media = (double) (idade1 + idade2) / 2;
//como os valores s�o inteiros e a m�dia � double, � necess�rio usar double entre parenteses
		
		System.out.printf("A idade media de %s e %s eh de %.1f anos", nome1, nome2, media);
		
		sc.close();
	}

}
