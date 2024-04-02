package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class TreeRounds_1991 {
	
	public static StringBuilder builder;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<String> stack = new Stack<>();
		StringTokenizer tokenizer;
		
		int N = Integer.parseInt(reader.readLine());
		
		
		
		for(int i = 0; i < N; i++) {
			
		}
		
		Tree tree = new Tree();
		
		
		
		
		
		writer.write(builder.toString());
			
		writer.close();
		reader.close();
		
	}//main

}//End of class

class Node {
	
	public String value;
	public Node right;
	public Node left;
	
	public Node(String value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
}//End of Node

class Tree{
	
	public static Queue<String> queue = new LinkedList<>();
	
	public Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void preOrder(Node node) {	//전위 순회
		if(node != null) {
			queue.add(node.value);
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	public void inOrder(Node node) {		// 중위 순회
		if(node != null) {
			inOrder(node.left);
			queue.add(node.value);
			inOrder(node.right);
		}
	}
	
	public void postOrder(Node node) {	// 후위 순회
		if(node != null) {
			postOrder(node.left);
			postOrder(node.right);
			queue.add(node.value);
		}
	}
	
}//End of Tree

















