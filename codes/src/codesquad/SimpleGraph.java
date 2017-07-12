package codesquad;

import java.util.HashMap;
import java.util.LinkedList;

public class SimpleGraph {

	private HashMap<Integer, Vertex> vertexList;

	public SimpleGraph() {
		vertexList = new HashMap<Integer, Vertex>();
	}

	public void createVertex(int value) {
		Vertex v = new Vertex(value);
		vertexList.put(value, v);
	}

	public void insertEdge(int from, int to, double weight) {
		Vertex v = vertexList.get(from);
		Edge curr = v.next;
		Edge prev = curr;

		while (curr != null) {
			if (curr.toVertex == to) {
				curr.weight = weight;
				return;
			}
			prev = curr;
			curr = curr.next;
		}

		// insert new
		Edge newEdge = new Edge(weight, from, to);
		if (prev == null) {
			v.next = newEdge;
		} else {
			prev.next = newEdge;
		}

	}

	public void visit(Vertex v) {
		System.out.print(v.value + "->");
		v.visited = true;
	}

	public void bfs(int start) {
		Vertex v = vertexList.get(start);
		bfs(v);
		System.out.println("end");
	}

	private void bfs(Vertex v) {
		if (v == null)
			return;
		visit(v);
		Edge curr = v.next;
		while (curr != null) {
			Vertex n = vertexList.get(curr.toVertex);
			if (n != null && !n.visited) {
				bfs(n);
			}
			curr = curr.next;
		}
	}

	public void dfs(int start) {
		LinkedList<Vertex> q = new LinkedList<Vertex>();
		Vertex v = vertexList.get(start);
		visit(v);
		q.addFirst(v);
		while (!q.isEmpty()) {
			v = q.removeFirst();
			Edge n = v.next;
			while (n != null) {
				v = vertexList.get(n.toVertex);
				if (!v.visited) {
					visit(v);
					q.addFirst(v);
				}
				n = n.next;
			}
		}
		System.out.println("end");
	}

	public void resetVisit() {
		for (int i : vertexList.keySet()) {
			Vertex v = vertexList.get(i);
			v.visited = false;
		}
	}

	public void printList(int value) {
		Edge curr = vertexList.get(value).next;
		System.out.print(value + ": ");

		while (curr != null) {
			System.out.printf("%d (%.2f), ", curr.toVertex, curr.weight);
			curr = curr.next;
		}
		System.out.println();
	}

	class Vertex {
		int value;
		boolean visited;
		Edge next;

		Vertex(int v) {
			value = v;
		}
	}

	class Edge {
		int fromVertex;
		int toVertex;
		double weight;
		Edge next = null;

		Edge(double w, int from, int to) {
			this.weight = w;
			this.fromVertex = from;
			this.toVertex = to;
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
		graph.insertEdge(3, 4, 4.8);
		graph.insertEdge(4, 1, 2.8);

		for (int i = 1; i <= 5; i++) {
			graph.printList(i);
		}

		graph.bfs(1);
		graph.resetVisit();
		graph.bfs(3);
		graph.resetVisit();
		graph.dfs(1);
		graph.resetVisit();
		graph.dfs(3);
	}
}