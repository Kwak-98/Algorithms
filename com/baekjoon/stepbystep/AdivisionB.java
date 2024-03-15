package com.baekjoon.stepbystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;

public class AdivisionB {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer tokenizer = null;
		
		tokenizer = new StringTokenizer(reader.readLine());
		
		BigDecimal A = new BigDecimal(tokenizer.nextToken());
		BigDecimal B = new BigDecimal(tokenizer.nextToken());
		
		if(B.equals(BigDecimal.ZERO)) {
			writer.write(A.toString());
		}else {
			writer.write(A.divide(B, MathContext.DECIMAL64).toString());
			
		}
		 
		writer.flush();
		
		writer.close();
		reader.close();
	}//main

}//End of class
