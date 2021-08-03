/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfacade;

/**
 *
 * @author Oscar Dacto
 */
public class HeladosFacade {
    //Fachada con informacion para el cliente
    private int id;
    private String nameHelado;
    private String descriptionHelado;
    private int priceHelado;
    private String categoryHelado;

    public HeladosFacade(int id, String nameHelado, String descriptionHelado, int priceHelado, String categoryHelado) {
        this.id = id;
        this.nameHelado = nameHelado;
        this.descriptionHelado = descriptionHelado;
        this.priceHelado = priceHelado;
        this.categoryHelado = categoryHelado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameHelado() {
        return nameHelado;
    }

    public void setNameHelado(String nameHelado) {
        this.nameHelado = nameHelado;
    }

    public String getDescriptionHelado() {
        return descriptionHelado;
    }

    public void setDescriptionHelado(String descriptionHelado) {
        this.descriptionHelado = descriptionHelado;
    }

    public int getPriceHelado() {
        return priceHelado;
    }

    public void setPriceHelado(int priceHelado) {
        this.priceHelado = priceHelado;
    }

    public String getCategoryHelado() {
        return categoryHelado;
    }

    public void setCategoryHelado(String categoryHelado) {
        this.categoryHelado = categoryHelado;
    }

    
}
