package com.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Balloons {
	
	
	 public static int solution(String S) {
		    Map<Character, Long> textFrequencyMap = getFrequencyMap(S);
		    Map<Character, Long> ballonFrequencyMap = getFrequencyMap("BALLOON");
		    return ballonFrequencyMap.keySet().stream()
		        .map(k -> 
		            (int) (textFrequencyMap.getOrDefault(k, 0L) / ballonFrequencyMap.get(k)))
		        .min(Integer::compare)
		        .orElse(0);
		  }

		  private static Map<Character, Long> getFrequencyMap(String s) {
		    return s.chars()
		        .mapToObj(c -> (char) c)
		        .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
		  }
		  
		  
		  
		  public static void main(String[] args) {
			  String s ="BAONXXOLL";
			  String s1 ="BAOOLLNNOLOLGBAX";
			  String s2 ="QAWABAWONL";
			  String s3 ="ONLABLABLOON";
			  
			int result=  solution(s);
			System.out.println(result);
			  
			int result1=  solution(s1);
			System.out.println(result1);
			
			int resul2=  solution(s2);
			System.out.println(resul2);
			  
			int result3=  solution(s3);
			System.out.println(result3);
			
		}

}
