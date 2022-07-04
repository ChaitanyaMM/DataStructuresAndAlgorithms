package com.homework;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BattleShip {
	
	
	public int solution(String[] B) {
		int numBattleShips= 0;
		
//		for(int i =0) {
//			
//		}
//		
		
		
		return 0;
		
	}
	
	 
	
	
	public static void main(String[] args) {
		String B[] = {".#..#","#.#..","#...#","#.##."};
		
		 
 		
		method(B);
		
		
	
		
		
		
	}




	private static void method(String[] B) {
		
		int patrolShips =0;
		int submarines =0;
		int destroyers =0;
		
		char[][] ch = new char[B.length][];

        for (int i = 0; i < B.length; i++) {
        	ch[i] = B[i].toCharArray();
        }

       
        
        
        for(int i=0;i<ch.length;i++) {
        	for(int j=0;i<ch[i].length;j++) {
        		
        		
        		
        		if(ch[i][j] == '.') {
        			continue;
        		}

        		if(ch[i][j] == '#') {
        			continue;
        		}
        		
        	}
        }
        
	}

}
