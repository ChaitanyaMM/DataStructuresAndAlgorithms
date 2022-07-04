package com.datastructures.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Edge2 {
	int source, dest;

	public Edge2(int source, int dest) {
		this.source = source;
		this.dest = dest;
	}
}

// A class to represent a graph object
class Graph2 {
	// A list of lists to represent an adjacency list
	List<List<Integer>> adjList = null;

	// Total number of nodes in the graph
	int n;

	// Constructor
	Graph2(List<Edge2> edges, int n) {
		this.adjList = new ArrayList<>();
		this.n = n;

		for (int i = 0; i < n; i++) {
			adjList.add(new ArrayList<>());
		}

		// add edges to the undirected graph
		for (Edge2 edge : edges) {
			int src = edge.source;
			int dest = edge.dest;

			adjList.get(src).add(dest);
			adjList.get(dest).add(src);
		}
	}
}

public class Bipartite  {

		// Perform DFS on the graph starting from vertex `v`
		public static boolean DFS(Graph2 graph, int v, boolean[] discovered, boolean[] color) {
			// do for every edge (v, u)
			for (int u : graph.adjList.get(v)) {
				// if vertex `u` is explored for the first time
				if (discovered[u] == false) {
					// mark the current node as discovered
					discovered[u] = true;
					// current node has the opposite color of that its parent
					color[u] = !color[v];

					// if DFS on any subtree rooted at `v` returns false
					if (DFS(graph, u, discovered, color) == false) {
						return false;
					}
				}
				// if the vertex has already been discovered and
				// the color of vertex `u` and `v` are the same, then
				// the graph is not bipartite
				else if (color[v] == color[u]) {
					return false;
				}
			}

			return true;
		}

		// Function to check if a graph is Bipartite using DFS
		public static boolean isBipartite(Graph2 graph) {
			int n = graph.n;

			// to keep track of whether a vertex is discovered or not
			boolean[] discovered = new boolean[n];

			// keep track of the color assigned (0 or 1) to each vertex in DFS
			boolean[] color = new boolean[n];

			// start from any node as the graph is connected and undirected
			int src = 0;

			// mark the source vertex as discovered and set its color to 0
			discovered[src] = true;
			color[src] = false;

			// call DFS procedure
			return DFS(graph, src, discovered, color);
		}

		public static void main(String[] args) {
			// List of graph edges
			List<Edge2> edges = Arrays.asList(new Edge2(0, 1), new Edge2(1, 2), new Edge2(1, 7), new Edge2(2, 3),
					new Edge2(3, 5), new Edge2(4, 6), new Edge2(4, 8), new Edge2(7, 8), new Edge2(1, 3)
			// if we remove (1, 3) edge, the graph becomes bipartite
			);

			// total number of nodes in the graph (0 to 8)
			int n = 9;

			// build a graph from the given edges
			Graph2 graph = new Graph2(edges, n);

			if (isBipartite(graph)) {
				System.out.println("Graph is bipartite");
			} else {
				System.out.println("Graph is not bipartite");
			}
		}
	}
