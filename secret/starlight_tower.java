package secret;

// THIS STAYS IN SECRET AND IS NEVER COPIED!
public class starlight_tower {
    
    // Method used in 0.0 [Tutorial], [////]
    public static boolean openDoor(boolean status) {
        if (status) {
            episode_zero.openedDoor();
            return true;
        }
        
        episode_zero.closedDoor();
        return false;
    }

}
