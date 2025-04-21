package secret;

// Tutorial / Prologue Section
// POV: Aya Shameimaru
// Covers Day 0.
public class episode_zero {

    // This method is called by default.
    // It will print the first section of Day 0.
    public static void start() {
        tools.prep();
        scene1();
        tools.spin();

        
    }

    // DAY 0 SCENE 1 ~ Aya is summoned to the Great Tengu. Momiji refuses to give up any more information.
    public static void scene1() {

        tools.linePrint("Date: 7/13/139 ~ 08:00\n");
        tools.linePrint("Transcript: Shameimaru Aya, Inubashiri Momiji\n");
        tools.linePrint("Location: Youkai Mountain ~ Tengu Village\n");
        tools.linePrint("\n"); // TODO: come up with a pun for Aya, Megumu, and Momiji.
        tools.spin();

        tools.linePrint("Momiji > Your presence has been requested by the Great Tengu Iizunamaru at 08:30.\n");
        tools.linePrint("\n");
        tools.linePrint("Aya > Ayayaya! \n");
        tools.linePrint("    > What is the meeting about? \n");
        tools.linePrint("\n");
        tools.linePrint("Momiji > I was ordered not to speak on such matters. \n");
        tools.linePrint("\n");
        tools.linePrint("Aya > You can give a hint, right? I don't like going into these meetings blind. \n");
        tools.linePrint("    > You never know what might happen these days. \n");
        tools.linePrint("\n");
        tools.linePrint("Momiji > Find someone else to bother for a story. \n");
        tools.linePrint("       > I've been strictly ordered not to leak information. \n");
        tools.linePrint("\n");
        tools.linePrint("Aya > Aren't we friends? \n");
        tools.linePrint("    > Surely you can afford to give a friend a hint. \n");
        tools.linePrint("\n");
        tools.linePrint("Momiji > I was strictly ordered not to leak information to Miss Shameimaru. \n");
        tools.linePrint("       > And we aren't friends. \n");
        tools.linePrint("\n");
        tools.linePrint("Aya > Fine. Tell Megumu that she wins this round. \n");
        tools.linePrint("    > And that I'll meet her at 8:30. \n");
        tools.linePrint("\n");
        tools.linePrint("Momiji > Understood. \n");
        tools.linePrint("\n");
    }

    public static void scene2() {

        tools.linePrint("Date: 7/13/139 ~ 08:00\n");
        tools.linePrint("Transcript: Shameimaru Aya, Iizunamaru Megumu\n");
        tools.linePrint("Location: Youkai Mountain ~ Iizunamaru's Office\n");
        tools.linePrint("\n"); // TODO: come up with a pun for Aya, Megumu, and Momiji.
        tools.linePrint("Aya > For what reason did you call me here today?\n");
        tools.linePrint("\n");
        tools.linePrint("Megumu > Didn't Miss Inubashiri tell you?");
        tools.spin();

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
