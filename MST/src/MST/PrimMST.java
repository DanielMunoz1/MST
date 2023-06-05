package MST;

import java.util.Iterator;


import java.util.PriorityQueue;

public class PrimMST {

    public static Graph Prim(Graph g, int sourceV) {
    	Graph mst = new Graph(g.numberOfVertices());
    	
    	boolean[] marked = new boolean[g.numberOfVertices()];
    	PriorityQueue<Edge> edges = new PriorityQueue<Edge>();
    	Iterator<Edge> it = g.AdjacentV(sourceV).iterator();
    	
    	while (it.hasNext()) {
    		edges.add(it.next());
    	}
    	marked[sourceV] = true;

    	// loop until no edges remain
    	while (!edges.isEmpty()) {
    		Edge e = edges.remove();

    		// if adding makes no circle
    		if (!marked[e.getEndPoint()]) {
    			mst.pushEdge(e);
    			marked[e.getEndPoint()] = true;

    			// add neighbour edges of vertex if don't marked yet
    			Iterator<Edge> i = g.AdjacentV(e.getEndPoint()).iterator();
    			while (i.hasNext()) {
    				edges.add(i.next());
    			}
    			marked[e.getEndPoint()] = true;
    		}
    	}
    
    	return mst;
    	
    }

}
