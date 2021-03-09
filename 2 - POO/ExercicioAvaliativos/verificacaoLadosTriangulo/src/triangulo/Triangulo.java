
package triangulo;
/**
 *
 * @author Lucas Lima
 */

public class Triangulo {
    
    private int lado1;
    private int lado2;
    private int lado3;
    
    public Triangulo() {
    }
    
    public int getLado1() {
        return lado1;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    
    private boolean verificaLadosDoTringulo(){
        boolean verificacao;
        verificacao = false;
        
        if((this.lado1 < (this.lado2 + this.lado3)) & this.lado2 < (this.lado1 + this.lado3) & (this.lado3 < (this.lado1 + this.lado2))){
            verificacao = true;
        }
        
        return verificacao;
    }    
    
    public void verificaTriangulo(){
        if (this.verificaLadosDoTringulo() == true){
            System.out.println("Trata-se de triangulo");
        }else{
            System.out.println("Os lados entrados não formam um triangulo.");
        }
    }
    
}
