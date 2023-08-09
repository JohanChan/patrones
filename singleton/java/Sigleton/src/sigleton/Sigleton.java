package sigleton;


public class Sigleton {


    public static void main(String[] args) {
        ConnectionSingleton cnn = ConnectionSingleton.getConnectionSingleton();
        
        System.out.println(ConnectionSingleton.getConnectionSingleton().host);
    }
    
}
