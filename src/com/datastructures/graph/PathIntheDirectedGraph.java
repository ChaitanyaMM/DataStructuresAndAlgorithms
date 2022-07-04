package com.datastructures.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Edge {
	int src;
	int dest;

	private Edge(int src, int dest) {
		this.src = src;
		this.dest = dest;

	}

	// Factory method for creating an immutable instance of `Edge`
	public static Edge of(int a, int b) {
		return new Edge(a, b); // calls private constructor
	}
}

class Graph {
	List<List<Integer>> adjList = null;

	Graph(List<Edge> edgs, int n) {
		adjList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			adjList.add(new ArrayList<>());
		}

		for (Edge e : edgs) {
			adjList.get(e.src).add(e.dest);

		}

	}

}

public class PathIntheDirectedGraph {

	public static boolean isReachable(Graph graph, int src, int dest) {

		boolean[] discoverd = new boolean[graph.adjList.size()];
		Stack<Integer> path = new Stack<>();

		Queue<Integer> queue = new ArrayDeque<>();

		discoverd[src] = true;
		queue.add(src);
		path.add(src);

		while (!queue.isEmpty()) {
			int v = queue.poll();

			if (v == dest) {
				 return true;
			}

			List<Integer> records = graph.adjList.get(v);
			if (!records.isEmpty()) {

				for (int i : records) {

					if (!discoverd[i]) {

						discoverd[i] = true;
						queue.add(i);

					}
				}

			}

		}

		return false;

	}
	
	public static boolean isReachable2(Graph graph, int src, int dest,boolean[] discoverd) {

 		Stack<Integer> path = new Stack<>();

		Queue<Integer> queue = new ArrayDeque<>();

		discoverd[src] = true;
		queue.add(src);
		path.add(src);
		
		System.out.println("paths" + path);

		while (!queue.isEmpty()) {
			int v = queue.poll();

			if (v == dest) {
				 return true;
			}

			List<Integer> records = graph.adjList.get(v);
			if (!records.isEmpty()) {

				for (int i : records) {

					if (!discoverd[i]) {

						if(isReachable2(graph,i,dest,discoverd)) {

							return true;
						};

					}
				}

			}

		}
		

		return false;

	}


	public static boolean isReachableAndPrintPath(Graph graph, int src, int dest, boolean[] discovered,
			Stack<Integer> path) {

		discovered[src] = true;

		path.add(src);

		if (src == dest) {
			return true;
		}

		// do for every edge (src, i)
		for (int i : graph.adjList.get(src)) {

			if (!discovered[i]) {

				if (isReachableAndPrintPath(graph, i, dest, discovered, path)) {
					return true;
				}
			}
		}

		// backtrack: remove the current node from the path
		path.pop();

		// return false if destination vertex is not reachable from src
		return false;

	}

	public static void main(String[] args) {
		
//		
//		    0<----------1----------->2
//		    |           |			 |	
//	(0,3)   |           |(1,4)		 |
//		    |			|			 |
//		    3<--------->4			 |
//		    |			|			 | (2,7)
//	(0,5)	|			|(4,6)		 |
//		    |			|			 |	
//		    5----------->6---------->7
		
		
		
		
		List<Edge> edges = Arrays.asList(Edge.of(0, 3), Edge.of(1, 0), Edge.of(1, 2), Edge.of(1, 4), Edge.of(2, 7),
				Edge.of(3, 4), Edge.of(3, 5), Edge.of(4, 3), Edge.of(4, 6), Edge.of(5, 6), Edge.of(6, 7));

		// total number of nodes in the graph (labeled from 0 to 7)
		int n = 8;

		// build a graph from the given edges
		Graph graph = new Graph(edges, n);

		boolean[] discovered = new boolean[n];


		Stack<Integer> path = new Stack<>();

		// source and destination vertex
		int src = 0, dest = 7;

		// perform BFS traversal from the source vertex to check the connectivity
		if (isReachableAndPrintPath(graph, src, dest, discovered, path)) {
			System.out.println("Path exists from vertex " + src + " to vertex " + dest);
			System.out.println("The complete path is " + path);

		} else {
			System.out.println("No path exists between vertices " + src + " and " + dest);

		}

		System.out.println();
		
		if (isReachable(graph, src, dest)) {
 			System.out.println("Path exists from vertex " + src + " to vertex " + dest );

		} else {
			System.out.println("No path exists between vertices " + src + " and " + dest);

		}
		
		System.out.println();

		boolean[] discovered2 = new boolean[n];

		if (isReachable2(graph, src, dest,discovered2)) {
 			System.out.println("Path exists from vertex " + src + " to vertex " + dest );

		} else {
			System.out.println("No path exists between vertices " + src + " and " + dest);

		}

	}
}
