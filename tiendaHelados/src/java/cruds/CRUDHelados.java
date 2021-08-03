/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import connector.ConexionObjetos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import patronbuilder.BuilderHeldadoSundae;
import patronbuilder.BuilderHeladoCholao;
import patronbuilder.BuilderHeladoPaila;
import patronbuilder.HeladoDirector;
import pojos.Helado;

/**
 *
 * @author ADMIN-SENA
 */
public class CRUDHelados {
    
    private static ConexionObjetos conn;
    
    public CRUDHelados(){
        try {
            conn = ConexionObjetos.getInstance();
        } catch (Exception e) {
        }
    }
    
    public static LinkedList<Helado> listarHelados(){
        LinkedList<Helado> listaHelados = new LinkedList<>();
        try {
            try ( //Resulset: Almacena la consulta
            //GetStatment: Consulta
                
                ResultSet rs = conn.getbConn().getSt().executeQuery("SELECT * FROM helado, category WHERE helado.category = category.id")) {
                while (rs.next()) {
                    Helado helado = new Helado();
                    helado.setId(rs.getInt("id"));
                    helado.setName(rs.getString("name"));
                    helado.setDescription(rs.getString("description"));
                    helado.setPrice(rs.getInt("price"));
                    helado.setCategory(rs.getInt("category"));                    
                    helado.setCategoryName(rs.getString("category.name"));
                    listaHelados.add(helado);
                }
            }
            
        } catch (SQLException e) {
        }
        return listaHelados;
    }
    
     //Implementando patrón BUILDER
    public static LinkedList<Helado> listarHeladosBuilder(int categoryB){
        //Listas de las categorias para BUILDER EN CONCRETO
        LinkedList<Helado> listaHeladosSundae = new LinkedList<>();
        LinkedList<Helado> listaHeladosCholao = new LinkedList<>();
        LinkedList<Helado> listaHeladosPaila = new LinkedList<>();
        
        //DIRECTOR PATRON BUILDER
        HeladoDirector hd = new HeladoDirector();
        
        try {
            //Resulset: Almacena la consulta
            //GetStatment: Consulta
            ResultSet rs = conn.getbConn().getSt().executeQuery("SELECT * FROM helado WHERE category = " + categoryB);
            
            while (rs.next()) {                
              
                switch (categoryB) {
                    case 1:
                        hd.setHeladoBuilder(new BuilderHeldadoSundae());
                        hd.buildHelado(rs.getInt("id"),rs.getString("name"),rs.getString("description"),rs.getInt("price"), categoryB);
                        listaHeladosSundae.add(hd.getHeladoBuilder());
                        break;
                    case 3:
                        hd.setHeladoBuilder(new BuilderHeladoCholao());
                        hd.buildHelado(rs.getInt("id"),rs.getString("name"),rs.getString("description"),rs.getInt("price"), categoryB);
                        listaHeladosCholao.add(hd.getHeladoBuilder());
                        break;
                    case 4:
                        hd.setHeladoBuilder(new BuilderHeladoPaila());   
                        hd.buildHelado(rs.getInt("id"),rs.getString("name"),rs.getString("description"),rs.getInt("price"), categoryB);
                        listaHeladosPaila.add(hd.getHeladoBuilder());
                        break;
                    default:
                        break;
                }
            }
           
            rs.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        switch (categoryB) {
            case 1:
                return listaHeladosSundae;
            case 3:
                return listaHeladosCholao;
            case 4:
                return listaHeladosPaila;
            default:
                break;
        }
        return null;
    }
    
    
    public void insertarHelado (Helado helado){
        String name = helado.getName();
        String description = helado.getDescription();
        int price = helado.getPrice();
        int category = helado.getCategory();
        System.out.println("----INSERTANDO NUEVO HELADO-----("+name+")");

        try {
            conn.getbConn().getSt().executeUpdate("INSERT INTO helado(name, description, price, category)" + 
                        "values ('"+ name + "', '" + description + "', '"+ price+ "', '"+ category + "')");
        } catch (SQLException e) {
        }
        
    }
    
    public void modificarHelado (Helado helado){
        int id = helado.getId();
        String name = helado.getName();
        String description = helado.getDescription();
        int price = helado.getPrice();
        int category = helado.getCategory();
        
        try {
            conn.getbConn().getSt().executeUpdate("UPDATE helado SET name='" +name 
                    + "', description='"+ description 
                    + "', price='"+ price
                    + "', category= '"+ category 
                    + "' WHERE id = "+ id);
        } catch (SQLException e) {
        }
    }
    
        public void borrarHelado (int id){
            try {
            conn.getbConn().getSt().executeUpdate("DELETE FROM helado WHERE id = "+ id);
        } catch (SQLException e) {
        }
        }

    
}
