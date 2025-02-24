package secret;

import java.io.IOException;
//import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class act1chapter1 {
    public static void start() throws IOException {
        Path source = Paths.get("secret/text/prologue.txt");
        Path dest = Paths.get("prologue.txt");
        tools.clearScreen();


        System.out.printf("Girls are now preparing...\n"); // touhou loading screen reference.
        tools.sleep(2000);
        tools.clearScreen();

        
        System.out.printf("[Insert Story Here]");


        //tools.copyFile(source, dest);

    }
}
