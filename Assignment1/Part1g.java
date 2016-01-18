package com.my.assignment1;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Part1g {

	public static void main(String[] args) {
	//	int count = 0;
		int[] i = new int[100];
		int unique = 0;
		float ratio = 0;
		List<String> inputWords = new ArrayList<String>();
		Map<String,List<String>> wordcount = new HashMap<String,List<String>>();
		try{
			BufferedReader in = new BufferedReader(new FileReader("/Users/huziyi/Documents/NLP file/Assignment1/Twitter messages.txt"));
			String str;
			while((str = in.readLine())!=null){
				str = str.toLowerCase();
				
				String[] words = str.split("\\s+");
				
			//	System.out.println(words);
			//	System.out.println("1");
				for(String word:words){
					
			//		String word = new String();
					
					word = word.replaceAll("[^a-zA-Z]", "");
					inputWords.add(word);
					
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		for(int k=0;k<inputWords.size()-1;k++){
			String thisWord = inputWords.get(k);
			String nextWord = inputWords.get(k+1);
			if(!wordcount.containsKey(thisWord)){
				wordcount.put(thisWord, new ArrayList<String>());
			}
			wordcount.get(thisWord).add(nextWord);
		}
		 for(Entry e : wordcount.entrySet()){
	//            System.out.println(e.getKey());
		Map<String, Integer>count = new HashMap<String, Integer>();
        List<String>words = (List)e.getValue();
        for(String s : words){
            if(!count.containsKey(s)){
                count.put(s, 1);
            }
            else{
                count.put(s, count.get(s) + 1);
            }
        }
    	
       // for(Entry e1 : wordcount.entrySet()){
        for(Entry f : count.entrySet()){
        
       // 	int m = 0;
        //	int[] i = new int[100];
        //	i[m] = (Integer) f.getValue();
        	int n = (Integer) f.getValue();
        	n = (Integer) f.getValue();
       // 	List<String> values = new ArrayList<String>();
 		//    values.addAll(count.g());
        	if(n>=120){
        	if(!(e.getKey().equals(""))&&!(f.getKey().equals(""))){
        //		 int a =  (Integer) f.getValue();
        //		 Arrays.sort(a);
            System.out.println(e.getKey()+" "+f.getKey() + " : " + f.getValue());
        
        	}
        	}
        //	m++;
        	 }
		 }
		 
	
		 
		// Arrays.sort(i);
		 //System.out.println(i[0]+i[1]);
/*
		   ArrayList<String> values = new ArrayList<String>();
		    values.addAll(count.values());

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
		    
			}*/
	}
	}

