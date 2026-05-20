import java.util.ArrayList;
import java.awt.Color;

/**
 * TODO: Write the Speedster class.
 *
 * The Speedster is the standard enemy type with balanced health and speed.
 *
 * REQUIREMENTS:
 *  - Must extend Enemy.
 *  - Constructor takes one parameter: ArrayList<Waypoint> path.
 *  - Call super() with: health = 50, speed = 2, goldReward = 10, path = path.
 *  - Override getColor() to return Color.RED.
 *  - Include a JavaDoc comment above the class and above each method.
 */
public class Speedster extends Enemy {

    // TODO: Write the constructor.
    public Speedster(ArrayList<Waypoint> path){
        super(25,4,15,path);
    }


    // TODO: Override getColor() and return Color.RED.
    public Color getColor(){
        return Color.ORANGE;
    }

}
