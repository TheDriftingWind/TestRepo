package javagame;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

public class Player extends Image{

	//Location
	int _Xloc;
	int _Yloc;
	//Size
	int _width;
	int _height;
	//HitBox
	Rectangle _hitBox;
	
	/* Color Index:
	 * 0 = black
	 * 1 = white
	 */
	int Color;
	
	public Player(java.lang.String ref, int w, int h) throws SlickException{
		super(ref);
		_width = w;
		_height = h;
		Color = 0;
		_Xloc = 20;
		_Yloc = 600;
		_hitBox = new Rectangle(_Xloc, _Yloc, _width, _height);
	}
	
	public void setColor(int i){
		Color = i;
	}
	
	public void setLocation(int x, int y){
		_Xloc = x;
		_Yloc = y;
	}
	
	public void setX(int x){
		_Xloc = x;
	}
	
	public int getX(){
		return _Xloc;
	}
	
	public void setY(int y){
		_Yloc = y;
	}
	
	public int getY(){
		return _Yloc;
	}
	
	public void setSize(int w, int h){
		_width = w;
		_height = h;
	}
	
	public int getPlayerWidth(){
		return _width;
	}
	
	public int getPlayerHeight(){
		return _height;
	}
}
