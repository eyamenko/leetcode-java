package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {
    public int val;
    public List<Node> neighbors;

    public Node(int val) {
        this.val = val;
        this.neighbors = new ArrayList<Node>();
    }

    public Node(int[]... adjList) {
        this(adjList, 0, HashMap.<Integer, Node>newHashMap(adjList.length));
    }

    private Node(int[][] adjList, int index, Map<Integer, Node> nodes) {
        this(index + 1);

        nodes.put(val, this);

        for (int neighbor : adjList[index]) {
            Node neighborNode = nodes.get(neighbor);

            if (neighborNode == null) {
                neighborNode = new Node(adjList, neighbor - 1, nodes);
            }

            neighbors.add(neighborNode);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj instanceof Node node && equals(node, new HashMap<>());
    }

    private boolean equals(Node node, Map<Integer, Node> nodes) {
        if (val != node.val || neighbors.size() != node.neighbors.size()) {
            return false;
        }

        nodes.put(val, this);

        for (int i = 0; i < neighbors.size(); i++) {
            Node neighborNode = neighbors.get(i);

            if (!nodes.containsKey(neighborNode.val)
                    && !neighborNode.equals(node.neighbors.get(i), nodes)) {
                return false;
            }
        }

        return true;
    }
}
