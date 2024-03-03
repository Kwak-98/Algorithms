package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Document {
	
	private int index;
	private int priority;
	
	public Document(int index, int priority) {
		this.index = index;
		this.priority = priority;
	}
	
	public int getIndex() {
		return index;
	}
	public int getPriority() {
		return priority;
	}

}//End of Document

public class PrinterQueue_1966 {

	public static void main(String[] args) throws IOException {
		
		Queue<Document> queue = new LinkedList<>();
		StringBuilder builder = new StringBuilder();
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = null;
		
		int T = Integer.parseInt(reader.readLine());	// 테스트 케이스 수
		
		for(int i = 0; i < T; i++) {
			
			queue.clear();
			
			tokenizer = new StringTokenizer(reader.readLine());
			
			int N = Integer.parseInt(tokenizer.nextToken());	// 문서의 개수
			int M = Integer.parseInt(tokenizer.nextToken());	// 궁금한 문서의 위치
			int count = 0;										// 인쇄된 수
			
			tokenizer = new StringTokenizer(reader.readLine());
			
			for(int j = 0; j < N; j++) {
				Document doc = new Document(j, Integer.parseInt(tokenizer.nextToken()));
				queue.add(doc);
			}
			
			while(!queue.isEmpty()) {
				
				int maxPri = queue.stream().mapToInt(Document::getPriority)
										   .max()
										   .orElseThrow();
				
				if(queue.peek().getPriority() == maxPri) {
					count++;
					if(queue.poll().getIndex() == M) {
						
						builder.append(count + " ");
					}
				}else {
					Document doc = queue.poll();
					queue.add(doc);
				}
				
			}// 큐가 빌때까지 반복
			
		}//테스트 케이스 종료
		
		tokenizer = new StringTokenizer(builder.toString(), " ");
		
		while (tokenizer.hasMoreElements()) {
			writer.write(tokenizer.nextToken());
			writer.flush();
			if(tokenizer.hasMoreElements()) {
				writer.newLine();
			}
		}
		
		reader.close();
		writer.close();
		
	}//main

}//End of class
