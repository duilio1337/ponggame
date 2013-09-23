package pong;

import java.util.List;

import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.controller.ConstantMovementController;
import jgame.listener.BoundaryRemovalListener;
import jgame.listener.HitTestListener;

public class Puck extends GSprite {
	
	private ConstantMovementController cmc;
	
	public Puck (){
		
		super(ImageCache.forClass(Pong.class).get("puck.png"));
		
		cmc = new ConstantMovementController(-5, 0);
		addController(cmc);
		
		addListener(new BoundaryRemovalListener());
		
		HitTestListener htl = new HitTestListener(Paddle.class) {
		    @Override
		    public void invoke(GObject target, Context context) {
		        flip();
		        
		        List<Paddle> paddlesHit = context.hitTestClass(Paddle.class);
		        Paddle paddle = paddlesHit.get(0);
		    }
		};
		
		addListener(htl);
		
		setPrimitive(PrimitiveShape.CIRCLE);
		
	}
	
	public void flip(){
		
		cmc.setVelocityX(-cmc.getVelocityX());
	}
}