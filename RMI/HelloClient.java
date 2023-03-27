import java.rmi.*;

public class HelloClient {
    public static void main(String args[]) throws Exception {
        // Look up the remote object and cast it to the interface
        Hello obj = (Hello) Naming.lookup("rmi://localhost:5000/HelloServer");
        // Call the remote method
        String response = obj.sayHello();
        System.out.println("response: " + response);

    }
}