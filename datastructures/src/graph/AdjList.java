package graph;

import java.util.ArrayList;

public class AdjList {

	public static void main(String[] args) {
	
		ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>();
		
		int V = 5;
		
		for (int i =0; i<V; i++)
			Edges.add(new ArrayList<Integer>());
			
		Graph.addEdge(Edges, 0, 1);
		Graph.addEdge(Edges, 0, 2);
		Graph.addEdge(Edges, 0, 3);
		Graph.addEdge(Edges, 1, 2);
		
		Graph.printGraph(Edges);
	}
}

class Graph {
	
	static void addEdge(ArrayList<ArrayList<Integer>> Edges, int c1, int c2) {
	Edges.get(c1).add(c2);
	Edges.get(c2).add(c1);
	
	}
	
	static void printGraph(ArrayList<ArrayList<Integer>> Edges) {
	
		for (int i = 0; i < Edges.size(); i++) {
			System.out.print("\nVertex " + i + " : " );
			for(int j = 0 ; j < Edges.get(i).size(); j++) {
				System.out.print(" -> " + Edges.get(i).get(j));
			}
			System.out.println();
		}
	}
}