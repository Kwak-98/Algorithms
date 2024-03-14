package com.baekjoon.stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AmultiflB {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = null;
		
		tokenizer = new StringTokenizer(reader.readLine());
		
		System.out.print(Integer.parseInt(tokenizer.nextToken()) * Integer.parseInt(tokenizer.nextToken()));
	}//main

}//End of class
