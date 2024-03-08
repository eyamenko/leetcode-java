package leetcode.clonegraph;

import java.util.HashMap;
import java.util.Map;
import leetcode.Node;

/*
 * https://leetcode.com/problems/clone-graph/
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        if (node.neighbors.isEmpty()) {
            return new Node(node.val);
        }

        return cloneGraph(node, new HashMap<>());
    }

    private Node cloneGraph(Node node, Map<Integer, Node> nodes) {
        Node nodeClone = new Node(node.val);

        nodes.put(nodeClone.val, nodeClone);

        for (Node neighbor : node.neighbors) {
            Node neighborClone = nodes.get(neighbor.val);

            if (neighborClone == null) {
                neighborClone = cloneGraph(neighbor, nodes);
            }

            nodeClone.neighbors.add(neighborClone);
        }

        return nodeClone;
    }
}
