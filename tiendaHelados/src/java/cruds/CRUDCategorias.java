/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;

import connector.ConexionObjetos;
import java.sql.ResultSet;
import java.util.LinkedList;
import pojos.Category;


/**
 *
 * @author Oscar Dacto
 */
public class CRUDCategorias {
    private static ConexionObjetos conn;
    
    public CRUDCategorias(){
        try {
            conn = ConexionObjetos.getInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static LinkedList<Category> listarCategorias(){
        LinkedList<Category> listaCategorias = new LinkedList<>();
        try {
            //Resulset: Almacena la consulta
            //GetStatment: Consulta
            ResultSet rs = conn.getbConn().getSt().executeQuery("SELECT * FROM category");
            while (rs.next()) {                
                Category categoria = new Category();
                categoria.setId(rs.getInt("id"));
                categoria.setName(rs.getString("name"));
                listaCategorias.add(categoria);
            }
            rs.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaCategorias;
    }
}
