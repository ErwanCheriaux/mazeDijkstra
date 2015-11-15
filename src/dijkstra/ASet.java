package dijkstra;

import java.util.ArrayList;
import java.util.Set;

public class ASet implements ASetInterface{

	Set<VertexInterface> vertexList; // liste de sommets
	
	@Override
	public void add(VertexInterface x) {		
		
		vertexList.add(x);
	}

	@Override
	public boolean contains(VertexInterface x) {
		
		return vertexList.contains(x);
	}

}
