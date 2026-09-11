import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("students.txt");

            writer.write("Aubierge\n");
            writer.write("Flora\n");
            writer.write("Liam\n");

            writer.close();

            System.out.println("File written successfully.");

        } catch (IOException e) {

            System.out.println("An error occurred.");
        }
    }
}