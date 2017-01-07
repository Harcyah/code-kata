package com.harcyah.kata.exercism.binary_search_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BST<T extends Comparable> {

	private Node<T> root;

	protected static class Node<T> {

		private final T data;
		private final int distance;
		private Node<T> left = null;
		private Node<T> right = null;

		public Node(T data, int distance) {
			this.data = data;
			this.distance = distance;
		}

		public T getData() {
			return data;
		}

		public Node<T> getLeft() {
			return left;
		}

		public Node<T> getRight() {
			return right;
		}
	}

	public void insert(T value) {
		if (root == null) {
			root = new Node<>(value, 0);
		} else {
			insertAt(value, root);
		}
	}

	private void insertAt(T value, Node<T> node) {
		int result = value.compareTo(node.data);
		if (result > 0) {
			// Value is greater than current node
			if (node.right == null) {
				node.right = new Node<>(value, node.distance + 1);
			} else {
				insertAt(value, node.right);
			}
		} else if (result <= 0) {
			// Value is smaller or equals to current node
			if (node.left == null) {
				node.left = new Node<>(value, node.distance + 1);
			} else {
				insertAt(value, node.left);
			}
		}
	}

	public Node<T> getRoot() {
		return root;
	}

	public List<T> getAsLevelOrderList() {
		List<T> values = new ArrayList<>();
		LinkedList<Node<T>> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node<T> node = queue.poll();

			if (node.left != null) {
				queue.add(node.left);
			}

			if (node.right != null) {
				queue.add(node.right);
			}

			values.add(node.data);
		}
		return values;
	}

	public List<T> getAsSortedList() {
		List<T> list = new ArrayList<>();
		traverseSorted(list, root);
		return list;
	}

	private void traverseSorted(List<T> list, Node<T> node) {
		if (node.left != null) {
			traverseSorted(list, node.left);
		}
		list.add(node.data);
		if (node.right != null) {
			traverseSorted(list, node.right);
		}
	}

}
