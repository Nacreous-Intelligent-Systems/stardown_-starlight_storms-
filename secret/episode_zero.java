package secret;

import java.nio.file.Paths;



// Tutorial / Prologue Section
// POV: Aya Shameimaru
// Covers Day 0.
public class episode_zero {

    // This is the AF2025 class.
    // A sequence of dumb jokes packaged as a "story".
    // I apologize in advance.
    // Every section will have an edited "image" to "enjoy"
    public static void bonus_is() {
        tools.prep();
        // This is a lie. The misdirection of TH_IS is that it sounds like the fourth wall is being broken, but it was just pre-recorded.
        tools.printHeader("June 5th, 2025", "11:15", "International School ~ Room 301");
        tools.printStory(Paths.get("secret/bonus_is/intro.txt"));
        tools.characterIntro("Yakumo Yukari", "Rap God of Gensokyo"); // Reference to Lyrica's "TCFS"
        // Lies are over now.
        tools.printHeader("??/?/140", "00:20", "Hakurei Shrine ~ Stage");
        tools.printStory(Paths.get("secret/bonus_is/warmup.txt"));
    }

    // This method is called by default.
    // It will print the first section of Day 0.
    public static void start() {
        tools.prep();
        scene0();
        tools.spin();
        tools.characterIntro("Inubashiri Momiji", "Guard of the Waterfall");
        tools.spin();
        scene1();
        tools.characterIntro("Shameimaru Aya", "Reporter of Paradise");
        scene2();
        tools.characterIntro("Iizunamaru Megumu", "Great Tengu");
        scene3();
        tools.spin();

        
    }

    public static void scene0() {
        //In which Momiji is informed of the Tower.
        tools.printHeader("7/12/139", "??:??", "Youkai Mountain ~ ????");
        tools.printStory(Paths.get("secret/epzero/000.txt"));
    }
    // DAY 0 SCENE 1 ~ Aya is summoned to the Great Tengu. Momiji refuses to give up any more information.
    public static void scene1() {
        tools.printHeader("7/13/139" , "08:00",  "Youkai Mountain ~ Tengu Village");
        tools.printStory(Paths.get("secret/epzero/001.txt"));
    }

    public static void scene2() {
        tools.printHeader("7/13/139", "08:15", "Youkai Mountain ~ Iizunamaru's Office")
       ;
    }

    public static void scene3() {
        tools.printHeader("7/13/139", "08:49", "Youkai Mountain ~ ????");
    }
    public static void closedDoor() {
        // Unmodified Method
        ;
    }

    public static void openedDoor() {
        // A: Door doesn't open.
        // B: Door opens and POV doesn't risk it.
        end();
    }

    public static void end() {
        // Ending scene of Episode Zero - Aya leaves | Writes article in Suzunaan.
        ;
    }
}
