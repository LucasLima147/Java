class Data{
	int dia, mes, ano;

	String dataFormatada(){
		String data = "dia: "+this.dia;
			data += "/"+this.mes+"/"+this.ano;
		return data;
	}
}

class Cliente{
	String nome, sobrenome, cpf;
}

class Conta{
	// Atributos
	int numeroDaConta;
	double saldoDaConta;
	String agencia;
	Cliente titular = new Cliente();
	Data dataDeAbertura = new Data();

	// Metodos
	void deposita(double valor){
		this.saldoDaConta += valor;
	}

	boolean saque(double valor){
		if(this.saldoDaConta >= valor){
			this.saldoDaConta -= valor;
			return true;
		}
		else{
			return false;
		}
	}

	double calculaRendimento(){
		return this.saldoDaConta*0.1;
	}

	String recuperaDadosParaImpressao(){
     String dados = "Titular: " + this.titular.nome +
     		" "+ this.titular.sobrenome +
     		"\nCPF do titular: "+this.titular.cpf +
     		"\nNumero: " + this.numeroDaConta +
     		"\nAgencia: " + this.agencia +
     		"\nData de abetura: " + this.dataDeAbertura.dataFormatada()+
     		"\nSaldo: " + this.saldoDaConta+
     		"\nRendimento mensal: " + this.calculaRendimento();
     return dados;
  	}

}

class TestaConta {
   public static void main(String[] args) {
      Conta c1 = new Conta();
      c1.titular.nome = "Hugo";
      c1.titular.sobrenome = "Lima";
      c1.titular.cpf = "000.000.000-00";
      c1.numeroDaConta = 123;
      c1.agencia = "45678-9";
      c1.saldoDaConta = 50.0;
      c1.dataDeAbertura.dia = 10;
      c1.dataDeAbertura.mes = 06;
      c1.dataDeAbertura.ano = 2000;
      c1.deposita(100.0);
      System.out.println("saldo atual: " + c1.saldoDaConta);
      System.out.println("rendimento mensal: " + c1.calculaRendimento());
      System.out.println("Descricao da conta:\n"+c1.recuperaDadosParaImpressao());
   }
}
