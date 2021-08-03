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
public class FacturaVentaSinIVA extends PrototipoFacturaHelado{
    private int iva;

    public FacturaVentaSinIVA( String marca, int codigoSerial, int iva) {
        super(marca, codigoSerial);
        this.iva = iva;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

        
    
}
