package pong;

import jgame.ImageCache;
import jgame.controller.ControlScheme;
import jgame.controller.KeyboardLocationController;

public class Paddle extends jgame.GSprite {

	public Paddle () {
		
		super(ImageCache.forClass(Pong.class).get("paddle.png"));
		
		KeyboardLocationController klc = new KeyboardLocationController(ControlScheme.WASD, 10);
		addController(klc);
		klc.setHorizontalAllowed(false);
	}
}
