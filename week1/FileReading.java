import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) {

        try {

            File file = new File("students.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String student = scanner.nextLine();

                System.out.println("Student: " + student);
            }

            scanner.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found.");
        }
    }
}