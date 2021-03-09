/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhador;

/**
 *
 * @author lucas
 */
public class Empresario extends Trabalhador implements Suspeitavel{
    /**
    *Autor: Lucas Lima
    * <p> Data: 17/06/2020</p>
    * <p>Construtor Default</p>
    */
    public Empresario() {
        super();
    }
    
    /**
    *Autor: Lucas Lima
    * <p> Data: 17/06/2020</p>
    * <p>Construtor com argumentos</p>
    */
    public Empresario(String nome, int matricula, String nomeFantasia) {
        super(nome, matricula, nomeFantasia);
    }

    @Override
    public boolean avalie(boolean residente, float temperatura) {
        if((residente == true) && (temperatura > 37.5)){
            return true;
        }
        else{
            return false;
        }
    }
}
