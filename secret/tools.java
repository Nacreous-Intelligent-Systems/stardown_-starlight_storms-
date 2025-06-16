package secret;

import workspace.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardCopyOption.*;

// The wonderful magical land of library functions. Some of these are incredibly useful, and some of these are truly useless.
// I enjoyed writing these. Maybe.
public class tools {

    // Smaller numbers are easier to work with. It's the law!
    // Later defined as 25 * settings.textScrollSpeed
    static int sDelay;


    // I will never debug this. Ever.
    static void characterIntro(String title, String blurb) {
        int lineLen;
        boolean titleLonger;
        if (title.length() > blurb.length()) {
            lineLen = title.length() + 2;
            titleLonger = true;
        } else {
            lineLen = blurb.length() + 2;
            titleLonger = false;
        }
        // Line 1 - nothing
        System.out.print("\n[");
        sleep();
        for (int i = 0; i < lineLen; i++) {
            System.out.print("~");
            sleep();
        }
        System.out.print("]\n");
        sleep(sDelay * 4);

        // Line 2 - name/title
        System.out.print("|");
        sleep();
        if (titleLonger) {
            linePrint(" " + title + " |\n");
        } else {
            for (int i = 0; i < blurb.length() - title.length(); i += 2) {
                System.out.print(" ");
                sleep();
            }
            // WHY IS THIS LOAD-BEARING
            // WHAT (i am outraged at this)
            System.out.print(" ");
            sleep();
            for (int i = 0; i < title.length(); i++) {
                System.out.print(title.substring(i, i + 1));
                sleep();
            }
            for (int i = -1; i < blurb.length() - title.length(); i += 2) {
                System.out.print(" ");
                sleep();
            }
            System.out.print("|\n");
        }
        // Line 3 - nothing
        System.out.print("|");
        sleep();
        for (int i = 0; i < lineLen; i++) {
            System.out.print(" ");
            sleep();
        }
        System.out.print("|\n");
        sleep(sDelay * 4);

        // Line 4 - blurb
        System.out.print("|");
        sleep();
        if (!titleLonger) {
            linePrint(" " + blurb + " |\n");
        } else {
            for (int i = 0; i < title.length() - blurb.length(); i += 2) {
                System.out.print(" ");
                sleep();
            }
            // WHY IS THIS LOAD-BEARING
            // WHAT (i am more outraged about this)
            System.out.print(" ");
            sleep();
            for (int i = 0; i < blurb.length(); i++) {
                System.out.print(blurb.substring(i, i + 1));
                sleep();
            }
            for (int i = -1; i < title.length() - blurb.length(); i += 2) {
                System.out.print(" ");
                sleep();
            }
            System.out.print("|\n");
            sleep(sDelay * 4);
        }

        // Line 5 - end
        System.out.print("[");
        sleep();
        for (int i = 0; i < lineLen; i++) {
            System.out.print("~");
            sleep();
        }
        System.out.print("]\n\n");
        sleep(sDelay * 4);
    }

    static void printStory(Path source) {
        List<String> text = new ArrayList<String>();

        // Attempts to copy all lines into a List.
        try {
            text = Files.readAllLines(source);
        } catch (IOException e) {
            System.out.println("Something went wrong. Have you checked on Lyra?");
            e.printStackTrace();
        }

        // Attempts to store all character names into an ArrayList.
        ArrayList<String> chlist = new ArrayList<String>();
        for (int i = 0; i < text.size(); i++) {
            String currentLine = text.get(i);

            int IDBreak = currentLine.indexOf("@");
            if (IDBreak == -1) {
                break;
            }

            int id = 0;
            try {
                id = Integer.parseInt(currentLine.substring(0, IDBreak));
            } catch (NumberFormatException e) {
                System.out.println("String and Integer have been reversed. Where's Seija?");
            }
            chlist.add(id, currentLine.substring(IDBreak + 1));
        }

        int llc = -1;
        for (int i = 0; i < text.size(); i++) {
            String currentLine = text.get(i);
            int IDBreak = currentLine.indexOf(">");
            if (IDBreak == -1) {
                continue;
            }

            int cc = -1;
            try {
                cc = Integer.parseInt(currentLine.substring(0, IDBreak));
            } catch (NumberFormatException e) {
                System.out.println("String and Integer have been reversed. Where's Seija?");
            }
            if (cc == -1) {
                System.out.println("how???????");
                return;
            }

            if (cc == llc) {
                for (int j = 0; j < chlist.get(llc).length(); j++) {
                    System.out.print(" ");
                    sleep();
                }
                System.out.print(" > ");
            } else {
                System.out.print("\n");
                linePrint(chlist.get(cc) + " > ");
                llc = cc;
            }
            linePrint(currentLine.substring(IDBreak + 1) + "\n");

        }
        return;
    }

    static List<String> scanLine(Path source) {
        List<String> text = new ArrayList<String>();
        try {

            text = Files.readAllLines(source);

        } catch (IOException e) {
            System.out.println("Something went wrong. Have you checked on Lyra?");
            e.printStackTrace();
        }
        return text;
    }

    static void printFile(Path source) {
        List<String> text = scanLine(source);
        for (int i = 0; i < text.size(); i++) {
            linePrint(text.get(i) + "\n");
        }
    }

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

    static void sleep() {
        sleep(sDelay);
    }

    static void prep() {
        tools.clearScreen();
        sDelay = (25 * settings.textScrollSpeed);
        tools.linePrint("Touhou Stardown ~ Starlight Storms \n \n", sDelay / 2);
        tools.linePrint("Developed by Nacreous Intelligent Systems. \n", sDelay / 2);
        tools.linePrint("Not endorsed or affiliated with ZUN or TEAM SHANGHAI ALICE. \n \n \n", sDelay / 2);
        tools.linePrint("Girls are now coding, please wait warmly until they are ready.   ", sDelay / 2);
        System.out.print("\b");
        tools.spin();
        tools.clearScreen();
        tools.sleep();
    }

    static void printHeader(String date, String time, String location) {
        tools.linePrint("Date: " + date + " ~ " + time + "\n");
        tools.linePrint("Location: " + location + "\n");
        tools.spin();
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

    static void conversationPrint() {

    }

    // Overloaded w/ settings.
    static void linePrint(String text) {
        linePrint(text, sDelay);
    }

    // This is a message to remind me to actually fill out the text.
    static void linePrint() {
        linePrint("??? > Your text has been gapped away. It's mine now.");

    }

    // This was completely unnecessary. But it looks cool, so it was time well
    // spent!
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
