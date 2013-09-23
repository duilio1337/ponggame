package pong;

import jgame.ImageCache;
import jgame.controller.ControlScheme;
import jgame.controller.KeyboardLocationController;

public class Paddle extends jgame.GSprite {

	public Paddle (ControlScheme cs) {
		
		super(ImageCache.forClass(Pong.class).get("paddle.png"));
		
		KeyboardLocationController klc = new KeyboardLocationController(cs, 10);
		addController(klc);
		klc.setHorizontalAllowed(false);
	}
}
