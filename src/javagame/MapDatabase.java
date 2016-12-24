package javagame;

import org.newdawn.slick.SlickException;

public class MapDatabase {

	//store the map as a 2 dimensional array
	//render the whole thing at once
	Tile[][] Map1;
	
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

		Tile[][] Map1 = {
				{b,b,b,b,b,b},
				{b,b,b,b,b,b},
				{b,b,b,b,b,b},
				{b,b,b,b,b,b},
				{b,b,b,b,b,b},
				{g,g,g,g,g,g}
		};
		
		
	}
}
