package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Word implements Comparable<Word>{
	
	private String content;
	private int count;
	
	public Word(String content, int count) {
		this.content = content;
		this.count = count;
	}
	
	public String getContent() {
		return content;
	}

	public int getCount() {
		return count;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public int compareTo(Word w) {
	    int compare = Integer.compare(w.getCount(), this.getCount());	// 등장횟수에 따라 정렬
	    
	    if (compare != 0) {	// 등장횟수가 다르면 많이 등장한 단어순으로 
	        return compare;
	    } else {			// 등장 횟수가 같으면 길이 순서대로
	    	compare = Integer.compare(w.getContent().length(), this.getContent().length());
	    	
	    	if(compare != 0) {
	    		return compare;
	    	}else {
	    		return this.getContent().compareTo(w.getContent());	// 길이가 같으면 알파벳순으로
	    	}
	    }
	}//compareTo()
	
}//End of Word

public class MemorizingEnglishwordsIsPainful_20920 {

	public static void main(String[] args) throws IOException {
		
	HashMap<String, Integer> map = new HashMap<>();
	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder builder = new StringBuilder();
	StringTokenizer tokenizer = null;
	
	tokenizer = new StringTokenizer(reader.readLine());
	
	int N = Integer.parseInt(tokenizer.nextToken());	// 단어의 개수
	int M = Integer.parseInt(tokenizer.nextToken());	// 단어의 길이 기준
	
	for(int i = 0; i < N; i++) {
		String line = reader.readLine();
		
		if(line.length() < M) {	// 무시할 단어 무시
			continue;
		}
		
		if(map.containsKey(line)) {
            map.put(line, map.get(line) + 1);	// 이미 있는단어면 횟수 + 1
        } else {
            map.put(line, 1);					// 없으면 횟수1
        }
		
	}// 입력받기 종료
	
	PriorityQueue<Word> pQue = new PriorityQueue<>();	// 우선순위 큐
	
	for(Map.Entry<String, Integer> word : map.entrySet()) {	// 우선순위 큐에 Word객체
		pQue.add(new Word(word.getKey(), word.getValue()));
	}
	
	while (!pQue.isEmpty()) {
        builder.append(pQue.poll().getContent() + "\n");
    }
	
	builder.deleteCharAt(builder.length() - 1);
	
	writer.write(builder.toString());
	writer.flush();
	
	reader.close();
	writer.close();
	
	}//main

}//End of class
