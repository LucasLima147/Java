package sistemaInterno;

/**
 * Autor: Lucas Lima.<br>
 * <p> Data: 03/06/2020 (atributo, SETTE, GETTER e construtor criados nesse mesmo dia)</p>
 * <p> Classe empregado com os atributos básicos para ser especializado.</p>
 */
public abstract class MateriaPrima {
    private String nomeDoProduto;
    
    
    // Contrutores
    /**
     * Autor: Lucas Lima.<br>
     * <p> Construtor com argumentos da classe</p>
     */
    public MateriaPrima(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }
    /**
     * Autor: Lucas Lima<br>
     * <p> Construtor default</p>
     */
    public MateriaPrima() {
    }
    
    // SETTER E GETTER
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }
}
