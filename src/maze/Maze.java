package maze;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import dijkstra.GraphInterface;
import dijkstra.VertexInterface;

public class Maze implements GraphInterface {

	private ArrayList<String> maze = new ArrayList<String>();

	public final void initFromTextFile(String fileName)
			throws FileNotFoundException, IOException, MazeReadingException {

		int m = 10; // nombre de lignes
		int n = 10; // nombre de colonnes
		int cpt = 0;
		String line;
		FileReader fr;
		BufferedReader br = null;

		try {

			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while (br.ready()) {
				cpt++;
				line = br.readLine();
				if (line.length() != n)
					throw new MazeReadingException(fileName, cpt,
							"nombre de colonnes incorrecte");
				maze.add(line); // copie du fichier txt dans une liste de string
			}
			if (cpt != m)
				throw new MazeReadingException(fileName, cpt,
						"nombre de lignes incorrecte");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			br.close(); // le fichier txt est fermé quoi qu'il arrive
		}

		for (String mz : maze)
			System.out.println(mz); // affichage du fichier txt dans la console
	}

	public final void saveToTextFile(String fileName) throws IOException {

		FileWriter fr = null;

		try {

			fr = new FileWriter(fileName);
			for (String mz : maze)
				fr.write(mz + "\r\n"); //ecriture ligne par ligne dans le fichier txt 

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fr.close();
		}
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
