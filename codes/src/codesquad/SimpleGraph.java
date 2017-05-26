package codesquad;

import java.util.HashMap;

public class SimpleGraph {
	
	private HashMap<Integer, Edge> vertexList;
	
	public SimpleGraph() {
		vertexList = new HashMap<Integer, Edge>();
	}
	
	public void createVertex(int value) {
		Edge edge = new Edge(value,0);
		vertexList.put(value, edge);
	}
	
	public void insertEdge(int v1, int v2, double weight) {
        //TODO implement
		Edge curr = vertexList.get(v1);
		Edge prev = curr;
		while (curr != null )
		{
			if (curr.value == v2) {
				curr.weight = weight;
				return;
			}
			prev = curr;
			curr = curr.next;			

		}
		
		Edge newEdge = new Edge(v2, weight);
		prev.next = newEdge;
		
	}
	
	public boolean removeEdge(int v1, int v2) {
		//TODO: implement
		return false;
	}
	
	public void printList(int value) {
        Edge curr = vertexList.get(value).next;
        System.out.print(value + ": ");
        
        while(curr != null) {
        		System.out.printf("%d (%.2f), ",curr.value, curr.weight);
        		curr = curr.next;
        }
        System.out.println();
	}
	
	class Edge {
		int value; //vertex
		boolean visited;
		double weight;
		Edge next = null;
		
		Edge(int v, double w) {
			this.value = v;
			this.weight = w;
		}
	}
	
	public static void main(String[] args) {
		SimpleGraph graph = new SimpleGraph();
		for (int i = 1; i <= 5; i++) {
			graph.createVertex(i);
		}
		graph.insertEdge(1, 2, 1.0);
		graph.insertEdge(2, 3, 1.0);
		graph.insertEdge(2, 5, 3.2);
		graph.insertEdge(3, 4, 4.5);
		graph.insertEdge(3, 4, 4.5);
		graph.insertEdge(4, 1, 2.8);
	
		for (int i = 1; i <= 5; i++) {
			graph.printList(i);	
		}
	}
}