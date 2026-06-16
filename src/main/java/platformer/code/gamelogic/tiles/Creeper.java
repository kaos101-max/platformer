package platformer.code.gamelogic.tiles;

import java.awt.image.BufferedImage;

import platformer.code.gameengine.hitbox.RectHitbox;
import platformer.code.gamelogic.GameResources;
import platformer.code.gamelogic.level.Level;

public class Creeper extends SolidTile{

    public Creeper(float x, float y, int size, BufferedImage image, Level level) {
        super(x, y, size, image, level);
        //TODO Auto-generated constructor stub
    }   

    public void update(float tslf) {
		//shoot
        //spawn a new enemy
        //tell level to add it to enemies list
        //change it's image to whatever you want
        this.hitbox = new RectHitbox(this, 10, 10, width - 10, height - 10);
		this.image = GameResources.projectile;
	}
}
