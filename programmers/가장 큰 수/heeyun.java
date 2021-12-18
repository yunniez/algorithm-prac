package Programmers;

import java.util.Arrays;

public class S61 {
	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
		System.out.println(solution(numbers));
	}
	
	public static String solution(int[] numbers) {
		String[] str = new String[numbers.length];
		
        for(int i=0;i<numbers.length;i++) {
        	str[i] = String.valueOf(numbers[i]);
        }

        String answer = "";
        
        System.out.println(Arrays.toString(str));
        //람다식 표기
        Arrays.sort(str, (str1, str2) -> ((str2+str1).compareTo(str1+str2)));
        System.out.println(Arrays.toString(str));
        
    	
    	if(str[0].startsWith("0")) { 
    		answer += "0";
    	} else {
    		for(int i=0; i<str.length; i++) {
    			answer += str[i];
    		}
    	}
        return answer;
    }
	
}
