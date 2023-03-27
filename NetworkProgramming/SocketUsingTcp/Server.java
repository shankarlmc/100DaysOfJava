import java.net.*;
import java.util.*;
import java.io.*;

public class Server {
    public static void main(String args[]) throws IOException {
        ServerSocket ss = new ServerSocket(1254);
        Socket client = ss.accept();
        Scanner ins = new Scanner(client.getInputStream());
        PrintWriter outs = new PrintWriter(client.getOutputStream(), true);
        Scanner keyboard = new Scanner(System.in);
        String rmsg, smsg;
        do {
            System.out.print("Server:");
            rmsg = keyboard.nextLine();
            outs.println(rmsg);
            smsg = ins.nextLine();
            System.out.println("Client: " + smsg);
        } while (smsg.equals("bye") == false);
        outs.close();
        ins.close();
        client.close();
        ss.close();
    }
}
