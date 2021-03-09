package sistemaInterno;


/**
 * Autor: Lucas Lima.<br>
 * <p> Data: 03/06/2020</p>
 * <p> Classe Contador que especializa a classe Empregado e implementa a interfase Pagavel</p>
 */
public class Contador extends Empregado implements Pagavel{
    /**
     * Autor: Lucas Lima.<br>
     * <p> Data: 03/06/2020</p>
     * <p> Método da implementação da interface Pagavel</p>
     */
    public double pagar(){
        return this.getSalario();
    }
}
