package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class TurnTheArray_16926 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("시작");
		
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		int temp = 0;	// 임시변수
//		
//		// N x M 배열, 회전수 R
//		int N = Integer.parseInt(tokenizer.nextToken());	
//		int M = Integer.parseInt(tokenizer.nextToken());
//		int R = Integer.parseInt(tokenizer.nextToken());
//		
//		// N과 M이 둘다 홀수 또는 짝수,홀수이면서 홀수가 더 작을경우 배열 회전 불가능
//		
//		int[][] arr = new int[N][M];
//		
//		// 배열의 요소 입력받기
//		for(int i = 0; i < N; i++) {
//			
//			tokenizer = new StringTokenizer(reader.readLine());
//			
//			for(int j = 0; j < M; j++) {
//				arr[i][j] = Integer.parseInt(tokenizer.nextToken());
//				
//			}
//			
//		}//입력받기 끝
		
		//테스트 케이스
		int N = 4;
		int M = 4;
		int R = 2;
		
		int temp = 0;
		
		int[][] arr = { {1, 2, 3, 4},
						{5, 6, 7, 8},
						{9, 10, 11, 12},
						{13, 14, 15, 16} };
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < M; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}//main

}//End of class
