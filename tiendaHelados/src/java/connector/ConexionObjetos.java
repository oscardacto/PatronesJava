/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connector;

import java.sql.ResultSet;

/**
 *
 * @author ADMIN-SENA
 */
public class ConexionObjetos {
    
    private BeanConnector bConn;
    
    //Autoreferenci SINGLETON
    private static ConexionObjetos cxObjects;
    
    public ConexionObjetos()
    {
        try {
            //
            bConn = new BeanConnector();
            bConn.setDriver("com.mysql.cj.jdbc.Driver");
            bConn.setUser("root");
            bConn.setPassword("root");
            bConn.setUrl("jdbc:mysql://localhost:3306/helados?serverTimezone=UTC");
            bConn.conectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static ConexionObjetos getInstance()
    {
        if(cxObjects == null)
        {
            cxObjects = new ConexionObjetos();
        }
        else{
            System.out.println("ERROR, ESTA TRATANDO DE INSTANCIAR UN OBJETO SINGLETON, QUE YA EXISTE");
        }
        return cxObjects;
    }
    
    @Override
    public ConexionObjetos clone() {
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException e) {
            //NOTIFICO RESTRICCIÓN
            System.out.println("ESTE OBJ NO SE PUEDE CLONAR, ES UNICO");
        }
        return null;
    }
            
            
    public BeanConnector getbConn()
    {
        return bConn;
    }
    
    
}
