package projetoconta;

import contas.ContaCorrente;
import contas.ContaPoupanca;
import contas.Movimento;

/**
* Autor: Lucas Lima
* <p>Data: 27/05/2020</p>
* <p>Classe Main onde serão realizados os </p>
*/
public class ProjetoConta {

    /**
     * 
     * Autor: Lucas Lima
     * <p> Data 27/05/2020 </p>
     * <p> Este é o método MAIN onde estamos setando os valores das classes</p>
     */
    public static void main(String[] args) {
        // Intâncias
        ContaCorrente corrente = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();
        Movimento movimento =  new Movimento();
        
        //setando os valores da conta corrente
        corrente.setNumeroDaConta(100);
        corrente.setTitular("Fabio Silva");
        corrente.setSaldo(500.00);
        movimento.registraMovimento(corrente, true, corrente.getSaldo());
        
        //setando os valores da conta poupanca
        poupanca.setNumeroDaConta(200);
        poupanca.setTitular("Fabio Silva");
        poupanca.setSaldo(300.00);
        movimento.registraMovimento(poupanca, true, poupanca.getSaldo());
        
        //operacoes
        corrente.saque(100.00);
        movimento.registraMovimento(poupanca, false, 100.00);
        poupanca.saque(150.00);
        movimento.registraMovimento(poupanca, false, 150.00);
        System.out.println("Saque total do Titular "+poupanca.getTitular()+" é: "+movimento.getTotalDeSaldoDoCliente());
        corrente.deposite(20.00);
        movimento.registraMovimento(poupanca, true, 20.00);
        poupanca.deposite(80.00);
        movimento.registraMovimento(poupanca, true, 80.00);
        poupanca.deposite(130.00);
        movimento.registraMovimento(poupanca, true, 130.00);
        corrente.saque(30.00);
        movimento.registraMovimento(poupanca, false, 30.00);
        System.out.println("Saque total do Titular "+poupanca.getTitular()+" é: "+movimento.getTotalDeSaldoDoCliente());
        
        // depois de criar o método transfencia
        corrente.transferencia(65.00, corrente);
        movimento.registraMovimento(poupanca, false, 65.00);
        movimento.registraMovimento(corrente, true, 65.00);
        poupanca.transferencia(200.00, poupanca);
        movimento.registraMovimento(corrente, false, 200.00);
        movimento.registraMovimento(poupanca, true, 200.00);
        System.out.println("Saque total do Titular "+poupanca.getTitular()+" é: "+movimento.getTotalDeSaldoDoCliente());
        
    }
    
}
