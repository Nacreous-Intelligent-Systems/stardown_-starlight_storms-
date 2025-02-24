package secret;

import java.io.IOException;
//import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.nio.file.PathMatcher;
import static java.nio.file.StandardCopyOption.*;


public class tools {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void copyFile(Path source, Path dest) throws IOException {
        //PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.*");
            Files.copy(source, dest, REPLACE_EXISTING);
        
    }

}
