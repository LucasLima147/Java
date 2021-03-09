import java.util.Scanner;

class Retangulo{
	float lado1, lado2, perimetro, area;

	float calculeArea(){
		this.area = (float) this.lado1 * this.lado2;
		return this.area;
	}

	float calculePerimetro(){
		this.perimetro =  (this.lado1*2) + (this.lado2*2);
		return this.perimetro;
	}
}


class Main{
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		Retangulo ret1 = new Retangulo();
		Retangulo ret2 = new Retangulo();
		Retangulo ret3 = new Retangulo();

		System.out.println("\nVamos calcular a area e o perimetro de 3 retangulos");
		// Retangulo 1
		System.out.print("Digite o valor do lado 1 do primeiro triangulo: ");
		ret1.lado1 = ler.nextFloat();
		System.out.print("Digite o valor do lado 2 do primeiro triangulo: ");
		ret1.lado2 = ler.nextFloat();
		System.out.printf("O perimetro do retangulo 1 eh: %.2f \n", ret1.calculePerimetro());
		System.out.printf("A Area do retangulo 1 eh: %.2f \n", ret1.calculeArea());

		// Retangulo 2
		System.out.print("\nDigite o valor do lado 1 do segundo triangulo: ");
		ret2.lado1 = ler.nextFloat();
		System.out.print("Digite o valor do lado 2 do segundo triangulo: ");
		ret2.lado2 = ler.nextFloat();
		System.out.printf("O perimetro do retangulo 2 eh: %.2f \n", ret2.calculePerimetro());
		System.out.printf("A Area do retangulo 2 eh: %.2f \n", ret2.calculeArea());

		// Retangulo 3
		System.out.print("\nDigite o valor do lado 1 do terceiro triangulo: ");
		ret3.lado1 = ler.nextFloat();
		System.out.print("Digite o valor do lado 2 do terceiro triangulo: ");
		ret3.lado2 = ler.nextFloat();
		System.out.printf("O perimetro do retangulo 3 eh: %.2f \n", ret3.calculePerimetro());
		System.out.printf("A Area do retangulo 3 eh: %.2f \n", ret3.calculeArea());
	}
}