package cz.cuni.mff.d3s.deeco.analysis.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * Represents oriented graph. Nodes of the graph are represented by {@link Node Node}.
 *
 * @param <T> Type of values that will be stored in the graph.
 */
public final class OrientedGraph<T> {
	/** Hash set of all nodes of the graph. */
	private HashSet<Node<T>> nodesSet;
	/** 
	 * Hash map between values and their nodes. Contains all values represented by the nodes
	 * of the graph.
	 */
	private HashMap<T, Node<T>> valuesToNodes;
	
	public OrientedGraph() {
		this.nodesSet = new HashSet<Node<T>>();
		this.valuesToNodes = new HashMap<T, Node<T>>();
	}
	
	/** 
	 * Creates oriented edge (from -> to) and adds it to the graph. Value are wrapped by existing
	 * nodes. If there doesn't exist node for the given values then a new Node is created and added.
	 */
	public void addOrientedEdge(T from, T to) {
		Node<T> fromNode = valuesToNodes.get(from);
		if (fromNode == null) {
			fromNode = new Node<T>(from);
			valuesToNodes.put(from, fromNode);
		}
		
		Node<T> toNode = valuesToNodes.get(to);
		if (toNode == null) {
			toNode = new Node<T>(to);
			valuesToNodes.put(to, toNode);
		}
		
		addOrientedEdge(fromNode, toNode);
	}
	
	/** Adds new node to the current graph. */
	public void addNode(T nodeValue) {
		Node<T> node = new Node<T>(nodeValue);
		nodesSet.add(node);
		valuesToNodes.put(nodeValue, node);
	}
	
	/**
	 * Returns values of the nodes of the graph in topological order.
	 * @throws Exception When there is a cycle in the graph.
	 */
	public Collection<T> getTopologicallyOrderedValues() throws Exception {
		Collection<Node<T>> nodes = this.getTopologicallyOrderedNodes();
		Collection<T> result = new ArrayList<T>();
		
		for (Node<T> node : nodes) {
			result.add(node.getValue());
		}
		
		return result;
	}
	
	/**
	 * Returns the nodes of the graph in topological order.
	 * @throws Exception When there is a cycle in the graph.
	 */
	public Collection<Node<T>> getTopologicallyOrderedNodes() throws Exception {
		Collection<Node<T>> result = new ArrayList<Node<T>>();
		Stack<Node<T>> roots = new Stack<Node<T>>();
		
		HashMap<Node<T>, Integer> removedAncestors = new HashMap<Node<T>, Integer>();
		
		/* Find roots */
		for(Node<T> node : nodesSet) {
			if (node.isRoot()) {
				roots.add(node);
			}
		}
		
		while (!roots.isEmpty()) {
			Node<T> node = roots.pop();
			result.add(node);
			
			for(Node<T> nextNode : node.getSuccessors()) {
				if (nextNode.numberOfAncestors() == 1) {
					roots.add(nextNode);
					continue;
				}
				
				if (!removedAncestors.containsKey(nextNode)) {
					removedAncestors.put(nextNode, 1);
					continue;
				}
				
				int removed = removedAncestors.get(nextNode) + 1;
				removedAncestors.put(nextNode, removed);
				
				if (removed == nextNode.numberOfAncestors()) {
					roots.add(nextNode);
				}
			}
		}
		
		if (nodesSet.size() != result.size()) {
			throw new Exception("Graph is not acyclic!");
		} else { 
		    return result;
		}
	}
	
	/** Add oriented edge (from -> to) to the graph. Both nodes must belong to the graph. */
	private void addOrientedEdge(Node<T> from, Node<T> to) {
		if (from.getSuccessors().contains(to)) {
			// The edge was already added.
			return;
		}
		
		from.addSuccessor(to);
		to.addAncestor(from);
		if (!nodesSet.contains(from)) {
			nodesSet.add(from);
		}
		
		if (!nodesSet.contains(to)) {
			nodesSet.add(to);
		}
	}
}
