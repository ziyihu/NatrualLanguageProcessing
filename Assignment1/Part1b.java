package com.my.assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Part1b {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> wordcount = new LinkedHashMap<String,Integer>();
		try{
			BufferedReader in = new BufferedReader(new FileReader("/Users/huziyi/Documents/NLP file/Assignment1/Twitter messages.txt"));
			String str;
			int number = 0;
			int unique = 0;
			float ratio = 0;
			while((str = in.readLine())!=null){
		//		str = str.toLowerCase();
				String[] words = str.split("\\s+");
				for(String word:words){
					number++;
				}
				for( String word : words ) {
			         if( word.length() == 0 ) {
			                continue; 
			              }

			              Integer occurences = wordcount.get(word);

			              if( occurences == null) {
			                occurences = 1;
			                unique++;
							
			              } 
						  else {
			                occurences++;
			              }

			              wordcount.put(word, occurences);
			            }

					
				
			}
			ratio = (float)(unique)/(float)(number);
			System.out.println("Number of tokens:"+number);
			System.out.println("Unique tokens:"+unique);
			System.out.println(unique+"/"+number+"="+ratio);
		}
			
		
		catch(Exception e){
			System.out.println(e);
		}
		
		}
	
}