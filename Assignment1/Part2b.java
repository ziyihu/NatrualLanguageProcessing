package test111;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Part2b {
		public static void main(String args[]) throws IOException{
			
		
		double equal = 0;
		double dif = 0;
		double ratio = 0;
		BufferedReader in1;
		BufferedReader in2;
		
		String str;
		String str1;
		 in1 = new BufferedReader(new FileReader("/Users/huziyi/Documents/NLP file/Assignment1/expected.txt"));
		 in2 = new BufferedReader(new FileReader("/Users/huziyi/Documents/NLP file/Assignment1/POS_results.txt"));
		while((str = in1.readLine())!=null && (str1 = in2.readLine())!=null ){
		//	str = str.toLowerCase();
		//	str1 = str1.toLowerCase();
			String[] words = str.split("\\s+");
			String[] words1 = str1.split("\\s+");
			int length = (words.length<words1.length)?words.length:words1.length;
			int i=0;
			
			while(i<length)
			{
				if(words[i].equals(words1[i]))
				{
					equal++;
				}
				else{
					dif++;
				}
				i++;
			}
		/*	if(word1.equals(word)){
				equal++;
			}
			else{
				dif++;
			}
				}
			}
		}*/
		
		}
		
		System.out.println("the number of the same: "+equal);
		System.out.println("the number of the different: "+dif);
		ratio = equal/(equal+dif);
	//	System.out.println();
		System.out.println("the accuracy: "+ratio);
		}
}
	


