import java.awt.Color;

/**
 * TODO: Write the SniperTower class.
 *
 * The SniperTower is a balanced, affordable tower suitable for any stage of the game.
 *
 * REQUIREMENTS:
 *  - Must extend Tower.
 *  - Constructor takes two parameters: int x, int y.
 *  - Call super() with: x, y, range = 100, damage = 10, cost = 50, cooldownMax = 15.
 *  - Override getColor() to return Color.BLUE.
 *  - Include a JavaDoc comment above the class and above each method.
 */
public class SniperTower extends Tower {

    // TODO: Write the constructor.
    public SniperTower(int x, int y){
        super(x, y, 250, 25, 100, 30);
    }

    // TODO: Override getColor() and return Color.BLUE.
    public Color getColor(){
        return Color.MAGENTA;
    }

}
