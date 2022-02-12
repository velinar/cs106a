/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

// This project is a test for the extended karel library and loading of a world file from same directory
// as the .class file. The "worldfile" parameter is new to extended karel and exists to make it easy
// to tell Karel where the world file is located. You can specify a path, but all projects in this github
// are structured to deploy the world file to the same folder as the class file (the "out/production/<project>" folder)
public class CollectNewspaperKarel extends SuperKarel {
    public static void main(String[] args) {
        stanford.karel.Karel.main(new String[] { "worldfile=CollectNewspaperKarel.w" });
    }

	// You fill in this part
    public void run()
    {
        move();
        move();
    }
}
