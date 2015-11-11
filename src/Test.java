import java.io.FileNotFoundException;
import java.io.IOException;

import maze.Maze;
import maze.MazeReadingException;


public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Maze mz = new Maze();
		
		try {
			mz.initFromTextFile("data/Labyrinthe.txt");
		} catch (MazeReadingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
