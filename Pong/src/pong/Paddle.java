package pong;

import java.awt.Image;
import jgame.GSprite;
import jgame.ImageCache;

public class Paddle extends jgame.GSprite {

	public Paddle () {
		
		super(ImageCache.forClass(Pong.class).get("paddle.png"));
		
	}
}
