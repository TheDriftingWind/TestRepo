package javagame;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Tile extends Image{
	
	//Location
	int _X;
	int _Y;
	
	//Size
	int _SizeX;
	int _sizeY;

	public Tile(java.lang.String str) throws SlickException{
		super(str);
		
	}
	
}
