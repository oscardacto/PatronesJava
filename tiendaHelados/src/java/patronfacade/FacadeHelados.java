/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfacade;

import connector.ConexionObjetos;
import cruds.CRUDCategorias;
import cruds.CRUDHelados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import pojos.Category;
import pojos.Helado;

/**
 *
 * @author Oscar Dacto
 */
public class FacadeHelados {
    private CRUDHelados crudHelados;
    private CRUDCategorias crudCategorias;
    private ConexionObjetos conn;
    
    public FacadeHelados(){
        crudHelados = new CRUDHelados();
        crudCategorias = new CRUDCategorias();
        conn = new ConexionObjetos();
    }
    
    //
    public LinkedList<HeladosFacade>  generarHeladosFacade(){
        LinkedList<HeladosFacade> listaHeladosCategoria = new LinkedList<>();
        LinkedList<Helado> listaHelados = CRUDHelados.listarHelados();
        LinkedList<Category> listaCategorias = CRUDCategorias.listarCategorias();
       
       /* try {
            //Resulset: Almacena la consulta
            //GetStatment: Consulta
            ResultSet rs = conn.getbConn().getSt().executeQuery("SELECT * FROM category");
            while (rs.next()) {                
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                listaCategorias.add(category);
            }
            rs.close();
            
        } catch (SQLException e) {
            
        }*/
        for (int i = 0; i < listaHelados.size(); i++) {
            for (int j = 0; j < listaCategorias.size(); j++) {
                if (listaHelados.get(i).getCategory() == listaCategorias.get(j).getId()) {
                    listaHelados.get(i).setCategoryName(listaCategorias.get(j).getName());
                    //System.out.println("ID_CATEGORIA: "+listaHelados.get(i).getCategory());
                    //System.out.println("NAME_CATEGORIA: "+listaCategorias.get(j).getName()+"\n");
                }
            }
            Helado h = listaHelados.get(i);
            HeladosFacade rf = new HeladosFacade(h.getId(), h.getName(), h.getDescription(), h.getPrice(), 
                    h.getCategoryName());
            listaHeladosCategoria.add(rf);
        }
        return listaHeladosCategoria;
    } 
    
    
}
