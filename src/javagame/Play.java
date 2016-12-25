package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {
	
	Player player;
	MapDatabase Maps;
	Tile[][] currentMap;
//	Rectangle rect;
	
	public Play(int state){
		
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
//		rect = new Rectangle(40, 40, 400, 0)
		player = new Player("res/player/PlayerBoxBlack.png", 100, 100);
		player.setLocation(200, 300);
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
//		player.draw(player.getX(), player.getY());
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
//		for (int i = 0; i <= 100; i++){
//			player.setX(player.getX() + 1);
//		}
	}

	@Override
	public int getID() {
		return 1;
	}

}
