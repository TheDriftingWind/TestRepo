package javagame;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Player extends Image{

	int Xloc;
	int Yloc;
	
	/* Color Index:
	 * 0 = black
	 * 1 = white
	 */
	int Color;
	
	public Player(java.lang.String ref) throws SlickException{
		super(ref);
		Color = 0;
		Xloc = 20;
		Yloc = 600;
	}
	
	public void setColor(int i){
		Color = i;
	}
	
	public void setX(int x){
		Xloc = x;
	}
	
	public int getX(){
		return Xloc;
	}
	
	public void setY(int y){
		Yloc = y;
	}
	
	public int getY(){
		return Yloc;
	}
	
}
