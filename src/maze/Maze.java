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

	private char[][] boxes = new char[10][10];

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
				if (line.length() != n) // vérification du nombre de colonnes
					throw new MazeReadingException(fileName, cpt, "nombre de colonnes incorrecte");
				if (cpt > m) // vérification du nombre de lignes
					throw new MazeReadingException(fileName, cpt, "nombre de lignes trop élevé");

				for (int i = 0; i < line.length() - 1; i++) {
					boxes[cpt - 1][i] = line.charAt(i); // copie du fichier txt
														// dans le tableau boxes
					System.out.print(line.charAt(i)); // affichage du fichier
														// txt dans la console
				}
				System.out.println();

			}
			if (cpt < m) // vérification du nombre de lignes
				throw new MazeReadingException(fileName, cpt, "nombre de lignes trop faible");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} // le fichier txt est fermé quoi qu'il arrive
			catch (Exception e) {
			} // ne rien faire si le fichier n'a jamais été ouvert
		}
	}

	public final void saveToTextFile(String fileName) throws IOException {

		int m = 10; // nombre de lignes
		int n = 10; // nombre de colonnes
		FileWriter fr = null;

		try {

			fr = new FileWriter(fileName);
			for (int i = 0; i < m - 1; i++) {
				for (int j = 0; j < n - 1; j++) {
					fr.write(boxes[i][j]); // ecriture dans le fichier txt
				}
				fr.write("\r\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} // le fichier txt est fermé quoi qu'il arrive
			catch (Exception e) {
			} // ne rien faire si le fichier n'a jamais été ouvert
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

	public char[][] getBoxes() {
		return boxes;
	}

	public void setBoxes(char[][] boxes) {
		this.boxes = boxes;
	}

}
