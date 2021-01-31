/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author diego
 */
public abstract class Camiseta {
    
    protected TamanhoCamiseta tamanho;
    
    public Camiseta(TamanhoCamiseta t) {
        tamanho = t;
    }

    public void exibeCamiseta(String titulo) {
	tamanho.exibeCamiseta(titulo);
    }

    public abstract void exibe();
}
