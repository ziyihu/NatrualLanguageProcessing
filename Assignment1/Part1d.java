package com.my.assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Part1d {

	public static void main(String[] args) {
		int count = 0;
		LinkedHashMap<String,Integer> wordcount = new LinkedHashMap<String,Integer>();
		try{
			BufferedReader in = new BufferedReader(new FileReader("/Users/huziyi/Documents/NLP file/Assignment1/Twitter messages.txt"));
			String str;
			while((str = in.readLine())!=null){
		//		str = str.toLowerCase();
				String[] words = str.split("\\s+");
				for(String word:words){
					if(word.length()==0){
						continue;
					}
					Integer number = wordcount.get(word);
					if(number == null){
						number = 1;
						count ++;
					}
					else if(number == 1){
						number++;
						count --;
					}
					else{
						number++;
					}
					wordcount.put(word, number);
				}
				
			}
			System.out.println("the number of tokens appeared only once:"+count);
		}
		
		 
		catch(Exception e){
			System.out.println(e);
		}
		
		   
	}
}
