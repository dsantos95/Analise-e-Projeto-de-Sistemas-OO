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
public class RefrigeranteFanta extends Refrigerante {
    
    public RefrigeranteFanta(TamanhoRefrigerante r) {
        super(r);
    }
    
    @Override
    public void exibe() {
        exibeRefrigerante("Fanta");
    }
    
}
