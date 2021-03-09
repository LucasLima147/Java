/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhador;

/**
 *Autor: Lucas Lima
 * <p> Data: 17/06/2020</p>
 * <p>Classe genérica ou SUPERCLASSE</p>
 */
public abstract class Trabalhador{
    // atributos
    private String nome;
    private int matricula;
    private String nomeFantasia;
    private boolean residente;
    private boolean suspeito;
    
    
    /**
    *Autor: Lucas Lima
    * <p> Data: 17/06/2020</p>
    * <p>Construtor Default</p>
    */
    public Trabalhador() {
        this.nome = "";
        this.matricula = 0;
        this.nomeFantasia = "";
        this.suspeito = false;
    }
    /**
    *Autor: Lucas Lima
    * <p> Data: 17/06/2020</p>
    * <p>Construtor com argumentos</p>
    */
    public Trabalhador(String nome, int matricula, String nomeFantasia) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeFantasia = nomeFantasia;
        this.suspeito = false;
    }

    // GETTERS e SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public boolean isResidente() {
        return residente;
    }
    public void setResidente(boolean residente) {
        this.residente = residente;
    }

    public boolean isSuspeito() {
        return suspeito;
    }
    public void setSuspeito(boolean suspeito) {
        this.suspeito = suspeito;
    }
    
}
