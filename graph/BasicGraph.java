package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Graph<T> {

    Map<T, List<T>> map = new HashMap();
    
    void addVertex(T source) {
        map.put(source, new LinkedList());
    }
    
    void addEdge(T source, T destination, boolean bidirectional) {
        if(!map.containsKey(source))
            addVertex(source);
        
        if(!map.containsKey(destination))
            addVertex(destination);
        
        map.get(source).add(destination);
        if(bidirectional)
            map.get(destination).add(source);
    }
    
    int getVertexCount() {
        return map.keySet().size();
    }
    
    int getEdgeCount(boolean bidirectional) {
        int count = 0;
        
        for(T v : map.keySet())
            count += map.get(v).size();
        
        return bidirectional ? count/2 : count;
    }
    
    boolean hasVertex(T source) {
        return map.containsKey(source);
    }
    
    boolean hasEdge(T source, T destination) {
        return map.get(source).contains(destination);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for(T v : map.keySet()) {
            sb.append(v.toString() + " : ");
            for(T w : map.get(v)) {
                sb.append(w.toString() + " ");
            }
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
}

class BasicGraph {

    public static void main(String[] args) {

        Graph<Integer> g = new Graph();
               
        g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 4, true);
        
        System.out.println("The inserted Graph: ");
        System.out.println(g.toString());
        
        System.out.println("Number of Vertex: " + g.getVertexCount());
        System.out.println("Number of Edges: " + g.getEdgeCount(false));
        System.out.println("Edge between 3 and 4? : " + g.hasEdge(3, 4));
        System.out.println("Edge between 2 and 4? : " + g.hasEdge(2, 4));
        System.out.println("Vertex 3 is present? : " + g.hasVertex(3));
        System.out.println("Vertex 5 is present? : " + g.hasVertex(5));
        
    }
}
