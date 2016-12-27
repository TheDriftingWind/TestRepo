package javagame;

import org.newdawn.slick.SlickException;

public class MapDatabase {

	//store the map as a 2 dimensional array
	//render the whole thing at once
	Tile[][] _Map1;
	int _Map1H; //map height | always 6(0-5)
	int _Map1W; //map width
	
	//Tiles
	Tile b; //Black
	Tile w;	//White
	Tile r;	//Red
	Tile g;	//Gray|Ground
	
	public MapDatabase() throws SlickException{
		
		//Tiles
		b = new Tile("res/objects/BlackBox.png","black", 100, 100);
		w = new Tile("res/objects/WhiteBox.png","white", 100, 100);
		r = new Tile("res/objects/RedBox.png","red", 100, 100);
		g = new Tile("res/objects/GrayBox.png","gray", 100, 100);

		/*
		 * MOVE TO IT'S OWN CLASS (MAP.JAVA)
		 */
		_Map1H = 6;
		_Map1W = 3;
		_Map1 = new Tile[][]{
				{b,r,r}, //0
				{w,r,w}, //1
				{b,r,w}, //2
				{w,r,b}, //3
				{b,r,w}, //4
				{g,g,g}  //5
		};
		
		
	}
	
	public Tile[][] getMap1(){
		return _Map1;
	}
	
	public int getMap1H(){
		return _Map1H;
	}
	
	public int getMap1W(){
		return _Map1W;
	}
}
