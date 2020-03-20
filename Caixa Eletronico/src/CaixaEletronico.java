
public class CaixaEletronico {
	private double valorDeSaque;
	public void saque(double valorDeSaque){
		this.valorDeSaque = valorDeSaque;
		if(this.valorDeSaque>=100) {
			System.out.printf("%d nota de R$100 \n", notasDeCem(this.valorDeSaque ));
		}
		if(this.valorDeSaque>=50) {
			System.out.printf("%d nota de R$50 \n", notasDeCinquenta(this.valorDeSaque ));
		}
		if(this.valorDeSaque>=20) {
			System.out.printf("%d nota de R$20 \n", notasDeVinte(this.valorDeSaque ));
		}
		if(this.valorDeSaque>=10) {
			System.out.printf("%d nota de R$10 \n", notasDeDez(this.valorDeSaque ));
		}
	}
	public int notasDeCem(double valorDeSaqueEmNotasDeCem) {
		int aux;
		aux = (int)valorDeSaqueEmNotasDeCem / 100;
		valorDeSaque = valorDeSaqueEmNotasDeCem % 100;
		return aux;
	}
	
	public int notasDeCinquenta(double valorDeSaqueEmNotasDeCinquenta) {
		int aux;
		aux = (int)valorDeSaqueEmNotasDeCinquenta / 50;
		valorDeSaque = valorDeSaqueEmNotasDeCinquenta % 50;
		return aux;
	}
	
	public int notasDeVinte(double valorDeSaqueEmNotasDeVinte) {
		int aux;
		aux = (int)valorDeSaqueEmNotasDeVinte / 20;
		valorDeSaque = valorDeSaqueEmNotasDeVinte % 20;
		return aux;
	}
	
	public int notasDeDez(double valorDeSaqueEmNotasDeDez) {
		int aux;
		aux = (int)valorDeSaqueEmNotasDeDez / 10;
		valorDeSaque = valorDeSaqueEmNotasDeDez % 10;
		return aux;
	}
}
