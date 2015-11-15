package dijkstra;

/* Ensemble A contenant les sommets du graphe*/
public interface ASetInterface{

	/* Ajout d'un sommet � l'ensemble A */
	public void add(VertexInterface x);
	
	/* Renvoie true si le sommet entr�e en argument se trouve dans A, sinon renvoie false */
	public boolean contains(VertexInterface x);
}
