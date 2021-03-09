package funcionarios;

/**
 *
 *Autor: Lucas Lima
 * <p> Data: 20/05/2020<br>
 *  Está classe estende da classe Funcionario e trata a validação de senha do gerente e os funcionários gerenciados</p> 
 */
public class Gerente extends Funcionario{
    // Atributos
    private int senha;
    private int numFuncionariosGerenciados;
    protected double PaticipacaoLucroAnual;
    
    // Construtor
    public Gerente() {
        this.senha = 0;
        this.numFuncionariosGerenciados = 0;
    }
    
    // SETTERS E GETTERS
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumFuncionariosGerenciados() {
        return numFuncionariosGerenciados;
    }
    public void setNumFuncionariosGerenciados(int numFuncionariosGerenciados) {
        this.numFuncionariosGerenciados = numFuncionariosGerenciados;
    }
    
    public void setPaticipacaoLucroAnual(double PaticipacaoLucroAnual) {
        this.PaticipacaoLucroAnual = PaticipacaoLucroAnual;
    }
    
    // Método
    public boolean autentica(int umaSenha){
        if(umaSenha == this.senha){
            System.out.println("Autenticado");
            return true;
        }else{
            System.out.println("Não Autenticado");
            return false;
        }
    }
}
