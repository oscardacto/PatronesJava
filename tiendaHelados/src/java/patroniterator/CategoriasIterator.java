/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroniterator;

import java.util.Iterator;
import java.util.LinkedList;
import pojos.Category;

/**
 *
 * @author Oscar Dacto
 */
public class CategoriasIterator implements Iterator<Category>{
    private LinkedList<Category> listaCategorias; 
    
    
    private int counter = 0;

    public CategoriasIterator (LinkedList<Category> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }
    
    public Category next() {
        return listaCategorias.get(counter++);

    }
    public boolean hasNext() { 
        if (counter < listaCategorias.size() && listaCategorias.get(counter) != null) {
        return true; } else {
        return false;
        }

    }
}
