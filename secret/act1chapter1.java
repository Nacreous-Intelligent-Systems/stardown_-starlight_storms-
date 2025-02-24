package secret;

import java.io.IOException;
//import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class act1chapter1 {
    public static void start() throws IOException {
        Path source = Paths.get("secret/text/intro.txt");
        Path dest = Paths.get("intro.txt");
        tools.clearScreen();
        System.out.printf("");
        tools.copyFile(source, dest);

    }
}
