package cz.cuni.mff.d3s.deeco.analysis.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Node of the {@link OrientedGraph oriented graph}.
 * 
 * @param <T> Type of the value represented by the node.
 */
public class Node<T> {
	/** Value represented by the node. */
	private T value;
	/** Successors - next node in the graph, pair represents oriented edge (this -> next) */
	private Collection<Node<T>> next;
	/** Ancestors - previous node in the graph, pair represents oriented edge (previous -> this) */
	private Collection<Node<T>> previous;
	
	/**
	 * @param value Value represented by the node.
	 */
	public Node(T value) {
		this.value = value;
		this.next = new ArrayList<Node<T>>();
		this.previous = new ArrayList<Node<T>>();
	}
	
	/** Returns value of current node. */
	public T getValue() {
		return value;
	}
	
	/** Adds next node (represents oriented edge this -> node). */
	public void addSuccessor(Node<T> node) {
		next.add(node);
	}
	
	/** Adds previous node (represents oriented edge node -> this). */
	public void addAncestor(Node<T> node) {
		previous.add(node);
	}
	
	/** Returns immutable collection of successors. */
	public Collection<Node<T>> getSuccessors() {
		return Collections.unmodifiableCollection(next);
	}
	
	/** Returns total number of ancestors. */
	public int numberOfAncestors() {
		return previous.size();
	}
	
	/** Return whether node is root (has no ancestors). */
	public boolean isRoot() {
		return previous.isEmpty();
	}
}
