package maze;

import dijkstra.VertexInterface;

/* Case vide que l'on peut franchir */
public class EBox extends MBox {

	EBox(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getLabel() {
		return 'E';
	}

	@Override
	public void addArc(VertexInterface x, int cost) {
		// TODO Auto-generated method stub
		
	}
}
