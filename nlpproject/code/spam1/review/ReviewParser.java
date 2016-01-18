package main.test.sm.nlp.spam.review;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import main.src.sm.nlp.spam.review.Review;
import main.src.sm.nlp.spam.xml.Feature;

//<member id> \t <product id> \t <date> \t <number of helpful feedbacks> \t <number of feedbacks>
// \t <rating> \t <title> \t <body>
public class ReviewParser {

	public static void main(String[] args) throws IOException {
		int a = 0;
		int b = 0;
		String line;
		File newfilename = new File("/Users/huziyi/Desktop/result.txt");
		Scanner read = new Scanner(new File("/Users/huziyi/Downloads/openion-spam-master/test_review.txt"));
		newfilename.delete();
		newfilename.createNewFile();
		BufferedWriter out = new BufferedWriter(new FileWriter(newfilename));
		Scanner sc = new Scanner(new File("/Users/huziyi/Downloads/openion-spam-master/test_review.txt"));
//		while(read.hasNext()){
//			line = read.nextLine();		
//			Review rev = Review.parseReviewFromText(line);
//			Feature feature = new Feature(rev);
			out.write("@relation spam");
			out.newLine();
			out.newLine();
			out.write("@attribute sentence string");
			out.newLine();
			out.write("@attribute category {spam, nonspam}");
			out.newLine();
			out.newLine();
			out.write("@data");
			out.newLine();
		while(sc.hasNextLine()){
			String sc1 = null;
			String sc2 = null;
			sc1 = sc.nextLine();
			Review rev = Review.parseReviewFromText(sc1);
			Feature feature = new Feature(rev);
			sc2 = sc1.replaceAll("'", "");
		//	sc.nextLine();
			if(feature.isSpam()){
				out.write("' "+sc2+" '"+",spam");
				out.newLine();
			//	System.out.println("' "+sc.nextLine()+" '"+"spam");
				a++;
			}else{
				out.write("' "+sc2+" '"+",nonspam");
				out.newLine();
			//	System.out.println("' "+sc.nextLine()+" '"+"nonspam");
				b++;
			}
			
		}
		
			//System.out.println(feature.isSpam());
		
		System.out.println("spam number:"+a);
		System.out.println("nonspam number:"+b);
	/*	String[] split = line.split("[\t]");
	
		String mem_id = split[0];
		String prod_id = split[1];
		String date = split[2];	// not going to use this
		int no_helpful_feedback = Integer.parseInt(split[3]);
		int no_feedback = Integer.parseInt(split[4]);
		double rating = Double.parseDouble(split[5]);
		String title = split[6].trim();
		String body = split[7].trim();
		
		Review review = new Review();
		review.content = body;
		review.title = title;
		review.review_rating = rating;
		review.no_feedback = no_feedback;
		review.no_helpful_feedback = no_helpful_feedback;
		
		review.product = new Product(prod_id, 0.0, "");
		review.reviewer = new Reviewer(mem_id, 0.0);
	*/
	}
}
