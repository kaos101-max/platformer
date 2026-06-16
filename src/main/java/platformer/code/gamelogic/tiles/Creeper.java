package platformer.code.gamelogic.tiles;

import java.awt.image.BufferedImage;

import platformer.code.gameengine.hitbox.RectHitbox;
import platformer.code.gamelogic.GameResources;
import platformer.code.gamelogic.level.Level;

public class Creeper extends SolidTile{
    float shootInterval = 5;
    float secondsUntilShoot = shootInterval;
    public Creeper(float x, float y, int size, BufferedImage image, Level level) {
        super(x, y, size, image, level);
        //TODO Auto-generated constructor stub
    }   

    public void update(float tslf) {
		//shoot
        //spawn a new enemy
        //tell level to add it to enemies list
        //change it's image to whatever you want
        if(secondsUntilShoot <=0)
        {
            level.addEnemy(getX()-level.tileSize, getY()-level.tileSize);
            secondsUntilShoot = shootInterval;
        }
        else{
            secondsUntilShoot -= tslf;
        }
	//	this.image = GameResources.projectile;
	}
}
