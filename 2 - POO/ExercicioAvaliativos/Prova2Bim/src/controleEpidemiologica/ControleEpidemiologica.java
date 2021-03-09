/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleEpidemiologica;
import trabalhador.Trabalhador;

/**
 *Autor: Lucas Lima
 * <p> Data: 17/06/2020</p>
 * <p>Classe para realizar a contagem de pessoas com suspeita de COVID-19</p>
 */
public class ControleEpidemiologica {
    // atributos
    private int numeroSuspeitos;
    private float temperatura;
    
    /**
    *Autor: Lucas Lima
    * <p> Data: 17/06/2020</p>
    * <p>Construtor com argumentos</p>
    */
    public ControleEpidemiologica(int numeroSuspeitos, float temperatura) {
        this.numeroSuspeitos = numeroSuspeitos;
        this.temperatura = temperatura;
    }
    
    // GETTERS e SETTERS
    public int getNumeroSuspeitos() {
        return numeroSuspeitos;
    }
    public float getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    
    
    /**
    *Autor: Lucas Lima
    * <p> Data: 17/06/2020</p>
    * <p>Método para atualizar a contagem de casos suspeitos de COVID-19</p>
    */
    public void atualize(Trabalhador trabalhador){
        if(trabalhador.isSuspeito() == true){
            this.numeroSuspeitos += 1;
        }
    }
}
