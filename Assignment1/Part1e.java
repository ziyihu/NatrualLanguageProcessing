package com.my.assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Part1e {

	public static void main(String[] args) {
		int count = 0;
		int unique = 0;
		float ratio = 0;
		LinkedHashMap<String,Integer> wordcount = new LinkedHashMap<String,Integer>();
		try{
			BufferedReader in = new BufferedReader(new FileReader("/Users/huziyi/Documents/NLP file/Assignment1/Twitter messages.txt"));
			String str;
			while((str = in.readLine())!=null){
				str = str.toLowerCase();
				String[] words = str.split("\\s+");
				for(String word:words){
					word = word.replaceAll("[^a-zA-Z]", "");
					if(word.length()==0){
						continue;
					}
					Integer number = wordcount.get(word);
					if(number == null){
						number = 1;
						unique++;
						count++;
					}
					else if(number == 1){
						number++;
						unique--;
						count++;
			
					}
					else{
						number++;
						count++;
					}
					wordcount.put(word, number);
				/*	if(word.equals("~") || word.equals("!") || word.equals("@")
							||word.equals("-") || word.equals("?") || word.equals("#")
							||word.equals("_") || word.equals("+") || word.equals("*")
							||word.equals(".") || word.equals(":") || word.equals(";")
							||word.equals("/") || word.equals("&") || word.equals("%")
							||word.equals("...") || word.equals("|") || word.equals("#")
							)
					{
					}else{
						wordcount.put(word, number);
						count++;
					}
				}
				*/
					
			}
			}
			ratio = (float)(unique)/(float)(count);
			System.out.println("the total number of word:"+count);
			System.out.println("the unique number of word:"+unique);
			System.out.println("the ratio is:"+ratio);
				
			
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		   ArrayList<Integer> values = new ArrayList<Integer>();
		    values.addAll(wordcount.values());

		    Collections.sort(values, Collections.reverseOrder());

		    int last_i = -1;

		    for (Integer i : values.subList(0, 99)) { 
		        if (last_i == i) 
		            continue;
		        last_i = i;




		            for (String s : wordcount.keySet()) { 

		            if (wordcount.get(s) == i)
		            
		            	System.out.println(s+ " " + i);

		            }
		    
			}
	}

}
