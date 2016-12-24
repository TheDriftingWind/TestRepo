package javagame;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Tile extends Image{
	
	//Name
	String _name;
	//Location
	int _X;
	int _Y;
	//Size
	int _sizeX;
	int _sizeY;

	public Tile(java.lang.String str, String name, int w, int h) throws SlickException{
		super(str);
		_sizeX = w;
		_sizeY = h;
		
	}
	
	public String getName(){
		return _name;
	}
	
	public void setLocation(int x, int y){
		_X = x;
		_Y = y;
	}
	
	public void setX(int x){
		_X = x;
	}
	
	public void setY(int y){
		_Y = y;
	}
	
	public int getX(){
		return _X;
	}
	
	public int getY(){
		return _Y;
	}
}
