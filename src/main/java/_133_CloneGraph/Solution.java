package _133_CloneGraph;

import utils.Node;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Problem link: https://leetcode.com/problems/clone-graph/
 */
class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Map<Node, Node> originToCopy = new HashMap<>();
        Set<Node> visited = new HashSet<Node>();
        clone(originToCopy, visited, node);

        return originToCopy.get(node);
    }

    void clone(Map<Node, Node> originToCopy, Set<Node> visited, Node node) {
        visited.add(node);
        Node cloned = new Node(node.val);
        originToCopy.put(node, cloned);

        for (Node neighbor : node.neighbors) {
            if (!visited.contains(neighbor)) {
                clone(originToCopy, visited, neighbor);
            }

            cloned.neighbors.add(originToCopy.get(neighbor));
        }
    }
}
