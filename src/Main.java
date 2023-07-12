import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws IOException {
  writeMethod();
    }

    public static void writeMethod() throws IOException {
        FileWriter fileWriter = new FileWriter("Alphabet.txt");
        FileReader fileReader = new FileReader("Alphabet.txt");
        fileWriter.write(
                "1. A a" + "\n" +
                        "2. B b" + "\n" +
                        "3. C c" + "\n" +
                        "4. D d" + "\n" +
                        "5. E e" + "\n" +
                        "6. F f" + "\n" +
                        "7. G g" + "\n" +
                        "8. H h" + "\n" +
                        "9. I i" + "\n" +
                        "10. J j" + "\n");
        fileWriter.close();

        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            fileReader.close();
        }
    }
}
