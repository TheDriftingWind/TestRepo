package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame {

	public static final String gamename = "Eclipse";
	public static final int MAXFPS = 60;
	public static final int menu = 0;
	public static final int play = 1;

	public Game(String gamename) {
		super(gamename);
		this.addState(new Menu(menu));
		this.addState(new Play(play));

	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		this.enterState(menu);
	}

	public static void main(String[] args) {
		//declare a game container
		AppGameContainer appgc;
		try {
			//initialize
			appgc = new AppGameContainer(new Game(gamename));
			appgc.setDisplayMode(1200, 800, false);
			//cap frame rate to avoid overworking the GPU
			appgc.setTargetFrameRate(MAXFPS);
			appgc.setVSync(true);
			//run program
			appgc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
