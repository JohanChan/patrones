/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sigleton;

/**
 *
 * @author Johan Chan
 */
public class ConnectionSingleton {
    
    String host = "localhost";
    int puerto = 3306;
    String usuario = "root";
    String password = "";
    static ConnectionSingleton instancia;
    
    private ConnectionSingleton(){
        
    }
    
    public static ConnectionSingleton getConnectionSingleton(){
        if (instancia == null){
            instancia = new ConnectionSingleton();
        }
        return instancia;
    }
    
}
