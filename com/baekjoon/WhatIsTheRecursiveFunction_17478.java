package com.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class WhatIsTheRecursiveFunction_17478 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder builder = new StringBuilder();	// StringBuilder는 참조타입
		
		int N = Integer.parseInt(reader.readLine());	// 재귀횟수
		int count = 0;
		
		builder.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
		
		chatBot(builder, count, N);
		
		builder.deleteCharAt(builder.length() - 1);
		
		writer.write(builder.toString());
		
		reader.close();
		writer.close();
		
	}//main
	
	public static void chatBot(StringBuilder builder, int count, int N) {
		
		//String타입은 재귀메서드가 실행될 때마다 새롭게 생성되는것이 아닌
		//이미 있는 문자열의 주소값을 참조 -> String은 불변
		String line = "____";
        String answer = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
        String[] content = {
                "\"재귀함수가 뭔가요?\"\n",
                "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n",
                "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n",
                "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n",
                "라고 답변하였지.\n"
        };
			
        for(int i = 0; i < content.length; i++) {
        	
        	if(i == 1 && count == N) { 
        		builder.append(line.repeat(count)).append(answer);
        		builder.append(line.repeat(count)).append(content[4]);
				return;
			}
        	
        	if(i == content.length - 1) {
				chatBot(builder, count + 1, N);
			}
        	
        	builder.append(line.repeat(count)).append(content[i]);
        }
	}//chatBot()

}//End of class
