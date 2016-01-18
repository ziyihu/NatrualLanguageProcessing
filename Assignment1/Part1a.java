package com.my.assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Part1a {

	public static void main(String [] args) throws IOException{
		try{
			int a = 0;
			System.out.println("1.tokenizer all the corpus");
			System.out.println("2.tokenizer first 20 sentences");
			Scanner in1 = new Scanner(System.in);
			a = in1.nextInt();
			FileWriter writer;
			BufferedReader in = new BufferedReader(new FileReader("/Users/huziyi/Documents/NLP file/Assignment1/Twitter messages.txt"));
			String str;
			if(a == 2){
			
				for(int i=0;i<20;i++){
					str = in.readLine();
					String[] words = str.split("\\s+");
					for(String word: words){
						System.out.println(word);	
					}			
				}
			}
			else {
				while((str = in.readLine())!=null){
					String[] words = str.split("\\s+");
					for(String word:words){
						System.out.println(word);
				//		writer = new FileWriter("/Users/huziyi/Documents/NLP file/Assignment1/microblog2011_tokenizaed.txt");
				//		writer.write(word);
				//		writer.flush();
				//		writer.close();
					}
				}
			}
			
		}
		catch(Exception e){
			System.out.println(e);
			
		}
	}

}
