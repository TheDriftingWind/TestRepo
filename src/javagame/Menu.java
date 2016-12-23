package javagame;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class Menu extends BasicGameState {
	
//	Mouse PlayerMouse;
	//PlayButton 571x215
	Image PlayButton;
	int PlayButtonX = 315;
	int PlayButtonY = 200;
	
	public Menu(int state){
		
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		PlayButton = new Image("res/menus/PlayButton.png");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		PlayButton.draw(PlayButtonX,PlayButtonY);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		int MouseX = Mouse.getX();
		int MouseY = Mouse.getY();
		//check to see if the mouse is over the play button
		if(MouseX >= PlayButtonX && MouseX <= PlayButtonX+517){
			if(800-MouseY >= PlayButtonY && 800-MouseY <= PlayButtonY +215){
				if(Mouse.isButtonDown(0)){
					//enter the playing state
					sbg.enterState(1);
				}
			}
		}
	}

	@Override
	public int getID() {
		return 0;
	}

}
