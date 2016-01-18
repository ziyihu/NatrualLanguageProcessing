package com.my.NLP2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class elimrare {
	public static void main(String[] arg) throws FileNotFoundException{
		Set <String> stops = new HashSet<String>();
		Scanner sc = new Scanner(new File("/Users/huziyi/Documents/NLP Assignment/Assignment2/rare word.txt"));
		while(sc.hasNextLine()){
			stops.add(sc.nextLine());
		}
		sc.close();
		Scanner scTest = new Scanner(new File("/Users/huziyi/Documents/NLP Assignment/Assignment2/Saimadata.txt"));
		while(scTest.hasNext()){
			String word = scTest.next();
			word = word.toLowerCase();
			//word = word.replaceAll("[^a-zA-Z]", "");
            if(!stops.contains(word)){
                System.out.print(word);
                if(word.equals("',hp") || word.equals("',sd") ||
                   word.equals("',fr") || word.equals("',sp") ||
                   word.equals("',ne") || word.equals("',dg") ||
                   word.equals("',ag")){
                    
                }
                else{
                    System.out.print(" ");
                }
			if(word.equals("',hp") || word.equals("',sd") ||
			   word.equals("',fr") || word.equals("',sp") ||
			   word.equals("',ne") || word.equals("',dg") ||
			   word.equals("',ag")){
				System.out.println();
			}
				
			
		}
		scTest.close();
	}
}
