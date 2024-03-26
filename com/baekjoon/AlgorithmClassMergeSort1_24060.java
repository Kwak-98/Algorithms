package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AlgorithmClassMergeSort1_24060 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer tokenizer;
		
		tokenizer = new StringTokenizer(reader.readLine());
		
		final int N = Integer.parseInt(tokenizer.nextToken());	//정수의 개수 
		final int K = Integer.parseInt(tokenizer.nextToken());	//원하는 수의 인덱스
		
		tokenizer = new StringTokenizer(reader.readLine());
		
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(tokenizer.nextToken());
		}
		
		mergeSort(A);
		
		
		writer.close();
		reader.close();
		
	}//main
	
	public static void mergeSort(int[] A) {
		int[] tmp = new int[A.length];
		mergeSort(A, tmp, 0, A.length - 1);
	}
	
	public static void mergeSort(int[] A, int[] tmp, int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(A, tmp, start, mid);
			mergeSort(A, tmp, mid + 1, end);
			merge(A, tmp, start, mid, end);
		}
	}//mergeSort()
	
	public static void merge(int[] A, int[] tmp, int start, int mid, int end) {
		int part1 = start;
		int part2 = mid + 1;
		int index = start;
		
		while(part1 <= mid && part2 <= end) {
			if(tmp[part1] <= tmp[part2]) {
				A[index] = tmp[part1];
				part1++;
			}else {
				A[index] = tmp[part2];
				part2++;
			}
			index++;
		}
		
		for(int i = 0; i <= mid - part1; i++) {
			A[index + i] = tmp[part1 + i];
		}
	}

}//End of class






















