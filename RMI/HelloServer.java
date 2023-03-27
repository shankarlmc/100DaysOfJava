import java.rmi.*;
import java.rmi.registry.*;

public class HelloServer {
    public static void main(String args[]) {
        
        try {
            // Create an object of the implementation class
            HelloImpl obj = new HelloImpl();
            // Bind this object instance to the name "HelloServer"
            Naming.rebind("rmi://localhost:5000/HelloServer", obj);
        } catch (Exception e) {
            System.out.println("HelloImpl err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}