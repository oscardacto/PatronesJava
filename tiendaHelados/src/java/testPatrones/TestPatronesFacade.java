/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPatrones;

import java.util.LinkedList;
import patronfacade.FacadeHelados;
import patronfacade.HeladosFacade;

/**
 *
 * @author ADMIN-SENA
 */
public class TestPatronesFacade {
    
    static  FacadeHelados facadeHelados = new FacadeHelados();

    
    public static void main(String[] args) {
        
    listarHelados();
        
      
        
    }
    public static void listarHelados(){
        LinkedList<HeladosFacade> listaHeladosFacade = facadeHelados.generarHeladosFacade();
        for (int i = 0; i < listaHeladosFacade.size(); i++) {
            System.out.print ("\nID "+listaHeladosFacade.get(i).getId()+". NAME: "+ listaHeladosFacade.get(i).getNameHelado()+ 
                    ",  PRICE: "+ listaHeladosFacade.get(i).getPriceHelado()+
                    ",  DESCRIPTION: " + listaHeladosFacade.get(i).getDescriptionHelado()+ 
                    ",  CATEGORY: "+ listaHeladosFacade.get(i).getCategoryHelado());
            
        }
        System.out.println("");
    }
    
}
