package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class TurnTheArray_16926 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		
		// N x M 배열, 회전수 R
		int N = Integer.parseInt(tokenizer.nextToken());	
		int M = Integer.parseInt(tokenizer.nextToken());
		int R = Integer.parseInt(tokenizer.nextToken());
		
		// N과 M이 둘다 홀수 또는 짝수,홀수이면서 홀수가 더 작을경우 배열 회전 불가능
		
		int[][] arr = new int[N][M];
		
		// 배열의 요소 입력받기
		for(int i = 0; i < N; i++) {
			
			tokenizer = new StringTokenizer(reader.readLine());
			
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(tokenizer.nextToken());
				
			}
			
		}//입력받기 끝
		
//		// 테스트 케이스
//		int N = 5;
//		int M = 4;
//		int R = 7;
//		int[][] arr = {{1, 2, 3, 4},{7, 8, 9, 10,},{13, 14, 15, 16},{19, 20, 21, 22},{25, 26, 27, 28}};
		
		arr = turnTheArray(arr, R);	// 배열 R번 회전
		
		printArr(arr);				// 배열 출력
		
	}//main

	
	/**
	 * 배열을 R만큼 회전시키는 메서드
	 * @param arr	: 입력 2차원배열
	 * @param R		: 회전수
	 * @return		: 회전된 배열 반환
	 */
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
			
			StringTokenizer tokenizer = new StringTokenizer(turnning(builder, R), ".");		// 회전된 레이어 문자열
			
			
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
	
	
	/**
	 * 레이어 문자열 나눠서 회전수만큼 
	 * @param builder	: 레이어 문자열
	 * @param R			: 회전수
	 * @return			: 회전된 레이어 문자열
	 */
	 private static String turnning(StringBuilder builder, int R) {
		 
	        String[] arr = builder.toString().split("\\.");		// 
	        int turnNum = R % arr.length;						// 회전수 % 레이어요소의 개수 = 회전수
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
	        
	        return builder.toString();
	 }//turnning()
	 
	 
	 // 2차원 배열출력
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
