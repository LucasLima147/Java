/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

/**
* Autor: Lucas Lima
* <p>Data: 27/05/2020</p>
* <p> Classe de conta corrente, herdando so atributos da classe conta e 
* reescrevendo o método saque() da classe mãe</p>
*/
public class ContaCorrente extends Conta{
    private double limiteCreditoEspecial;
    
    // SETTER E GETTER
    public double getLimiteCreditoEspecial() {
        return limiteCreditoEspecial;
    }
    public void setLimiteCreditoEspecial(double limiteCreditoEspecial) {
        this.limiteCreditoEspecial = limiteCreditoEspecial;
    }
    
    /**
     * 
     * Autor: Lucas Lima
     * <p> Data: 27/05/2020<br>
     * Método que verifica se o usuário tem saldo suficiente para sacar o valor desejado</p>
     */
    @Override
    public boolean saque(double valor){
    boolean temSaldo = false;
    if(valor > (this.getSaldo()+this.limiteCreditoEspecial))
        temSaldo = false;
    else{
        temSaldo = true;
        if(valor-this.getSaldo() > 0){
            this.setLimiteCreditoEspecial(valor-this.getSaldo());
            this.setSaldo(0.0);
        }
        else{
            this.setSaldo(this.getSaldo()-valor);
        }
    }
    return temSaldo;
    } 
}
