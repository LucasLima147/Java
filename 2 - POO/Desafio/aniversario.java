import java.util.Scanner;

class Pessoa{
	String nome;
	int idade;

	void fazAniversario(){
		this.idade += 1;
	}
}

class MainAniversario{
	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		Pessoa umaPessoa = new Pessoa();

		System.out.print("\nDigite o nome da pessoa: ");
		umaPessoa.nome = lerTeclado.nextLine();
		System.out.print("Digite a idade da pessoa: ");
		umaPessoa.idade = lerTeclado.nextInt();
		System.out.println("\nA pessoa " + umaPessoa.nome + " tem a idade " + umaPessoa.idade);
		
		//Aniversarios
		umaPessoa.fazAniversario();
		umaPessoa.fazAniversario();
		umaPessoa.fazAniversario();
		umaPessoa.fazAniversario();

		System.out.println("Agora essa pessoa tem "+umaPessoa.idade+" anos");
	}
}