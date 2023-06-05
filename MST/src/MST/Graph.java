package MST;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Graph {
	//
    private int totalV;
    private PriorityQueue<Edge>[] adj;
    private int totalWeight;

    public int numberOfVertices() {
    	return totalV;
    }
    public Graph(int vCount) {
    	totalV = vCount;
    	adj = new PriorityQueue[vCount];
    	for (int i = 0; i < vCount; i++) {
    		adj[i] = new PriorityQueue<Edge>();
    	}
    }
    // adds new edge into the graph
    public void addEdge(int i, int j, int weight) {
    	
    	adj[i].add(new Edge(i, j, weight));
    	adj[j].add(new Edge(j, i, weight));
    	totalWeight += weight;
    }
    // grabs a edge from a graph and adds into another graph.
    //
    public void pushEdge(Edge e) {
    	adj[e.getStartPoint()].add(e);
    	totalWeight += e.getWeight();
    }
    // total weight of the graph
    public int TotalCost() {
    	return totalWeight;
    }
    //returns the edge
    public PriorityQueue<Edge> AdjacentV(int vertex) {
    	return adj[vertex];
    }
    public void printGraph() {
    	System.out.println("Number of Vertices in this graph is: " + totalV);
    	
    	for (int i = 0; i < totalV; i++) {
    		PriorityQueue<Edge> edges = AdjacentV(i);
    		Iterator<Edge> it = edges.iterator();
    		for (int j = 0; j < edges.size(); j++) {
    			System.out.print(it.next() + " ");
    			System.out.println(' ');
    		}
    	}
    }

}
