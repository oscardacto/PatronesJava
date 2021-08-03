/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbuilder;

/**
 *
 * @author Oscar Dacto
 */
public class BuilderHeldadoSundae extends HeladoBuilder{

    public  void construirHelado ( int id, String name, String description, int price, int category){
        heladoB.setId(id);
        heladoB.setName(name);
        heladoB.setDescription(description);
        heladoB.setPrice(price);
        heladoB.setCategory(1);
        
    }
    
}
