import java.util.*; 
  
class Graph<Val> { 
  
    private Map<Val, List<Val> > graph = new HashMap<>(); 
  
    public void addNode(Val s) { 
        graph.put(s, new LinkedList<Val>()); 
    	
    	
    } 

    public void addUndirectedEdge(Val src, Val dst) { 
    	if (!graph.containsKey(src)){	
            addNode(src); 
    	}
  
        if (!graph.containsKey(dst)){ 
            addNode(dst); 
        }
  
        graph.get(src).add(dst);
        graph.get(dst).add(src); 

    }
    
    public void addDirectedEdge(Val src, Val dst) { 
    	if (!graph.containsKey(src)){	
            addNode(src); 
    	}
  
        if (!graph.containsKey(dst)){ 
            addNode(dst); 
        }
  
        graph.get(src).add(dst);

    } 
    
    public void addWeightedEdge(Val src, Val dst, int weight) { 
    	
    	if (!graph.containsKey(src)){	
            addNode(src); 
    	}
  
        if (!graph.containsKey(dst)){ 
            addNode(dst); 
        }
  
        graph.get(src).add(dst);
  

    } 
    
    
    public void removeUndirectedEdge(Val src, Val dst) { 
  
        graph.get(src).remove(dst);
        graph.get(dst).remove(src); 

    }
    
    public void removeDirectedEdge(Val src, Val dst) { 
  
        graph.get(src).remove(dst);

    }
  
    public void getAllNodes() { 

		for (Val allNodes: graph.keySet()){
            String node = allNodes.toString();
            System.out.print(node + " "); 
		}
	
    } 
  

    public String toString() { 
        StringBuilder graphToStr = new StringBuilder();
        graphToStr.append(graph.toString());
  
        return (graphToStr.toString()); 
    	} 
} 
  
public class Main { 
  
    public static void main(String args[]) 
    { 
 
        Graph<Integer> newGraph = new Graph<Integer>(); 
        Graph<Integer> newGraph2 = new Graph<Integer>(); 
        Graph<Integer> newGraph3 = new Graph<Integer>(); 
  
        newGraph.addUndirectedEdge(1, 2); 
        newGraph.addUndirectedEdge(1, 3); 
        newGraph.addUndirectedEdge(2, 3); 
        newGraph.addUndirectedEdge(2, 4); 
        newGraph.addUndirectedEdge(3, 4); 
        
        newGraph.removeUndirectedEdge(2,4); 
 
        System.out.println("Undirected Graph: "+ newGraph.toString()); 
  
		System.out.print("Undirected Nodes: "); 
		newGraph.getAllNodes();  
		System.out.println("");
		
        newGraph2.addDirectedEdge(5, 6); 
        newGraph2.addDirectedEdge(5, 7); 
        newGraph2.addDirectedEdge(6, 9); 
        newGraph2.addDirectedEdge(8, 9); 
        newGraph2.addDirectedEdge(9, 7); 
        
        newGraph2.removeDirectedEdge(5,7); 
 
        System.out.println("Directed Graph: "+ newGraph2.toString()); 
  
		System.out.print("Directed Nodes: "); 
		newGraph2.getAllNodes();  
		System.out.println("");
		
        newGraph3.addWeightedEdge(10, 11, 1); 
        newGraph3.addWeightedEdge(11, 14, 3); 
        newGraph3.addWeightedEdge(14, 10, 4);
        newGraph3.addWeightedEdge(14, 12, 2);
        
        newGraph3.removeDirectedEdge(14,12); 
 
        System.out.println("Weighted Graph: "+ newGraph3.toString()); 
  
		System.out.print("Weighted Nodes: "); 
		newGraph3.getAllNodes();  
		
		
    } 
} 






