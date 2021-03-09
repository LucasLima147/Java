package contasAPagar;

import sistemaInterno.Pagavel;

/**
 * Autor: Lucas Lima.<br>
 * <p> Data: 03/06/2020</p>
 * <p> Classe Fatura que especializa a classe MateriaPrima e implementa a interfase Pagavel</p>
 */
public class ContasAPagar {
    // atributo para contabilizar o total de despezas
    private double valorTotalDeDespesas;
    
    /**
     * Autor: Lucas Lima<br>
     * <p> Data: 03/06/2020</p>
     * <p> Este é o método Polimórfico que somará todos os custos e mostrará o custo total</p>
     */
    public void totalizarDespesas(Pagavel pagavel){
        // somando as despesas
        this.valorTotalDeDespesas += pagavel.pagar();
        // apresentando o total de despesas
        System.out.println("O valor total até agora a pagar é: " + this.valorTotalDeDespesas);
    }
}
