import java.util.Scanner;

class Conta{
	//Atributos
	int numeroDaConta;
	String titularDaConta;
	double saldoDaConta;
	
	
	//Operações:
	void deposito(double umValor){
	/*
		double saldoDaConta;
		saldoDaConta = 0.0;
		this.saldoDaConta = saldoDaConta;
		*/
		this.saldoDaConta += umValor;
	}

	boolean saque(double umValor){
		boolean podeSacar;
		podeSacar = false;

		if (umValor > saldoDaConta){
			return podeSacar;
		}
		else{
			this.saldoDaConta -= umValor;
			podeSacar = true;
		}
		return podeSacar;
	}

	String recuperaDadosParaImpressao(){
		String dadosParaImpressao;
		dadosParaImpressao = "A conta numero  " + numeroDaConta +
							 " de " + titularDaConta +
							 " tem " + saldoDaConta + " de saldo.";
		return dadosParaImpressao;
	}

	boolean transfere(Conta contaDeDestino,double valor){
		if(this.saldoDaConta >= valor){
			contaDeDestino.deposito(valor);
			this.saldoDaConta -= valor;
			return true;
		}
		else{
			return false;
		}
	}
}


class Main {
	public static void main (String args []){
		Conta minhaConta = new Conta();
		
		minhaConta.titularDaConta = "Jose";
		minhaConta.numeroDaConta = 1000;
		
		minhaConta.deposito(500.00);
		System.out.println("Saldo apos deposito de 500,00 = " +minhaConta.saldoDaConta);
		minhaConta.saque (100.00);
		System.out.println("Saldo apos saque de 100,00 = " +minhaConta.saldoDaConta);
		
		System.out.println(minhaConta.recuperaDadosParaImpressao());
		
		if(!minhaConta.saque(600.00))
			System.out.println("Nao Pode sacar!");
		else
			System.out.println("Nao pode sacal!");
		
		
		
		Conta contaDosSonhos = new Conta();
		
		contaDosSonhos.numeroDaConta = 2000;
		contaDosSonhos.titularDaConta = "Fabio";
		contaDosSonhos.saldoDaConta = 1500000.00;
		
		System.out.println("A conta dos sonhos:");
		System.out.println(contaDosSonhos.recuperaDadosParaImpressao());
		minhaConta = contaDosSonhos;
		
		if(minhaConta == contaDosSonhos)
			System.out.println("As duas referencias sao iguais");
		else
			System.out.println("As duas referencias nao sao iguais");
	}
}