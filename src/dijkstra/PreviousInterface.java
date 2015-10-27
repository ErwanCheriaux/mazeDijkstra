package dijkstra;

import java.util.ArrayList;


/* Fonction père */
public interface PreviousInterface {

	/* modifie le sommet père */
	public void setValue(VertexInterface x, VertexInterface val);
	
	/* retourne le sommet père */
	public VertexInterface getValue(VertexInterface val);
	
	/* retourne le plus court chemin entre le père et le sommet de départ */
	public ArrayList<VertexInterface> getShortestPathTo(VertexInterface x);
}
