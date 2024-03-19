package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Resignation_14501 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer;
		
		int N = Integer.parseInt(reader.readLine());	// 퇴사일
		
		int[] day = new int[N];
		int[] pay = new int[N];
		int[] dp = new int[N + 1];
		
		for(int i = 0; i < N; i++) {
			
			tokenizer = new StringTokenizer(reader.readLine());
			
			day[i] = Integer.parseInt(tokenizer.nextToken());
			pay[i] = Integer.parseInt(tokenizer.nextToken());
		
		}	
			
		for (int i=0; i<N; i++) {
			if (i + day[i] <= N) {
				//날짜가 범위를 넘어가지 않는 경우
				dp[i + day[i]] = Math.max(dp[i + day[i]], dp[i] + pay[i]);
			}
			//현재 경우의 수가 0일 수 있기 때문에 이전의 최대값을 넣어줌.
			//해당 날짜에 일할 수 없다면, 이전까지 일한 최대 수당을 넣어주어야 한다.
			dp[i+1] = Math.max(dp[i+1], dp[i]);
		}
		System.out.println(dp[N]);
		
	}    
}//End of class