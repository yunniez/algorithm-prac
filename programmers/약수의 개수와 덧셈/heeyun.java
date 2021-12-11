package Programmers;

public class S59 {
	public static void main(String[] args) {
		int left =13;
		int right = 17;
		System.out.println(solution(left, right));
	}
	
	public static int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left;i<=right;i++) {
            boolean flag = false;
        	for(int j=1;j<right;j++) {
        		if(i==(j*j)){
        			flag = true;
        			break;
        		}
        	}
        	
        	if(!flag) {
        		answer += i;
        	}else {
        		answer -= i;
        	}
        }
        
        
        return answer;
    }
	
	
}
