/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPatrones;

import connector.ConexionObjetos;
import cruds.CRUDHelados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import pojos.Helado;

/**
 *
 * @author ADMIN-SENA
 */
public class TestPatrones {
    
    static  CRUDHelados crudHelados = new CRUDHelados();

    
    public static void main(String[] args) {
        
//        
//        try {
//            //IMPLEMENTANDO SINGLETON
//                ConexionObjetos co = ConexionObjetos.getInstance();
//            try (ResultSet rs = co.getbConn().getSt().executeQuery("SELECT * FROM helado")) {
//                while(rs.next()){
//                    System.out.println("name : "+rs.getString("name"));
//                }
//                rs.close();                
//                ConexionObjetos co2 = co.clone();                
//            }
//        } catch (SQLException e) {
//                e.printStackTrace();
//        }

//   Helado nuevoHelado = new Helado();
//        nuevoHelado.setName("Gosh");
//        nuevoHelado.setDescription("hielo picado sabor a magno");
//        nuevoHelado.setPrice(10000);
//        nuevoHelado.setCategory(3);
//        
//        crudHelados.insertarHelado(nuevoHelado);  
                  
//        listarHelados();
//        
//        
//        System.out.println("\n----ACTUALIZANDO HELADO-----");
//       
//        Helado heladoAct = new Helado();
//        heladoAct.setId(9);
//        heladoAct.setName("La Bruja 2");
//        heladoAct.setDescription("Dos mujeres hechizando gente");
//        heladoAct.setPrice(15000);
//        heladoAct.setCategory(2);
//        
//        crudHelados.modificarHelado(heladoAct);
//        listarHelados();
//
//        System.out.println("\n------BORRANDO HELADO-------");
//          
//        crudHelados.borrarHelado(2);
        
        
        listarHelados();
        
        
        
    }
    public static void listarHelados(){
         LinkedList<Helado> listaHelados = crudHelados.listarHelados();
        for (int i = 0; i < listaHelados.size(); i++) {
            System.out.print ("\nID "+listaHelados.get(i).getId()+". NAME: "+listaHelados.get(i).getName() + 
                    ",  PRICE: "+ listaHelados.get(i).getPrice());
//            Helado helado = listaHeladoss.get(i);
//            System.out.println("\n Description: "+helado.getDescription() + 
//                    "\n Category: "+helado.getCategoryName());
            System.out.print(",  DESCRIPTION: "+listaHelados.get(i).getDescription() + 
                    ",  CATEGORY: "+listaHelados.get(i).getCategoryName());
            
        }
        System.out.println("");
    }
    
}
