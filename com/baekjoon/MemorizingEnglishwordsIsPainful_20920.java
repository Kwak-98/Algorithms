package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Word implements Comparable<Word>{
	
	private String content;
	private int count;
	
	public Word(String content, int index) {
		this.content = content;
		this.count = 1;
	}
	
	public String getContent() {
		return content;
	}

	public int getCount() {
		return count;
	}
	
	public void addCount() {
		this.count += 1;
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
	    		return this.getContent().compareTo(w.getContent());
	    	}
	    }
	}//compareTo()
	
}//End of Word

public class MemorizingEnglishwordsIsPainful_20920 {

	public static void main(String[] args) throws IOException {
	ArrayList<Word> list = new ArrayList<>();
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
		}else {
			boolean check = false;
			for (Word w : list) {
                if (w.getContent().equals(line)) {
                    w.addCount();
                    
                    check = true;	// 중복된 단어 등장
                    break;
                }
            }// 탐색 종료
			
			
			if (!check) {			// 처음있는 단어
		         list.add(new Word(line, i));
		     }
		}         
		
	}// 입력받기 종료
	
	list.stream().sorted()
				 .forEach(w -> builder.append(w.getContent() + "\n"));
	
	writer.write(builder.toString());
	writer.flush();
	
	reader.close();
	writer.close();
	
	}//main

}//End of class
