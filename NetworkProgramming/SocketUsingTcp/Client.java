import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String args[]) throws IOException {
        // create a socket
        Socket client = new Socket("localhost", 1254);
        // get input and handle socket
        Scanner ins = new Scanner(client.getInputStream());
        PrintWriter outs = new PrintWriter(client.getOutputStream(), true);
        Scanner keyboard = new Scanner(System.in);
        String rmsg, smsg;
        do {

            rmsg = ins.nextLine();
            System.out.println("Server: " + rmsg);
            System.out.print("Client: ");
            smsg = keyboard.nextLine();
            outs.println(smsg);
            
        } while (rmsg.equals("bye") == false);
        ins.close();
        outs.close();
        client.close();
    }
}
