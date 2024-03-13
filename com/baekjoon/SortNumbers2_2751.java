package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class SortNumbers2_2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int N = Integer.parseInt(reader.readLine());	// 숫자의 개수
		
		for(int i = 0; i < N; i++) {
			String line = reader.readLine();
			list.add(Integer.parseInt(line));
		}
		
		
		
		
		writer.close();
		reader.close();
	}//main

}//End of class
