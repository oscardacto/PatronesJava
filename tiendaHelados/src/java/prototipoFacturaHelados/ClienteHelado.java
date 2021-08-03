/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipoFacturaHelados;

import java.util.ArrayList;

/**
 *
 * @author OSCAR DACTO
 */
public class ClienteHelado {
    public static void main(String[] args) throws CloneNotSupportedException {
        int capacidadLoteHelados = 10;
        PrototipoFacturaHelado prototipoDetal = new FacturaVentaDetal("Popsy",01,100);
        PrototipoFacturaHelado prototipoIVA = new FacturaVentaSinIVA("Bonice",02,1024);
        PrototipoFacturaHelado prototipoEvento = new FacturaVentaEventos("CremaHelado",02,"U Cooperativa");


        
        ArrayList listaHelados = new ArrayList();
        for (int i = 1; i < capacidadLoteHelados; i++) {
            //OPERACIONES PARA LA CLONACIÓN
            PrototipoFacturaHelado detal = (PrototipoFacturaHelado) prototipoDetal.clone();
            detal.setCodigoSerial(i*2);            
            System.out.println("Marca: "+detal.getMarca()+ "  Cod. : "+  detal.getCodigoSerial());
            
            PrototipoFacturaHelado iva = (PrototipoFacturaHelado) prototipoIVA.clone();
            iva.setCodigoSerial(i*3);
            System.out.println("Marca: "+iva.getMarca()+ "  Cod. : "+    iva.getCodigoSerial() );

            PrototipoFacturaHelado evento = (PrototipoFacturaHelado) prototipoEvento.clone();
            evento.setCodigoSerial(i*4);
            System.out.println("Marca: "+evento.getMarca()+ "  Cod. : "+    evento.getCodigoSerial() );
            
        }
    }
}
