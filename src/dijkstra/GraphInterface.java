package dijkstra;

import java.util.ArrayList;


/* Graphe */
public interface GraphInterface {
	
	/* renvoie la liste des arcs */
	public ArrayList<VertexInterface> getAllVertices() ;
	
	/* renvoie la liste de successeur */
	public ArrayList<VertexInterface> getSuccessors(VertexInterface vertex) ;
	
	/* renvoie le poid entre le sommet source et le sommet courant */
	public int getWeight(VertexInterface src,VertexInterface dst) ;
}
