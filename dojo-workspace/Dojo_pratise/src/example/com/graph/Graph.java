package example.com.graph;

import java.util.LinkedList;

public class Graph {

	public static class Node {
		private int id;
		LinkedList<Node> adjacent = new LinkedList<Node>();
		private Node(int id) {
			
		}
	}
}
