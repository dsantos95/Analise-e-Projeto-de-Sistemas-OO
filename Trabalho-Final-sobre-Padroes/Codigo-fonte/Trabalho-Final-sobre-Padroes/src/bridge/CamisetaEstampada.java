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

public class CamisetaEstampada extends Camiseta {
    
    public CamisetaEstampada(TamanhoCamiseta c) {
        super(c);
        preco = 25.0;
    }
    
    @Override
    public void exibe() {
        exibeCamiseta("Camiseta Estampada");
    }
    
}
