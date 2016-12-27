package javagame;

public class Map {

	Tile[][] _map;
	int _height;
	int _width;
	
	public Map(int w, int h){
		_width = w;
		_height = h;
	}
	
	public void setMap(Tile[][] m){
		_map = m;
	}
}
