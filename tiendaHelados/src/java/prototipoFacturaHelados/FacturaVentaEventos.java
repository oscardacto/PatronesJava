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
public class FacturaVentaEventos extends PrototipoFacturaHelado{
    private String lugar;

    public FacturaVentaEventos( String marca, int codigoSerial,String lugar) {
        super(marca, codigoSerial);
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

   

    
    
}
