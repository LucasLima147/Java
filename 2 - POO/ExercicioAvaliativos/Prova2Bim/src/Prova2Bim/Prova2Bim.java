/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova2Bim;

import controleEpidemiologica.ControleEpidemiologica;
import java.util.Scanner;
import trabalhador.Comerciante;
import trabalhador.Empresario;

/**
 *Autor: Lucas Lima
 * <p> Data: 17/06/2020</p>
 * <p> Classe Prova2Bim que é contem o método MAIN do sistema</p>
 */
public class Prova2Bim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instâncias
        Empresario emp1 = new Empresario();
        Comerciante com1 = new Comerciante();
        ControleEpidemiologica controle = new ControleEpidemiologica(0, 0.0f);
        Scanner teclado = new Scanner(System.in);
        
        emp1.setNome("Lucas 1");
        emp1.setMatricula(1);
        emp1.setNomeFantasia("Lucas Firma");
        controle.setTemperatura(37.6f);
        if(emp1.avalie(true, controle.getTemperatura())){
            emp1.setSuspeito(true);
        }
        controle.atualize(emp1);
        
        
        
        com1.setNome("Gaviao 1");
        com1.setMatricula(2);
        com1.setNomeFantasia("Gaviao Firma");
        controle.setTemperatura(38.8f);
        if(com1.avalie(true, controle.getTemperatura())){
            com1.setSuspeito(true);
        }
        controle.atualize(com1);
        
        
        Comerciante com2 = new Comerciante();
        System.out.print("Nome do Comerciante: ");
        com2.setNome(teclado.nextLine());
        teclado.nextLine();
        System.out.print("Matricula do Comerciante:  ");
        com2.setMatricula(teclado.nextInt());
        System.out.print("Nome de fantasia do Comerciante: ");
        com2.setNome(teclado.nextLine());
        teclado.nextLine();
        controle.setTemperatura(37.6f);
        if(com2.avalie(true, controle.getTemperatura())){
            com2.setSuspeito(true);
        }
        controle.atualize(com2);
        
        
        Empresario emp2 = new Empresario();
        System.out.print("Nome do Comerciante: ");
        emp2.setNome(teclado.nextLine());
        teclado.nextLine();
        System.out.print("Matricula do Comerciante:  ");
        emp2.setMatricula(teclado.nextInt());
        System.out.print("Nome de fantasia do Comerciante: ");
        emp2.setNome(teclado.nextLine());
        teclado.nextLine();
        controle.setTemperatura(39.6f);
        if(emp2.avalie(true, controle.getTemperatura())){
            emp2.setSuspeito(true);
        }
        controle.atualize(emp2);
        
        System.out.println("Numero de suspeitos: "+controle.getNumeroSuspeitos());
        
        
        
        
    }
    
}
