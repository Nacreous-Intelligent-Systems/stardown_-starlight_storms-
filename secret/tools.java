package secret;
import workspace.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.nio.file.StandardCopyOption.*;

// The wonderful magical land of library functions. Some of these are incredibly useful, and some of these are truly useless.
// I enjoyed writing these. Maybe.
public class tools {

    // Smaller numbers are easier to work with. It's the law!
    // Later defined as 25 * settings.textScrollSpeed
    static int sDelay;

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // This gave me hell last time. Don't re-do it.
    static void copyFile(Path source, Path dest) {
        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("Something went wrong. Does the file exist?");
            e.printStackTrace();
        }

    }

    // This only exists so I don't have to always be catching these exceptions.
    static void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Are you out of memory?");
            e.printStackTrace();
        }
    }

    static void prep() {
        tools.clearScreen();
        sDelay = (25 * settings.textScrollSpeed);
        tools.linePrint("Touhou Stardown ~ Starlight Storms \n \n", 10);
        tools.linePrint("Developed by Nacreous Intelligent Systems. \n", 10);
        tools.linePrint("Not endorsed or affiliated with ZUN or TEAM SHANGHAI ALICE. \n \n \n", 10);
        tools.linePrint("Girls are now coding, please wait warmly until they are ready.   ", 10);
        System.out.print("\b");
        tools.spin(10, sDelay);
        tools.clearScreen();
        tools.sleep(200);
    }

    

    // Text display method.
    // It prints each character one at a time
    // Inspired by [Insert Generic Visual Novel Here]
    static void linePrint(String text, int delay) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.substring(i, i + 1));
            tools.sleep(delay);
        }
        tools.sleep(delay * 4);
    }

    // Overloaded w/ settings.
    static void linePrint(String text) {
        linePrint(text, sDelay);
    }

    // This is a message to remind me to actually fill out the text.
    static void linePrint() {
        linePrint("???: Your text has been gapped away. It's mine now.");
        
    }

    // This was completely unnecessary. But it looks cool, so it was time well spent!
    // I will use this method at every opportunity.
    static void spin(int time, int delay) {
        System.out.print("[X]\b");
        for (int i = 0; i < time; i++) {
            System.out.print("\b-");
            tools.sleep(delay);
            System.out.print("\b\\");
            tools.sleep(delay);
            System.out.print("\b|");
            tools.sleep(delay);
            System.out.print("\b/");
            tools.sleep(delay);
        }
        System.out.print(" \b\b\b\b\b    \b\b\b\b");
        tools.sleep(delay * 4);
    }

    // Overloading default values.
    static void spin() {
        spin(10, sDelay);
    }

}
