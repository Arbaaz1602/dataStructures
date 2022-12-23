package graph;

public class GraphTest {
	boolean [][] adjMatrix; 
	private int numVertices; 
	
	
	public GraphTest( int numVertices) {
		super();
		this.numVertices = numVertices;
		adjMatrix= new boolean [numVertices] [ numVertices ];
		}

	public void addEdges (int i , int j) {
		adjMatrix[i][j] = true; 
		adjMatrix[j][i] = true; 
	}
	
	public void removeEdges(int i, int j) {
		adjMatrix [i][j] = false; 
		adjMatrix[j][i] = false; 
		
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
			for (int i = 0; i<numVertices; i++) {
				sb.append( i + ": "); 
			
			for (boolean j : adjMatrix[i]) {
			sb.append((j?1:0) + " ");	
			}
			sb.append("\n");
			}
		return sb.toString(); 
	}
	public static void main(String[] args) {
	GraphTest g = new GraphTest(4); 
	g.addEdges(0, 1);
	g.addEdges(0, 2);
	g.addEdges(0, 3);
	g.addEdges(1, 2);
	
	System.out.println(g.toString());

	}

}
