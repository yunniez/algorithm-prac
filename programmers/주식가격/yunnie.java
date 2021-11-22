package Programmers;

public class S50 {
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		System.out.println(solution(prices));
	}
	
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
	    
        for(int i=0;i<prices.length;i++) { 
            if(prices.length == i) { 
                answer[i] = 0;
            }else { 
                for(int j=i+1;j<prices.length;j++) { 
                    if(prices[i] > prices[j]) {
	                    answer[i]++; 
                        break; 
                    }else { answer[i]++; } 
                }
	        } 
        }
        
        return answer;
    }
	
}
