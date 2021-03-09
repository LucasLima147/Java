package verificacaoLadostriangulo;
import java.util.Scanner;
import triangulo.Triangulo;

/**
 *
 * @author Lucas Lima
 */
public class VerificaLadosTriangulos {

    public static void main(String[] args) {
        //instancias
        Scanner lerTeclado = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
        
        // variaveis
        int lado1;
        int lado2;
        int lado3;
        String opcao;
        opcao = "s";
        
        while("s".equals(opcao)){
            // pegando os lados
            System.out.print("Lado 1 = ");
            lado1 = lerTeclado.nextInt();
            System.out.print("Lado 2 = ");
            lado2 = lerTeclado.nextInt();
            System.out.print("Lado 3 = ");
            lado3 = lerTeclado.nextInt();

            // setando os valores
            triangulo.setLado1(lado1);
            triangulo.setLado2(lado2);
            triangulo.setLado3(lado3);

            // verificando lados
            triangulo.verificaTriangulo();
            
            // continuar ou nao
            System.out.print("Deseja continuar (s/n): ");
            opcao = lerTeclado.next();
        }
    }
    
}
