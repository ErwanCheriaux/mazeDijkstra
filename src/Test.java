import java.io.FileNotFoundException;
import java.io.IOException;

import maze.Maze;


public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Maze mz = new Maze();
		
		mz.initFromTextFile("data/Labyrinthe.txt");

	}

}
