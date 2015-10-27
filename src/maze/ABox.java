package maze;

import dijkstra.VertexInterface;

/* Case d'arrivée */
public class ABox extends MBox {

	ABox(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getLabel() {
		return 'A';
	}

	@Override
	public void addArc(VertexInterface x, int cost) {
		// TODO Auto-generated method stub
		
	}

}
