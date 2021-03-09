/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;
/**
 *
 * @author lucas
 * <p>Data: 27/05/2020</p>
 * <p> Está classe terá os dados padrão de cada conta e suas filhas terãos os atributos específicos dela
 */
public abstract class Conta {
    
    private int numeroDaConta;
    private String titular;
    private double saldo;
    
    // Construtor Default
    public Conta() {
    }
    /**
     * Autor: Lucas Lima
     * <p>Data: 21/05/2020</p>
     * <p>Construtor que recebe os valores iniciais da classe</p> 
     */
    public Conta(int numeroDaConta, String titular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    // SETTERS E GETTERS
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * 
     * Autor: Lucas Lima
     * <p> Data: 27/05/2020</p>
     * <p>Método que verifica se o usuário tem saldo suficiente para sacar o valor desejado</p>
     */
    public boolean saque(double valor){
    boolean temSaldo = false;
    if(valor > this.saldo)
        temSaldo = false;
    else
    {
        temSaldo = true;
        this.saldo -= valor;
    }
    return temSaldo;
    }
    
    /**
     * 
     * Autor: Lucas Lima
     * <p> Data: 27/05/2020</p>
     * <p>Método para fazer o acrescimo no saldo na realização de um depósito</p>
     */
    public void deposite(double valor){
        this.saldo += valor;
    }
    
    /**
     * 
     * Autor: Lucas Lima
     * <p> Data: 27/05/2020</p>
     *<p>Método para realizar a transferência de uma conta para outra</p>
     */
    public void transferencia(double valor, Conta contaDestino){
        // retirando o valor da conta origem (que chamar o método)
        this.saque(valor);
        // tranferindo o valor para outra conta
        contaDestino.deposite(valor);
    }
}
