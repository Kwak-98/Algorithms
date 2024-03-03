package com.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Process {

	public static void main(String[] args) {

		int[] arr = {2, 1, 3, 2};
		Solution solution = new Solution();
		
		System.out.println(solution.solution(arr, 2));
		
	}//main

}//End of class

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

class Solution {
    public int solution(int[] priorities, int location) {
    	
    	int count = 0;		// 실행된 프로세스 수
    	int answer = 0;		// 원하는 index의 프로세스가 실행된 순서
    	
    	Queue<Document> queue = new LinkedList<>();
    	
    	for(int i = 0; i < priorities.length; i++) {
    		Document doc = new Document(i, priorities[i]);
    		queue.add(doc);
    	}
    	
    	while(!queue.isEmpty()) {
			
			int maxPri = queue.stream().mapToInt(Document::getPriority)
									   .max()
									   .orElseThrow();
			
			if(queue.peek().getPriority() == maxPri) {
				count++;
				if(queue.poll().getIndex() == location) {
					answer = count;
				}
			}else {
				Document doc = queue.poll();
				queue.add(doc);
			}
			
		}// 큐가 빌때까지 반복
    	
        return answer;
    }//solution()
    
}//End of Solution
