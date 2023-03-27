# Remote Method Invocation (RMI)
## Introduction
The RMI is an API that provides a mechanism to create distributed applications in Java. The RMI allows an object to invoke methods on an object running in another JVM. The object that runs in another JVM is called a remote object and the object that invokes the methods is called a client. The client and the remote object communicate using stubs and skeletons.

## RMI Architecture Layer
The RMI architecture is divided into three layers:
* Stub/Skeleton Layer : 

This layer is the interface between the application layer and rest of the RMI system. This layer is responsible for marshalling and unmarshalling the parameters and return values of the remote method calls. The stubs and skeletons are generated by the rmic tool.
A client side stub is responsible for:
- Initiating the call to the remote object.
- Marshalling the parameters of the remote method call.
- Informing the remote reference layer that the call should be invoked 
- Unmarshalling the return value of the remote method call.
- Informing the remote reference layer that the call has been completed.

A skeleton is responsible for:
- Unmarshalling the parameters of the remote method call.
- Making the up-call to the actual remote object implementation.
- Marshalling the return value of the call or an exception if the call fails.


## Creating and executing a RMI application
There are six steps to create and execute a RMI application:
1. Create an interface that extends the java.rmi.Remote interface.
```
import java.rmi.*;
public interface Hello extends Remote {
    public String sayHello() throws RemoteException;
}
```
2. Provide the implementation of the Remote Interface
```
import java.rmi.*;
import java.rmi.server.*;
public class HelloImpl extends UnicastRemoteObject implements Hello {
    public HelloImpl() throws RemoteException {
        super();
    }
    public String sayHello() {
        return "Hello, world!";
    }
}
```
3. Create the stub and skeleton objects using the rmic tool
```
rmic HelloImpl
```
4. Start the Registry Service by the rmiregistry tool
```
rmiregistry
# we don't need to specify the port number because it uses a default port number.
# or we can specify the port number as follows:
rmiregistry 5000
```
5. Create and run the server application
```
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
```
6. Create and run the client application
```
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
```

## Clone and run the RMI application
```
# after cloning the repository, go to the RMI directory
cd RMI
# compile the RMI application
javac *.java
# start the registry service
rmiregistry 5000
# run the server application
java HelloServer
# run the client application
java HelloClient
```


Note: This application is tested on Kali Linux 2023.1 and works fine.