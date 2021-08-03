/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbuilder;

import cruds.CRUDHelados;
import java.util.LinkedList;
import pojos.Helado;

/**
 *
 * @author Oscar Dacto
 */
public class TestProductoBuilder {
    static  CRUDHelados crudHelados = new CRUDHelados();

    
    public static void main(String[] args) {
        
        listarHeladosBuilderSundae();
        listarHeladosBuilderCholao();
        listarHeladosBuilderPaila();
    }
    
    public static void listarHeladosBuilderSundae(){
        System.out.println("\nBUILDER HELADO SUNDAE !!!!!!!!!");
        
        LinkedList<Helado> listaHeladosSundae =  CRUDHelados.listarHeladosBuilder(1);
        for (int i = 0; i < listaHeladosSundae.size(); i++) {
            System.out.println("NAME: "+listaHeladosSundae.get(i).getName() + 
                    ",  PRICE: "+ listaHeladosSundae.get(i).getPrice());
        }
          
    }
    public static void listarHeladosBuilderCholao(){
        System.out.println("\nBUILDER CHOLAOOOS !!!!!!!!!");
        
        LinkedList<Helado> listarHeladosCholao =  CRUDHelados.listarHeladosBuilder(3);
        for (int i = 0; i < listarHeladosCholao.size(); i++) {
            System.out.println("NAME: "+listarHeladosCholao.get(i).getName() + 
                    ",  PRICE: "+ listarHeladosCholao.get(i).getPrice());
        }
    }
    
    public static void listarHeladosBuilderPaila(){
        System.out.println("\nBUILDER HELADO DE PAILA!!!!!!!!!");
        
        LinkedList<Helado> listarHeladosBuilderPaila =  CRUDHelados.listarHeladosBuilder(4);
        for (int i = 0; i < listarHeladosBuilderPaila.size(); i++) {
            System.out.println("NAME: "+listarHeladosBuilderPaila.get(i).getName() + 
                    ",  PRICE: "+ listarHeladosBuilderPaila.get(i).getPrice());
        }
    }

}
