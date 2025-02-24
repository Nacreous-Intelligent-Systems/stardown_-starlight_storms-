package secret;

import java.nio.file.Path;
import java.nio.file.Paths;

public class episode_zero {

    //Intro method. Clear if finish == true.
    public static void start(boolean finish) {
        if (!finish) {
            //finish == false; likely just started up the problem. section fail.
            prologue();
        } else {
            //finish == true; section clear! (+1)
            section1();
        }
    }

    //Overloaded method!! Clear if two values of "true" are passed into the method.
    public static void start(boolean finish, boolean reset) {
        if (!(finish && reset)) {
            //either finish or reset is false (likely reset). section fail.
            section1bonus();
        } else {
            //finish == reset == true; section clear! (+1)
            section2();
        }
    }

    private static void section2() {
        System.out.print("Not done yet! (Anyways, how'd you even get here?????)");
        //Continue!
    }

    private static void section1bonus() {
        System.out.print("Not done yet!");
        //Change "reset" to true!
    }

    public static void section1() {
        System.out.print("Not done yet!");
        //Use variable "reset" to overload the method
    }

    public static void prologue() {

        Path source = Paths.get("secret/text/prologue.txt");
        Path dest = Paths.get("prologue.txt");
        tools.clearScreen();

        //loading + initialization


        System.out.print("Girls are now preparing...\n"); // touhou project loading screen reference.
        tools.sleep(2000);
        tools.clearScreen();

        //story [prologue]

        //TODO: Check the profiles of Rinnosuke, Sumireko, & Nitori for their latest computer-y actions.
        System.out.print("[Insert Story Here]\n");
        tools.beat();

        //move transcript
        //TODO: write this last bit too.
        System.out.print("[Nitori]: [Mention recorded transcript and offer to send it]\n\n");
        tools.beat();
        tools.copyFile(source, dest);
        tools.beat();
        System.out.print("[Nitori]: It should be visible in the file explorer.\n\n");
        tools.beat();
        System.out.print("\tI've titled it 'prologue.txt'.\n\n");
        tools.beat();
        System.out.print("\tTime to get to work.\n\n");
        tools.beat();

        //TODO: copy text into prologue.txt.

    }
}
