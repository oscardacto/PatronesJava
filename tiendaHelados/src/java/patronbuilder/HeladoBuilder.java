/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbuilder;

import pojos.Helado;

/**
 *
 * @author Oscar Dacto
 */
public abstract class HeladoBuilder {
    protected Helado heladoB;
    
    public Helado getHeladoPatronBuilder(){
        return heladoB;
    }
     public void crearHeladoPatronBuilder(){
           heladoB = new Helado();
     }
    
    public abstract void construirHelado (  int id,String name, String description, int price, int category);
    
}
