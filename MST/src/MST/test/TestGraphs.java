package MST.test;

import java.util.Iterator;


import java.util.PriorityQueue;

import MST.Graph;
import MST.PrimMST;

public class TestGraphs {

	public static void main(String[] args) {
    	
    	Graph g = new Graph(5);

    	System.out.println("Graph:");
    	System.out.println();
    	// add Edges
    	g.addEdge(0, 1, 1);
    	g.addEdge(0, 3, 2);
    	g.addEdge(1, 4, 3);
    	g.addEdge(1, 2, 4);
    	g.addEdge(2, 3, 5);
    	g.addEdge(3, 4, 6);
    	g.addEdge(2, 4, 7);
    	
    	
    	
    	g.printGraph();
    	System.out.println("This Graph has a total cost of: " + g.TotalCost());
    	System.out.println();
    	
    	System.out.println("Prim's MST:");
    	System.out.println();
    	Graph MST = PrimMST.Prim(g, 0);
    	MST.printGraph();
    	System.out.println("The Minimum Spanning tree for this Graph has a cost of: " + MST.TotalCost());
    	System.out.println();
    	
    	System.out.println("Graph:");
    	Graph f = new Graph(10);
    	
    	f.addEdge(0, 1, 5);
    	f.addEdge(0, 3, 10);
    	f.addEdge(0, 4, 1);
    	f.addEdge(1, 2, 7);
    	f.addEdge(1, 5, 4);
    	f.addEdge(2, 5, 8);
    	f.addEdge(4, 5, 12);
    	f.addEdge(4, 7, 9);
    	f.addEdge(5, 8, 2);
    	f.addEdge(6, 7, 3);
    	f.addEdge(7, 8, 6);
    	f.addEdge(7, 9, 11);

    	
    	f.printGraph();
    	System.out.println("This Graph has a total cost of: " + f.TotalCost());
    	
    	System.out.println();
    	
    	System.out.println("Prim's MST:");
    	System.out.println();
    	Graph MST2 = PrimMST.Prim(f, 2);
    	MST2.printGraph();
    	System.out.println("The Minimum Spanning tree for this Graph has a cost of: " + MST2.TotalCost());
    	

	}

}


