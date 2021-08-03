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
public class FacturaVentaDetal extends PrototipoFacturaHelado{
    private int cantidad;

    public FacturaVentaDetal(String marca, int codigoSerial,int cantidad) {
        super(marca, codigoSerial);
        this.cantidad = cantidad;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
