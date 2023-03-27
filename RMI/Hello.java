import java.rmi.*;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    public String sayHello() throws RemoteException;
}