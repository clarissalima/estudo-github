import java.util.Scanner;

public class hehe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] nome = new String[N];
		
		for (int i=0; i<N; i++) {
			nome[i] = sc.next();
		}
		
		System.out.println("Nomes lidos: ");
		for (String s : nome) {
		//s funciona como um apelido
			System.out.println(s);
		}
		
		sc.close();
	}

}
