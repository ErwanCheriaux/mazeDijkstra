package dijkstra;

import java.util.ArrayList;


/* Fonction p�re */
public interface PreviousInterface {

	/* modifie le sommet p�re */
	public void setValue(VertexInterface x, VertexInterface val);
	
	/* retourne le sommet p�re */
	public VertexInterface getValue(VertexInterface val);
	
	/* retourne le plus court chemin entre le p�re et le sommet de d�part */
	public ArrayList<VertexInterface> getShortestPathTo(VertexInterface x);
}
