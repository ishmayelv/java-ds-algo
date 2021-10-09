package com.ruthtech.trees;

import java.util.ArrayList;

public class Graphs6Nodes {
 /**
  * Adjacent Matrix
  * 	0	1	2	3	4	5	6
  * 0	0	1	1	0	0	0	0
  * 1	1	0	0	0	0	0	0
  * 2	1	1	0	0	1	0	0
  * 3	0	1	0	0	1	0	0
  * 4	0	0	1	1	0	1	0
  * 5	0	0	0	0	1	0	1
  * 6	0	0	0	0	0	0	1
  * 
  */
	private ArrayList<Integer>[] vertices;
	private int noOfVertices;
	
	Graphs6Nodes(int size){
		vertices =new ArrayList[size]; 
	}
	
	private void addVertex(int node) {
		 if( node>=0 && node< this.vertices.length) {
			 vertices[node]=new ArrayList<Integer>();
		 }
	}
	
	private void addEdge(int node1, int node2) {
		vertices[node1].add(node2);
		vertices[node2].add(node1);
	}
	private void showConnections() {
		int j=0;
		for(ArrayList nodes: vertices)  {
			System.out.print(j+"-->\t");
			for(int i=0;i<nodes.size(); i++) {
				System.out.print("\t"+ nodes.get(i) );
			}
			j++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Graphs6Nodes myGraph = new Graphs6Nodes(7);
		myGraph.addVertex(0);
		myGraph.addVertex(1);
		myGraph.addVertex(2);
		myGraph.addVertex(3);
		myGraph.addVertex(4);
		myGraph.addVertex(5);
		myGraph.addVertex(6);
		myGraph.addEdge(3, 1); 
		myGraph.addEdge(3, 4); 
		myGraph.addEdge(4, 2); 
		myGraph.addEdge(4, 5); 
		myGraph.addEdge(1, 2); 
		myGraph.addEdge(1, 0); 
		myGraph.addEdge(0, 2); 
		myGraph.addEdge(6, 5);

		myGraph.showConnections(); 

	}

}
