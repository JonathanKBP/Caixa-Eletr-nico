import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		int saque=1;
		while(saque == 1) {
			System.out.println("Digite o valor de saque: ");
			caixaEletronico.saque(sc.nextDouble());
			System.out.println("Digite 1 para sacar novamente");
			saque = sc.nextInt();
		}
		System.out.println("Fim da operacao");
		
		sc.close();
	}

}
