package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TurnTheArray_16926 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("시작");
		
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		
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
		
//		//테스트 케이스1
//		int N = 4;
//		int M = 4;
//		int R = 2;
//		
//		int[][] arr = { {1, 2, 3, 4},
//						{5, 6, 7, 8},
//						{9, 10, 11, 12},
//						{13, 14, 15, 16} };
		
		// 테스트 케이스2
		int N = 5;
		int M = 4;
		int R = 7;
		
		int[][] arr = { {1, 2, 3, 4},
					    {7, 8, 9, 10},
					    {13, 14, 15, 16},
				        {19, 20, 21, 22},
				        {25, 26, 27, 28} };
		
		// 2차원 배열과 회전수를 매개변수로
		// R번 반시계방향으로 회전
		arr = turnTheArray(arr, R);	
		
		
		// 배열 출력
		printArr(arr);
	
		
	}//main


	private static int[][] turnTheArray(int[][] arr, int R) {
		
		for(int k = 0; k < Math.min(arr.length, arr[0].length) / 2; k++) {	//레이어 수만큼 반복
			
			StringBuilder builder = new StringBuilder();
			
			for(int i = k; i < arr.length - k; i++) {						// 레이어의 왼쪽
				builder.append(arr[i][k] + ".");
			}
			for(int i = k + 1; i < arr[0].length - k; i++) {				// 레이어의 아래
				builder.append(arr[(arr.length - 1) - k][i] + ".");
			}
			
			for(int i = (arr.length - 1) - 1 - k; i >= k; i--) {			// 레이어의 오른쪽
				builder.append(arr[i][(arr[0].length - 1) - k] + ".");
			}
			
			for(int i = (arr[0].length - 1) - 1 - k; i > k; i--) {			// 레이어의 위
				builder.append(arr[k][i] + ".");
			}
			
			// 레이어를 '.'으로 연결된 문자열 builder 완료
			System.out.println(builder.toString());
			
			// 레이어 문자열을 회전시키는 메서드에 인자로 
			// 회전된 문자열을 tokenizer에 token화
			StringTokenizer tokenizer = new StringTokenizer(turnning(builder, R), ".");
			
			
			// 다시 레이어의 값에 tokenizer를 순차적으로 삽입
			for(int i = k; i < arr.length - k; i++) {						// 레이어의 왼쪽
				arr[i][k] = Integer.parseInt(tokenizer.nextToken());
			}
			for(int i = k + 1; i < arr[0].length - k; i++) {				// 레이어의 아래
				arr[(arr.length - 1) - k][i] = Integer.parseInt(tokenizer.nextToken());
			}
			
			for(int i = (arr.length - 1) - 1 - k; i >= k; i--) {			// 레이어의 오른쪽
				arr[i][(arr[0].length - 1) - k] = Integer.parseInt(tokenizer.nextToken());
			}
			
			for(int i = (arr[0].length - 1) - 1 - k; i > k; i--) {			// 레이어의 위
				arr[k][i] = Integer.parseInt(tokenizer.nextToken());
			}
			// 레이어의 개수만큼 루프 반복
		
		}// 루프 종료
		
		
		return arr;
	}//turnTheArray()
	
	
	
	 private static String turnning(StringBuilder builder, int R) {
		 
	        String[] arr = builder.toString().split("\\."); // 
	        int turnNum = R % arr.length;
	        int length = arr.length;
	        
	        if(turnNum == 0) {
	        	return builder.toString();
	        }
	        
	        // 뒤에서부터 n개의 값을 가져와서 새로운 문자열을 만듦
	        builder = new StringBuilder();
	        for (int i = length - turnNum; i < length; i++) {
	            builder.append(arr[i] + ".");
	        }
	        
	        for (int i = 0; i < length - turnNum; i++) {
	            builder.append(arr[i] + ".");
	        }
	        
	        System.out.println(builder.toString());
	        return builder.toString();
	 }//turnning()
	 
	 
	 
	 private static void printArr(int[][] arr) {
		 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = 0; j < arr[0].length; j++) {
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		 }
		 
	 }//printArr()

}//End of class
