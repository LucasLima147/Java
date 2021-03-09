package funcionarios;

/**
 *
 * Autor: Lucas Lima
 * <p> Data: 20/05/2020<br>
 * Esta classe é este da classe Gerente e trata do lucro anual de cada gerente</p>
 */
public class Diretor extends Gerente{
    // Atributo
    private double lucroAnual;

    public double getLucroAnual() {
        return lucroAnual;
    }
    
    // Método
    public void participacaoLucros(){
        double lucro = this.PaticipacaoLucroAnual * 0.07;
        this.lucroAnual = lucro;
    }
}
