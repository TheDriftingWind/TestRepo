package javagame;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Tile extends Image{
	
	//Location
	int _X;
	int _Y;
	
	//Size
	int _sizeX;
	int _sizeY;

	public Tile(java.lang.String str, int w, int h) throws SlickException{
		super(str);
		_sizeX = w;
		_sizeY = h;
		
	}
	
	public void setLocation(int x, int y){
		_X = x;
		_Y = y;
	}
	
	public void setX(int x){
		_X = x;
	}
	
}
