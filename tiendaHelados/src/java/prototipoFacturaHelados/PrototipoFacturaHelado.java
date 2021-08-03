/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipoFacturaHelados;

/**
 *
 * @author ADMIN-SENA
 */
public abstract class PrototipoFacturaHelado implements Cloneable {

    private String marca;
    
    private int codigoSerial;

    public PrototipoFacturaHelado(String marca,int codigoSerial) {
        this.marca = marca;
        
        this.codigoSerial = codigoSerial;
    }

   
       
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

  
    public int getCodigoSerial() {
        return codigoSerial;
    }

    public void setCodigoSerial(int codigoSerial) {
        this.codigoSerial = codigoSerial;
    }
    
    
    
    
    
}
