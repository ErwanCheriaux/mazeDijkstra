package dijkstra;

/* Ensemble A contenant les sommets du graphe*/
public interface ASetInterface{

	/* Ajout d'un sommet à l'ensemble A */
	public void add(VertexInterface x);
	
	/* Renvoie true si le sommet entrée en argument se trouve dans A, sinon renvoie false */
	public boolean contains(VertexInterface x);
}
