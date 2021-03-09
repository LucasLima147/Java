package sistemaInterno;

/**
 * Autor: Lucas Lima.<br>
 * <p> Data: 03/06/2020</p>
 * <p> Classe FornecedorDeCombustivel que implementa a interfase Pagavel</p>
 */
public class FornecedorDeCombustivel implements Pagavel{
    // atributo
    private double valorCombustivel;
    
    /**
     * Autor: Lucas Lima<br>
     * <p> Data: 03/06/2020</p>
     * <p> Construtor com argumentos</p>
     */
    public FornecedorDeCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }
    /**
     * Autor: Lucas Lima<br>
     * <p> Data: 03/06/2020</p>
     * <p> Construtor default/p>
     */
    public FornecedorDeCombustivel() {
    }
    
    // SETTER E GETTER
    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }
    
    
    /**
     * Autor: Lucas Lima.<br>
     * <p> Data: 03/06/2020</p>
     * <p> Método da implementação da interface Pagavel</p>
     */
    public double pagar(){
        double valor = this.valorCombustivel;
        return valor;
    }
}
