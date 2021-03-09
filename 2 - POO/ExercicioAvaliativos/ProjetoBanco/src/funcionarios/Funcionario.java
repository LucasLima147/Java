/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

/**
 *
 * Autor: Lucas Lima
 * <p> Data: 20/05/2020 <br>
 *  Está classe é uma classe pai para a classe presidente e gerente</p>
 */
public class Funcionario {
    // Atributos
    private String nome;
    private String cpf;
    private double salario;
    
    // SETTERS E GETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
