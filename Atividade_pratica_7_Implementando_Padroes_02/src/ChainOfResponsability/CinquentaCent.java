/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsability;

/**
 *
 * @author diego
 */
public class CinquentaCent extends MoedaChain {

    public CinquentaCent() {
        super(IDMoedas.cinquentaCent);
    }

    @Override
    protected void efetuaPagamento() {
        System.out.println("Foi identificada uma moeda de 50 centavos");
    }
}
