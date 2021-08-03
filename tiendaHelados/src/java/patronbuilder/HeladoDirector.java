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
public class HeladoDirector {
    //referencia a Builder
    private HeladoBuilder heladoBuilder;
    
    //Función para construir películas
    public  void buildHelado (int id, String name, String description, int price, int category){
        heladoBuilder.crearHeladoPatronBuilder();
        heladoBuilder.construirHelado(id, name, description, price, category);
    }

   //corazon del patron builder 
    public void setHeladoBuilder(HeladoBuilder heladoB) {
        heladoBuilder = heladoB;
    }
    
    //Retorno del producto complejo construido
    public Helado getHeladoBuilder() {
        return heladoBuilder.getHeladoPatronBuilder();
    }
}
