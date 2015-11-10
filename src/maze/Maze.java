package maze;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import dijkstra.GraphInterface;
import dijkstra.VertexInterface;

public class Maze implements GraphInterface{

	private ArrayList<String> maze = new ArrayList<String>();
	
	public final void initFromTextFile(String fileName) 
			throws FileNotFoundException, IOException {
				
		FileReader fr;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while(br.ready()) maze.add(br.readLine()); // copie du fichier txt dans une liste de string
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			br.close();
		}
		
		for(String mz : maze) System.out.println(mz); // affichage du fichier txt dans la console
	}
	
	@Override
	public ArrayList<VertexInterface> getAllVertices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<VertexInterface> getSuccessors(VertexInterface vertex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWeight(VertexInterface src, VertexInterface dst) {
		// TODO Auto-generated method stub
		return 0;
	}

}
