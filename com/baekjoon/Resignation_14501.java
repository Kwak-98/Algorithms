package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Counsel {

	private int reqDay;
	private int pay;
	
	public Counsel(int reqDay, int pay) {
		this.reqDay = reqDay;
		this.pay = pay;
	}

	public int getReqDay() {
		return reqDay;
	}

	public int getPay() {
		return pay;
	}

	
}//End of counsel

public class Resignation_14501 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer;
		
		ArrayList<Counsel> list = new ArrayList<>();	// 상담일정
		ArrayList<Integer> payList = new ArrayList<>();	// 모든 가능한 수익
		
		int N = Integer.parseInt(reader.readLine());	// N일동안 상담
		
		for(int i = 1; i <= N; i++) {
			
			tokenizer = new StringTokenizer(reader.readLine());
			
			int reqDay = Integer.parseInt(tokenizer.nextToken());
			int pay = Integer.parseInt(tokenizer.nextToken());
			
			if(i + reqDay > N) {	// 퇴사이후까지 진행되는 상담은 제외
				continue;
			}
			
			list.add(new Counsel(reqDay, pay));
			
		}
		
		for(int i = 0; i < list.size(); i++) {
			
			int day = 1;
			 
			
			
		}
		
		
		
	}//main

}//End of class
