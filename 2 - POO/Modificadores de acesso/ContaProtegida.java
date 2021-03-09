import java.util.Scanner;

class Conta{
	//Atributos
	private int numeroDaConta;
	private String titularDaConta;
	private double saldoDaConta;

	//Seção de SETTERs e GETTERs
	public void setSaldoDaConta(double valor){
		if(valor >= 0){
			this.saldoDaConta += valor;
		}
	}
	public void setTitularDaConta(String titular){
		this.titularDaConta = titular;
	}
	public void setNumeroDaConta(int numeroConta){
		this.numeroDaConta = numeroConta;
	}

	public double getSaldoDaConta(){
		return this.saldoDaConta;
	}
	public String getTitularDaConta(){
		return this.titularDaConta;
	}
	public int getNumeroDaConta(){
		return this.numeroDaConta;
	}


	
	//Operações:
	public void deposito(double umValor){
	/*
		double saldoDaConta;
		saldoDaConta = 0.0;
		this.saldoDaConta = saldoDaConta;
		*/
		this.saldoDaConta += umValor;
	}

	public boolean saque(double umValor){
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

	public String recuperaDadosParaImpressao(){
		String dadosParaImpressao;
		dadosParaImpressao = "A conta numero  " + numeroDaConta +
							 " de " + titularDaConta +
							 " tem " + saldoDaConta + " de saldo.";
		return dadosParaImpressao;
	}

	public boolean transfere(Conta contaDeDestino,double valor){
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
		Conta conta1 = new Conta();
		
		conta1.setSaldoDaConta(200.00);
		double x, y;
		x = 300;
		y = 200;

		conta1.setSaldoDaConta(x-y);
		System.out.println(conta1.recuperaDadosParaImpressao());

	}
}