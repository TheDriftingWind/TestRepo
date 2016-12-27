package javagame;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

public class Tile extends Image{
	
	//Name
	private String _name;
	//Location
	private int _X;
	private int _Y;
	//Size
	private int _width;
	private int _height;
	//hitBox
	private Rectangle _hitBox;

	public Tile(java.lang.String str, String name, int w, int h) throws SlickException{
		super(str);
		_width = w;
		_height = h;
		_X = 0;
		_Y = 0;
		_hitBox = new Rectangle(_X, _Y,w,h);
		
	}
	
	public String getTileName(){
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
	
	public int getTileWidth(){
		return _width;
	}
	
	public int getTileHeight(){
		return _height;
	}
	
	public Rectangle getHitBox(){
		return _hitBox;
	}
}
