import java.io.File;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File f = new File("user_data.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error occured. " + e.getMessage());
        }
    }
}
