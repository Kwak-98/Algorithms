package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BlackJack_2798 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		
		final int N = Integer.parseInt(tokenizer.nextToken());	// 카드의 개수
		final int M = Integer.parseInt(tokenizer.nextToken());	// 블랙잭 규칙 숫자
		
		int[] card = new int[N];
		ArrayList<Integer> list = new ArrayList<>();	// 부루트포스로 모든 수의 합 저장
		
		tokenizer = new StringTokenizer(reader.readLine());
		
		for(int i = 0; i < N; i++) {	// 카드숫자가 들어있는 list
			card[i] = Integer.parseInt(tokenizer.nextToken());
		}
		
		for(int i = 0; i < card.length - 2; i++) {
			
			for(int j = i + 1; j < card.length - 1; j++) {
				
				for(int k = j + 1; k < card.length; k++) {
					list.add(card[i] + card[j] + card[k]);
				}
			}
		}
		
		int result = list.stream().mapToInt(Integer::intValue)
								  .filter(n -> n <= M)
								  .max()
								  .orElseThrow();
		
								  
		writer.write(result+"");
		
		writer.close();
		reader.close();
		
	}//main

}//End of class
