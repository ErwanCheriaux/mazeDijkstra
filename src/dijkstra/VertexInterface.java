package dijkstra;

/* Sommets */
public interface VertexInterface {

	//  Variables  //
	//liste des arcs partant de ce sommet
	//tailles de chaque arcs
	
	/* ajout d'un arc au sommet avec la taille de l'arc */
	public void addArc(VertexInterface x, int cost);
}
