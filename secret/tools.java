package secret;

import java.io.IOException;
//import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.nio.file.PathMatcher;
import static java.nio.file.StandardCopyOption.*;


public class tools {
    static void clearScreen() {
        // Newlines are to force compatibility with clearing the screen.
        System.out.print("\n\n\n\n\nIf you are seeing this, scroll down!\n\n\n\n\n\n\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("\n\n\n\n\n\n\n\n");
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void copyFile(Path source, Path dest) {
        //PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.*");
        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    static void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static void beat() {
        sleep(2000);
    }

    static void prep() {
        tools.clearScreen();
        System.out.print("Girls are now preparing...\n"); // touhou project loading screen reference.
        tools.sleep(2000);
        tools.clearScreen();
    }

}
