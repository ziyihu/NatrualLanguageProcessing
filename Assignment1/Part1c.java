package com.my.assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Part1c {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> wordcount = new LinkedHashMap<String,Integer>();
		try{
			BufferedReader in = new BufferedReader(new FileReader("/Users/huziyi/Documents/NLP file/Assignment1/Twitter messages.txt"));
			String str;
			while((str = in.readLine())!=null){
			//	str = str.toLowerCase();
				String[] words = str.split("\\s+");
				for(String word:words){
					if(word.length()==0){
						continue;
					}
					Integer number = wordcount.get(word);
					if(number == null){
						number = 1;
					}
					else{
						number++;
			
					}
					wordcount.put(word, number);
				}
				
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		   ArrayList<Integer> values = new ArrayList<Integer>();
		    values.addAll(wordcount.values());

		    Collections.sort(values, Collections.reverseOrder());

		    int last_i = -1;

		    for (Integer i : values.subList(0, 1000)) { 
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
