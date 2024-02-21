package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class SuffixArray_11656 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		//String S = "baekjoon";					// 입력받은 문자열
		String S = reader.readLine();
		
		String[] arr = new String[S.length()];	// 문자열의 길이크기의 배열
		
		
		for(int i = 0 ; S.length() > 0; i++) {

			arr[i] = S;
			S = S.substring(1);

		}
		
		Arrays.sort(arr);						// 배열안의 문자열 정렬
		
		for(int i = 0; i < arr.length; i++) {	// 배열의 요소 출력
			writer.write(arr[i]);
			writer.flush();
			writer.newLine();
		}
		
		reader.close();
		writer.close();
		
	}//main

}//End of class
