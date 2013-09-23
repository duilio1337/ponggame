package pong;

import jgame.GContainer;

public class PongGameView extends GContainer {
	
	public PongGameView () {
        setSize(640, 480);
        
        Paddle paddle = new Paddle();
        add(paddle);
        
        paddle.setLocation(50, 480 / 2);
        
        Puck puck = new Puck();
        addAtCenter(puck);
        
    }
	
}