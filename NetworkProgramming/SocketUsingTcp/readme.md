# Scoket Programming Using TCP

## 1. Introduction
Scoket is an interface for programming networks at the transport layer. Network communication using socket is very much similar to performing file I/O. Java programs can use TCP or UDP to communicate with other programs. TCP is a connection-oriented protocol, which means that the two communicating programs must first establish a connection before they can exchange data. UDP is a connectionless protocol, which means that the two communicating programs do not need to establish a connection before they can exchange data.

## 2. Steps for Writing a TCP Client Program
1. Open a Socket
```
Socket socket = new Socket("localhost", 8000);
```
2. Open an input stream and an output stream to the socket
```
Scanner ins = new Scanner(socket.getInputStream());
PrintWriter outs = new PrintWriter(socket.getOutputStream());
```
3. Read from and write to the socket
```
String line = ins.nextLine();
outs.println(line);
```
4. Close the socket
```
ins.close();
outs.close();
socket.close();
```
## 3. Steps for Writing a TCP Server Program
1. Create a ServerSocket
```
ServerSocket serverSocket = new ServerSocket(8000);
```
2. Accept the connection from client
```
Socket socket = serverSocket.accept();
```
3. Get input and output streams of the socket
```
Scanner ins = new Scanner(socket.getInputStream());
PrintWriter outs = new PrintWriter(socket.getOutputStream());
```
4. Read from and write to the socket
```
String line = ins.nextLine();
outs.println(line);
```
5. Close the socket
```
ins.close();
outs.close();
socket.close();
serverSocket.close();
```

## 4. Run the Example
1. Clone the repo and change directory to NetworkProgramming/SocketUsingTcp
```
cd NetworkProgramming/SocketUsingTcp
```
2. Compile the source code
```
javac *.java
```
3. Run the server
```
java Server
```
4. Run the client
```
java Client
```
5. Enter a string in the client and press enter. The server will echo the string back to the client.

