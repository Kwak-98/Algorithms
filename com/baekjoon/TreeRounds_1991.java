package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class TreeRounds_1991 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer tokenizer;
		
		HashMap<String, Node> map = new HashMap<>(); 
		
		Tree tree = new Tree();
		Node root = new Node("A");
		tree.setRoot(root);
		map.put(root.value, root);
		
		int N = Integer.parseInt(reader.readLine());
		
		for(int i = 0; i < N; i++) {
			tokenizer = new StringTokenizer(reader.readLine());
			
			Node paNode = map.get(tokenizer.nextToken());
			String left = tokenizer.nextToken();
			String right = tokenizer.nextToken();
			
			
			if(left.equals(".")) {
				paNode.left = null;
			}else {
				Node lNode = new Node(left);
				map.put(left, lNode);
				paNode.left = lNode;
			}
			
			if(right.equals(".")) {
				paNode.right = null;
			}else {
				Node rNode = new Node(right);
				map.put(right, rNode);
				paNode.right = rNode;
			}
			
		}
		
		tree.preOrder(tree.getRoot());
		Tree.builder.append("\n");
		tree.inOrder(tree.getRoot());
		Tree.builder.append("\n");
		tree.postOrder(tree.getRoot());
		
		writer.write(Tree.builder.toString());
		writer.flush();
			
		writer.close();
		reader.close();
		
	}//main

}//End of class

class Node {
	
	public String value;
	public Node right;
	public Node left;
	
	public Node(String value) {
		this.value = value;
	}
	
	
}//End of Node

class Tree{
	
	public static StringBuilder builder = new StringBuilder();
	
	public Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void preOrder(Node node) {	//전위 순회
		if(node != null) {
			builder.append(node.value);
			preOrder(node.left);
			preOrder(node.right);
		}
	}//preOder()
	
	public void inOrder(Node node) {		// 중위 순회
		if(node != null) {
			inOrder(node.left);
			builder.append(node.value);
			inOrder(node.right);
		}
	}//inOrder()
	
	public void postOrder(Node node) {	// 후위 순회
		if(node != null) {
			postOrder(node.left);
			postOrder(node.right);
			builder.append(node.value);
		}
	}//postOrder()
	
}//End of Tree

