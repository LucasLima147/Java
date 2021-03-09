package projetosistemadeinformacao;

import contasAPagar.ContasAPagar;
import java.util.Scanner;
import sistemaInterno.Contador;
import sistemaInterno.Fatura;
import sistemaInterno.FornecedorDeCombustivel;

/**
 * Autor: Lucas Lima<br>
 * <p> Data: 03/06/2020</p>
 * <p> Esta é a classe que contém o MAIN e onde serão atribuidos os valores</p>
 */
public class ProjetoSistemaDeInformacao {

    /**
     * Autor: Lucas Lima<br>
    * <p> Data: 03/06/2020</p>
    * <p> Método Main as atribuições de valores </p>
     */
    public static void main(String[] args) {
        // instâncias
        Fatura fatura = new Fatura();
        FornecedorDeCombustivel fornecedor = new FornecedorDeCombustivel();
        Contador contador = new Contador();
        ContasAPagar contas = new ContasAPagar();
        Scanner scanner = new Scanner(System.in);
        
        //Atribuições da atividade
        System.out.print("Digite o salário do contador: ");
        contador.setSalario(scanner.nextDouble());
        System.out.print("Digite o custo do combustível: ");
        fornecedor.setValorCombustivel(scanner.nextDouble());
        System.out.print("Digite o nome do produto: ");
        fatura.setNomeDoProduto(scanner.next());
        System.out.print("Digite o preço unitário desse produto: ");
        fatura.setPrecoUnitario(scanner.nextDouble());
        System.out.print("Digite a quantidade desse produto: ");
        fatura.setQuantidadeDoProduto(scanner.nextInt());
        
        // contabilizando o total de despezas
        contas.totalizarDespesas(contador);
        contas.totalizarDespesas(fornecedor);
        contas.totalizarDespesas(fatura);
    }
    
}
