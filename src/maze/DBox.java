package maze;

import dijkstra.VertexInterface;

/* Case de départ */
public class DBox extends MBox {

	DBox(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getLabel() {
		return 'D';
	}

	@Override
	public void addArc(VertexInterface x, int cost) {
		// TODO Auto-generated method stub
		
	}
}
