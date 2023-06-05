package MST;

public class Edge implements Comparable{
	
    private int v1;
    private int v2;
    private int weight;

    public Edge(int x, int y, int cost) {
    	v1 = x;
    	v2 = y;
    	weight = cost;
    }

    public int getStartPoint() {
    	return v1;
    }

    public int getEndPoint() {
    	return v2;
    }

    public int getWeight() {
    	return weight;
    }
    
    public int compareTo(Object o) {
    	Edge other = (Edge) o;
    	return Integer.compare(this.weight, other.weight);
    }

    public String toString() {
    	return v1 + "-" + v2 + " Weight for this edge is:  " + weight;
    }
}
