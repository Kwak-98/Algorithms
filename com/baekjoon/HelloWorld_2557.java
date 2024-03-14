package com.baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class HelloWorld_2557 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		writer.write("Hello World!");
		writer.flush();
		
		writer.close();
		
	}//main

}//End of class
