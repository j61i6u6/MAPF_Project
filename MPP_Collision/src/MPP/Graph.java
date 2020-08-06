package MPP;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Graph {

    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }
    public void delNode(Node nodeA) {
        nodes.remove(nodeA);
    }
    
    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }
    
    public void clear() {
        this.nodes.clear();
    }
}
