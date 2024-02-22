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
		
		//테스트 케이스1
		int N = 4;
		int M = 4;
		int R = 2;
		
		int[][] arr = { {1, 2, 3, 4},
						{5, 6, 7, 8},
						{9, 10, 11, 12},
						{13, 14, 15, 16} };
		
//		// 테스트 케이스2
//		int N = 5;
//		int M = 4;
//		int R = 7;
//		
//		int[][] arr = { {1, 2, 3, 4},
//					    {7, 8, 9, 10},
//					    {13, 14, 15, 16},
//				        {19, 20, 21, 22},
//				        {25, 26, 27, 28} };
//		for(int i = 0; i < N; i++) {
//			
//			for(int j = 0; j < M; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int k = 0; k < Math.min(N, M) / 2; k++) {
			
			String layor = "";
			
			for(int i = k; i < arr.length - k; i++) {
				layor += arr[i][k] + " ";
			}
			for(int i = k + 1; i < arr[0].length - k; i++) {
				layor += arr[(arr.length - 1) - k][i] + " ";;
			}
			
			for(int i = (arr.length - 1) - 1 - k; i >= k; i--) {
				layor += arr[i][(arr[0].length - 1) - k] + " ";;
			}
			
			for(int i = (arr[0].length - 1) - 1 - k; i > k; i--) {
				layor += arr[k][i] + " ";;
			}
			
			System.out.println(layor);
			
			// 레이어를 회전 시킨다 -> 문자열의 위치만 수정
			// 수정된 레이어를 배열의 위치에 그대로 넣는다
			// 레이어의 개수만큼 반복
			// 끝
		}
	
		
	}//main

}//End of class
