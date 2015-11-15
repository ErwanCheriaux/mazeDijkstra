package dijkstra;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Previous implements PreviousInterface {

	Hashtable<VertexInterface, VertexInterface> arborescenceTree; // chemin parcouru

	@Override
	public void setValue(VertexInterface x, VertexInterface val) {

		arborescenceTree.put(x, val);
	}

	@Override
	public VertexInterface getValue(VertexInterface val) {

		return arborescenceTree.get(val);
	}

	@Override
	public ArrayList<VertexInterface> getShortestPathTo(VertexInterface x) {

		ArrayList<VertexInterface> shortestPat = null;

		for (Enumeration<VertexInterface> e = arborescenceTree.elements(); e.hasMoreElements();) {
			shortestPat.add(e.nextElement());
		}
		return shortestPat;
	}

}
