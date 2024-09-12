import java.io.*;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) throws FileNotFoundException {
        // File name specified
        try {
            File Obj = new File("test.txt");
            if (Obj.createNewFile()) {
                System.out.println("File created: "
                        + Obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
