import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
// import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class reto11 {
    public static void main(String[] args) {
        // File prueba = new File("prueba.txt");
        // System.out.println(prueba.getName());

        // Path path = Paths.get("prueba.txt");
        // 
        // String hola = "Hola java!";
        // try {
            // Files.writeString(path, hola, StandardOpenOption.APPEND);
        // } catch (IOException io) {
            // io.printStackTrace();
        // }

        Path path = Path.of("Aimar1109.txt");

        if (!Files.exists(path)) {
            try {
                path = Files.createFile(path);
                Files.writeString(path, "Aimar\n", StandardOpenOption.APPEND);
                Files.writeString(path, "18\n", StandardOpenOption.APPEND);
                Files.writeString(path, "Python", StandardOpenOption.APPEND);            
            } catch (IOException io) {
                io.getStackTrace();
            }
        }

        try (BufferedReader lector = new BufferedReader(new FileReader("Aimar1109.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException io) {
            io.getStackTrace();
        }

        try  {
            Files.delete(path);
        } catch (IOException io) {
            io.getStackTrace();
        }

    }
}