package pong;

import jgame.GContainer;
import jgame.controller.ControlScheme;

public class PongGameView extends GContainer {
	
	public PongGameView () {
        setSize(640, 480);
        
        Paddle paddle = new Paddle(ControlScheme.WASD);
        add(paddle);
        
        paddle.setLocation(50, 480 / 2);
        
        Paddle paddle2 = new Paddle(ControlScheme.IJKL);
        add(paddle2);
        
        paddle2.setLocation(640-50, 480 / 2);
        
        Puck puck = new Puck();
        addAtCenter(puck);
        
    }
	
}