/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

/**
* Autor: Lucas Lima
* <p>Data: 27/05/2020</p>
* <p> Classe de Movimento para salvar o saldo total de cada tipo de conta </p>
*/
public class Movimento {
    private double totalDeSaldoDoCliente;

    public double getTotalDeSaldoDoCliente() {
        return totalDeSaldoDoCliente;
    }
    
    /**
    * 
    * Autor: Lucas Lima
    * <p> Data: 27/05/2020</p>
    * <p>Método para registrar cada movimento (saque/depósito) de cada conta</p>
    */
    public void registraMovimento(Conta conta, boolean soDeposito, double valor){
        if(soDeposito){
            this.totalDeSaldoDoCliente += valor;
        }else{
            this.totalDeSaldoDoCliente -= valor;
        }
    }
    
    
    
    
}
