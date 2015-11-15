package dijkstra;

import java.util.Hashtable;

public class Pi implements PiInterface{

	Hashtable<VertexInterface, Integer> pcch;
	
	@Override
	public void set(VertexInterface x, int val) {
		
		pcch.put(x, Integer.valueOf(val));
	}

	@Override
	public int get(VertexInterface x) {

		return pcch.get(x);
	}

}
