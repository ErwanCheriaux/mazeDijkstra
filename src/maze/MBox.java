package maze;

import dijkstra.VertexInterface;

/* Classe m�re de toutes les cases */
public abstract class MBox implements VertexInterface{

	private int x;
	private int y;
	
	// constructeur avec position
	MBox(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// getter et setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// m�thodes abstraites
	public abstract char getLabel(); // renvoie la r�fer�nce de la case : A, D, E ou W
	
	// m�thodes
}
