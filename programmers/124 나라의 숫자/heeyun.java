package Programmers;

import java.util.ArrayList;

public class S76 {
	public static void main(String[] args) {
		int n = 1;
		System.out.println("s : " + solution(n));
	}
	
	public static String solution(int n) {
		String answer = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(n > 0) {
        	if(n%3 == 0) {
        		list.add(0, 4);
        		n--;
        	}else {
        		list.add(0, n%3);
        	}

    		n /= 3;
        	for(int i : list) {
        		System.out.println(list);
        	}
        }
        
        for(int a : list) {
        	answer += (a + "");
        }
        return answer;
	}
}
