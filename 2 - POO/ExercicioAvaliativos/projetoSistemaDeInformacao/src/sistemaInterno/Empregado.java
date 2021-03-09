package sistemaInterno;

/**
 * Autor: Lucas Lima.<br>
 * <p> Data: 03/06/2020 (atributos, SETTER, GETTERS e construtores criados nesse mesmo dia)</p>
 * <p> Classe empregado com os atributos básicos para ser especializado.</p>
 */
public abstract class Empregado {
    //Atributos
    private String primeiroNome;
    private String ultimoNome;
    private String cpf;
    private double salario;
    
    // Contrutores
    /**
     * Autor: Lucas Lima.<br>
     * <p> Construtor com argumentos da classe</p>
     */
    public Empregado(String primeiroNome, String ultimoNome, String cpf, double salario) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.cpf = cpf;
        this.salario = salario;
    }
    /**
     * Autor: Lucas Lima<br>
     * <p> Construtor default</p>
     */
    public Empregado() {
    }
    
    // SETTERS E GETTERS
    public String getPrimeiroNome() {
        return primeiroNome;
    }
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
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
