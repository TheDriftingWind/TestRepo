package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {
	
	Player player;
	MapDatabase Maps;
	//remember to initialize (Maps = new MapDatabase();) to not get nullpointer
	Tile[][] _currentMap;
//	Rectangle rect;
	
	public Play(int state){
		
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
//		rect = new Rectangle(40, 40, 400, 0)
		Maps = new MapDatabase();
		player = new Player("res/player/PlayerBoxBlack.png", 100, 100);
		player.setLocation(200, 300);
		Tile[][] currentMap;
		currentMap = Maps.getMap1();
		_currentMap = currentMap;
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		player.draw(player.getX(), player.getY());
		for (int i = 0; i < Maps.getMap1H(); i++){
			for (int j = 0; j < Maps.getMap1W(); j++){
				if (_currentMap[i][j] == null){
					break;
				}
				else{
				_currentMap[i][j].setLocation(j*100, i*100);
				_currentMap[i][j].draw(_currentMap[i][j].getX(), _currentMap[i][j].getY());
				}
			}
		}
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
