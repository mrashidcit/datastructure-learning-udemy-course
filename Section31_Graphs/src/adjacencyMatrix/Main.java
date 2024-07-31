package adjacencyMatrix;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
//        nodeList.add(new GraphNode("A", 0));
//        nodeList.add(new GraphNode("B", 1));
//        nodeList.add(new GraphNode("C", 2));
//        nodeList.add(new GraphNode("D", 3));
//        nodeList.add(new GraphNode("E", 4 ));
//
//        Graph g = new Graph(nodeList);
//        g.addUndirectedEdge(0,1);
//        g.addUndirectedEdge(0,2);
//        g.addUndirectedEdge(0,3);
//        g.addUndirectedEdge(1,4);
//        g.addUndirectedEdge(2,3);
//        g.addUndirectedEdge(3,4);
//        System.out.println(g.toString());
//
////        g.bfs();
//
//        System.out.println("");
//        g.dfs();


        /**
         * ***** SSSPP ******
         */
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        nodeList.add(new GraphNode("F", 5));
        nodeList.add(new GraphNode("G", 6));
        Graph newGraph = new Graph(nodeList);
        newGraph.addUndirectedEdge(0, 1); // A-B
        newGraph.addUndirectedEdge(0, 2); // A-C
        newGraph.addUndirectedEdge(1, 3); // B-D
        newGraph.addUndirectedEdge(1, 6); // B-G
        newGraph.addUndirectedEdge(2, 3); // C-D
        newGraph.addUndirectedEdge(2, 4); // C-E
        newGraph.addUndirectedEdge(3, 5); // D-F
        newGraph.addUndirectedEdge(4, 5); // E-F
        newGraph.addUndirectedEdge(5, 6); // F-G
//        System.out.print(newGraph.toString());
        newGraph.BFSForSSSPP(nodeList.get(0));

    }
}




















