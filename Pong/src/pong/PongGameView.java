package pong;

import java.util.List;

import jgame.GContainer;
import jgame.GObject;
import jgame.controller.ControlScheme;
import jgame.listener.FrameListener;
import jgame.Context;



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
     
        FrameListener fl = new FrameListener() {

            @Override
            public void invoke(GObject target, Context context) {
                
                List<Puck> pucks = context.getInstancesOfClass(Puck.class);

                boolean noPucksLeft = pucks.isEmpty();
                
                if(noPucksLeft)
                	context.setCurrentGameView(Pong.Views.GAME_OVER);
            }
        };
        
        addListener(fl);
        
    }
	
}