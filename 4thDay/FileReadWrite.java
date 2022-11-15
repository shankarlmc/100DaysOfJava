import java.io.FileWriter; // need to import first.

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("user_data.txt");
            myWriter.write("This File contains Test User.");
            myWriter.close();
            System.out.println("Write to file successful.");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}