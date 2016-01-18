package com.my.NLP2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class getrareword {

	
		// TODO Auto-generated method stub
		public static class DeleteMinWords {
			 
		    private StringBuffer txtBuffer;
		    private File file;
		    private char[] chars;
		 
		    public DeleteMinWords(String filePath) {
		        chars = new char[1024];
		        file = new File(filePath);
		        txtBuffer = new StringBuffer();
		        readFileToBuffer(file);
		    }
		 
		    public StringBuffer readFileToBuffer(File file) {
		        StringBuffer buffer = new StringBuffer();
		        try {
		            FileReader reader = new FileReader(file);
		            while (reader.read(chars) != -1)
		                ;
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        return buffer.append(chars);
		    }
		 
		    
		    public Map<String, Integer> countWords(Map<String, Integer> map) throws IOException {
		    	
		    	BufferedReader in = new BufferedReader(new FileReader("/Users/huziyi/Documents/NLP Assignment/Assignment2/Saimadata.txt"));
				String str;
				int number = 0;
				int unique = 0;
				float ratio = 0;
				while((str = in.readLine())!=null){
					str = str.toLowerCase();
					String[] words = str.split("\\s+");
					
					for(String word:words){
						number++;
					}
					for( String word : words ) {
						word = word.replaceAll("[^a-zA-Z]", "");
						
				         if( word.length() == 0 ) {
				                continue; 
				              }

				              Integer occurences = map.get(word);

				              if( occurences == null) {
				                occurences = 1;
				                unique++;
								
				              } 
							  else {
				                occurences++;
				              }

				              map.put(word, occurences);
				            }
				}
				Iterator iter = map.entrySet().iterator();
				while(iter.hasNext()){
					Map.Entry entry = (Map.Entry) iter.next();
					//System.out.println(entry.getValue());
					int b = Integer.parseInt(String.valueOf(entry.getValue()));
					if(b ==1){
						System.out.println(entry.getKey());
					}
				//	System.out.println();
				//	System.out.println(entry.getValue());
					
					
				}
				
				return map;
		    }
		 
		    /*
		     
		    public List<String> getMinAppearWords(Map<String, Integer> map) {
		        List<String> list = new ArrayList<String>();
		        String temp = null;
		        int minNum = 1;
		        int tempNum = 1;
		        for (Iterator<String> iterator = map.keySet().iterator(); iterator
		                .hasNext();) {
		            temp = iterator.next();
		            tempNum = map.get(temp);
		            if (tempNum <= minNum) {
		                minNum = tempNum;
		            }
		        }
		        for (Iterator<String> it = map.keySet().iterator(); it.hasNext();) {
		            temp = it.next();
		            if (map.get(temp) == minNum) {
		                list.add(temp);
		            }
		        }
		        return list;
		    }
		    */
		 
		    /*
		     
		    /*
		    public void deleteMinWords(List<String> wordsList) {
		        char[] temp = new char[chars.length];
		        StringBuffer str = new StringBuffer();
		        int position = 0;
		        int start = 0;
		        int end = 0;
		        for (int i = 0; i < chars.length; i++) {
		            if (chars[i] != 32) {
		 
		                for (int j = i; j < chars.length; j++) {
		                    if (chars[j] == 32) {
		                        String strs = str.toString();
		                        for (int m = 0; m < wordsList.size(); m++) {
		                            if (wordsList.get(m).equals(strs)) {
		 
		                                end = j;
		                                for (start = i; start <= end; start++) {
		                                    chars[start] = 0;
		                                }
		                                break;
		                            }
		                        }
		 
		                        str.setLength(0);
		                        i = j;
		                        break;
		                    }
		                    str.append(chars[j]);
		                }
		 
		            }
		 
		        }
		        for (int i = 0; i < chars.length; i++) {
		            if (chars[i] != 0) {
		                temp[position] = chars[i];
		                position++;
		            }
		        }
		        txtBuffer.append(temp);
		    }
		 
		    public void pirntBuffer() {
		        System.out.println(txtBuffer.toString());
		    }
		 */
		    public static void main(String[] args) throws IOException {
		        DeleteMinWords words = new DeleteMinWords("/Users/huziyi/Documents/NLP Assignment/Assignment2/Saimadata.txt");
		        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		        List<String> deList = new ArrayList<String>();
		        words.countWords(map);
		    //    deList = words.getMinAppearWords(map);
		     //   words.deleteMinWords(deList);
		      //  words.pirntBuffer();
		    }
		 
		}
	}


