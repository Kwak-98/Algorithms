package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SangGeunSTrip_9372 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder builder = new StringBuilder();
		StringTokenizer tokenizer;
		
		int T = Integer.parseInt(reader.readLine());
		
		for(int i = 0; i < T; i++) {
			
			tokenizer = new StringTokenizer(reader.readLine());
			
			int N = Integer.parseInt(tokenizer.nextToken());
			int M = Integer.parseInt(tokenizer.nextToken());
			HashSet<String> set = new HashSet<>();
			
			for(int j = 0; j < M; j++) {
				tokenizer = new StringTokenizer(reader.readLine());
				set.add(tokenizer.nextToken());
				set.add(tokenizer.nextToken());
			}
			builder.append(set.size() - 1).append("\n");
			
		}
		
		builder.deleteCharAt(builder.length() - 1);
		
		writer.write(builder.toString());
		writer.flush();
			
		writer.close();
		reader.close();
		
	}//main

}//End of class
