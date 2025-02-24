package secret;

import java.nio.file.Path;
import java.nio.file.Paths;

public class act1chapter1 {
    public static void start(boolean finish) {
        if (finish) {
            sector1();
        }
        else {
            prologue();
        }
    }

    public static void sector1() {

    }

    public static void prologue() {

        Path source = Paths.get("secret/text/prologue.txt");
        Path dest = Paths.get("prologue.txt");
        tools.clearScreen();

        //loading + initialization


        System.out.printf("Girls are now preparing...\n"); // touhou project loading screen reference.
        tools.sleep(2000);
        tools.clearScreen();

        //story [prologue]

        //TODO: Check the profiles of Rinnosuke, Sumireko, & Nitori for their latest computer-y actions.
        System.out.printf("[Insert Story Here]\n");
        tools.beat();

        //move transcript
        //TODO: write this last bit too.
        System.out.printf("[Nitori]: [Mention recorded transcript and offer to send it]\n\n");
        tools.beat();
        tools.copyFile(source, dest);
        tools.beat();
        System.out.printf("[Nitori]: It should be visible in the file explorer.\n\n");
        tools.beat();
        System.out.printf("\tI've titled it 'prologue.txt'.\n\n");
        tools.beat();
        System.out.printf("\tTime to get to work.\n\n");
        tools.beat();

        //TODO: copy text into prologue.txt.

    }
}
