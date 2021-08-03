/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroniterator;

import connector.ConexionObjetos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import pojos.Category;

/**
 *
 * @author Oscar Dacto
 */
public class IteratorListaCategorias {
    private  LinkedList<Category> listaCategorias = new LinkedList<>();
    private int size = 0;
    private static ConexionObjetos conn;
    
    public IteratorListaCategorias() {
        try{
            conn = ConexionObjetos.getInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void add(int id) throws SQLException {
        Category categoria = new Category();
        categoria.setId(id);
        try {
            ResultSet rs = conn.getbConn().getSt().executeQuery("SELECT * FROM category WHERE "
                    + "id = '"  + categoria.getId() +"'");
            while (rs.next()) {
                categoria.setName(rs.getString("name"));
                listaCategorias.add(categoria);
                rs.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public CategoriasIterator iterator() {
        return new CategoriasIterator(listaCategorias);
    }
}
