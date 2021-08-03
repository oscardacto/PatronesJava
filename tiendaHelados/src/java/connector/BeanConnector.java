/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connector;

/**
 *
 * @author ADMIN-SENA
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

 

public class BeanConnector {
    private String driver;
    private String url;
    private String user;
    private String password;
    private Statement st;
    private Connection connect;

 

    public BeanConnector(){
    }
    
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        try{
            Class.forName(driver);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

 

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

 

    public void setUser(String user) {
        this.user = user;
    }

 

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Statement getSt() {
        return st;
    }
    public void setSt(Statement st) {
        this.st = st;
    }

 
    public Connection getConnect() {
        return connect;
    }

 

    public void setConnect(Connection connect) {
        this.connect = connect;
    }
    
    public void conectar(){
        try{
            connect = DriverManager.getConnection(url, user, password);
            st = connect.createStatement();
        }catch (SQLException e){
        }
    }
    
}
