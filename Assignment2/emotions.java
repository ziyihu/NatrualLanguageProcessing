package com.my.NLP22;
import java.io.*;
import java.util.StringTokenizer;
//count emothions words
public class emotions {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader r1 = new BufferedReader(new FileReader("/Users/huziyi/Documents/NLP Assignment/Assignment2/eliminate.txt"));
        String line1 = "";
        
        while ((line1 = r1.readLine()) != null) {
            
            BufferedReader r = new BufferedReader(new FileReader("/Users/huziyi/Downloads/WordNetAffectEmotionLists/anger.txt"));
            String line = "";
            int count = 0;
            BufferedReader r11 = new BufferedReader(new FileReader("/Users/huziyi/Downloads/WordNetAffectEmotionLists/disgust.txt"));
            String line11 = "";
            int count1 = 0;
            BufferedReader r111 = new BufferedReader(new FileReader("/Users/huziyi/Downloads/WordNetAffectEmotionLists/fear.txt"));
            String line111 = "";
            int count11 = 0;
            BufferedReader r1111 = new BufferedReader(new FileReader("/Users/huziyi/Downloads/WordNetAffectEmotionLists/joy.txt"));
            String line1111 = "";
            int count111 = 0;
            BufferedReader r11111 = new BufferedReader(new FileReader("/Users/huziyi/Downloads/WordNetAffectEmotionLists/sadness.txt"));
            String line11111 = "";
            int count1111 = 0;
            BufferedReader r111111 = new BufferedReader(new FileReader("/Users/huziyi/Downloads/WordNetAffectEmotionLists/surprise.txt"));
            String line111111 = "";
            int count11111 = 0;
            
            while ((line = r.readLine()) != null) {
                // using string tokenizer for words in anger.txt
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    String word = st.nextToken();
                    if (line1.matches("(.*)" + word + "(.*)")) {
                        count++;
                    }
                    
                    while ((line11 = r11.readLine()) != null) {
                        // using string tokenizer for words in disgust.txt
                        StringTokenizer st1 = new StringTokenizer(line11);
                        while (st1.hasMoreTokens()) {
                            String word1 = st1.nextToken();
                            if (line1.matches("(.*)" + word1 + "(.*)")) {
                                count1++;
                            }
                            while ((line111 = r111.readLine()) != null) {
                                // using string tokenizer for words in fear.txt
                                StringTokenizer st11 = new StringTokenizer(line111);
                                while (st11.hasMoreTokens()) {
                                    String word11 = st11.nextToken();
                                    if (line1.matches("(.*)" + word11 + "(.*)")) {
                                        count11++;
                                    }
                                    while ((line1111 = r1111.readLine()) != null) {
                                        // using string tokenizer for words in joy.txt
                                        StringTokenizer st111 = new StringTokenizer(line1111);
                                        while (st111.hasMoreTokens()) {
                                            String word111 = st111.nextToken();
                                            if (line1.matches("(.*)" + word111 + "(.*)")) {
                                                count111++;
                                            }
                                            while ((line11111 = r11111.readLine()) != null) {
                                                // using string tokenizer for words in sadness.txt
                                                StringTokenizer st1111 = new StringTokenizer(line11111);
                                                while (st1111.hasMoreTokens()) {
                                                    String word1111 = st1111.nextToken();
                                                    if (line1.matches("(.*)" + word1111 + "(.*)")) {
                                                        count1111++;
                                                    }
                                                    while ((line111111 = r111111.readLine()) != null) {
                                                        // using string tokenizer for words in surprise.txt
                                                        StringTokenizer st11111 = new StringTokenizer(line111111);
                                                        while (st11111.hasMoreTokens()) {
                                                            String word11111 = st11111.nextToken();
                                                            if (line1.matches("(.*)" + word11111 + "(.*)")) {
                                                                count11111++;
                                                            }
                                                        }}
                                                }}
                                        }}
                                    
                                    
                                }		  }}}}
            }
            String[] str1 = line1.split(" '");
            String[] str = line1.split(",");
            System.out.println(str1[0]+" "+count+count1+count11+count111+count1111+count11111 +" ',"+
                               str[str.length-1]);
            r.close();
            r11.close();
            r111.close();
            r1111.close();
            r11111.close();
            r111111.close();
        }
        r1.close();
    }
}

