package projetobanco;

import funcionarios.Diretor;
import funcionarios.Gerente;

/**
 *
 * Autor: Lucas Lima
 * <p> Data: 20/05/2020<br>
 * Está classe contém o método Main e as ações com as outras classes</p>
 */
public class ProjetoBanco {

    
    public static void main(String[] args) {
        // Instâncias
        Gerente gerente = new Gerente();
        Diretor diretor = new Diretor();
        
        // atribuição de valores
        gerente.setNome("Lucas Lima");
        diretor.setPaticipacaoLucroAnual(1000);
        
        // apresentação
        System.out.println("Nome do gerente: " + gerente.getNome());
        System.out.println("Sua Participação Anual foi de: R$" + diretor.getLucroAnual());
    }
}
