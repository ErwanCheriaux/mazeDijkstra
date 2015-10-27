package dijkstra;

/* Fonction Pi :Donne la plus courte valuation entre le sommet de d�part et celui
 * entr� en argument en passant uniquement par des sommets appartenant � l'ensemble A
 */
public interface PiInterface {

	/* Modifie le resultat du sommet */
	public void set(VertexInterface x, int val);
	
	/* retourne la valeur du sommet */
	public int get(VertexInterface x);
}
