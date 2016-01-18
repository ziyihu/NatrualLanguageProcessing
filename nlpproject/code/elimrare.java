package com.my.NLP2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class elimrare {
	public static void main(String[] arg) throws IOException {
		Set<String> stops = new HashSet<String>();
		File newfilename = new File(
				"/Users/huziyi/Desktop/nlp project/elimrare.txt");
		newfilename.delete();
		newfilename.createNewFile();
		BufferedWriter out = new BufferedWriter(new FileWriter(newfilename));
		Scanner sc = new Scanner(new File(
				"/Users/huziyi/Desktop/nlp project/rareword.txt"));
		while (sc.hasNextLine()) {
			stops.add(sc.nextLine());
		}
		sc.close();

		InputStreamReader reader = new InputStreamReader(
				new FileInputStream(
						new File(
								("/Users/huziyi/Desktop/nlp project/combine original data.arff"))));
		BufferedReader br = new BufferedReader(reader);

		String line = "";
		line = br.readLine().toLowerCase();

		while(line!=null)
		{
			String[] words = line.split(" ");

			int i;
			for (i = 0; i < words.length; i++) {
				if (!stops.contains(words[i])) {
					// System.out.print(word);
					out.write(words[i]);
					Pattern pattern = Pattern.compile("^',.*");
					Matcher matcher = pattern.matcher(words[i]);
					boolean b = matcher.matches();
					if (b) {
						System.out.println(1);
					} else {
						out.write(" ");
					}
					if (b) {
						out.newLine();
					}
				}
			}
			line = br.readLine().toLowerCase();
		}
		
		br.close();
		sc.close();
	}

}
