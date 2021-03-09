package sistemaInterno;

/**
 * Autor: Lucas Lima.<br>
 * <p> Data: 03/06/2020</p>
 * <p> Classe Fatura que especializa a classe MateriaPrima e implementa a interfase Pagavel</p>
 */
public class Fatura extends MateriaPrima implements Pagavel{
    // Atributos
    private int quantidadeDoProduto;
    private double precoUnitario;
    
    /**
     * Autor: Lucas Lima<br>
     * <p> Data: 03/06/2020</p>
     * <p> Construtor com argumentos</p>
     */
    public Fatura(int quantidadeDoProduto, double precoUnitario) {
        this.quantidadeDoProduto = quantidadeDoProduto;
        this.precoUnitario = precoUnitario;
    }
    /**
     * Autor: Lucas Lima<br>
     * <p> Data: 03/06/2020</p>
     * <p> Construtor Default</p>
     */
    public Fatura(){
    }
    
    // SETTERS E GETTERS
    public int getQuantidadeDoProduto() {
        return quantidadeDoProduto;
    }
    public void setQuantidadeDoProduto(int quantidadeDoProduto) {
        this.quantidadeDoProduto = quantidadeDoProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    /**
     * Autor: Lucas Lima.<br>
     * <p> Data: 03/06/2020</p>
     * <p> Método da implementação da interface Pagavel</p>
     */
    public double pagar() {
        double valor;
        valor = this.precoUnitario * this.quantidadeDoProduto;
        return valor;
    }
}
