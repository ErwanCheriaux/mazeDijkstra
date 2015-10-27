package maze;

import dijkstra.VertexInterface;

/* Case pleine que l'on ne peut pas franchir */
public class WBox extends MBox {

	WBox(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getLabel() {
		return 'W';
	}

	@Override
	public void addArc(VertexInterface x, int cost) {
		// TODO Auto-generated method stub
		
	}
}
