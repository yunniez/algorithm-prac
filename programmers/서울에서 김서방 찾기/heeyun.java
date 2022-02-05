package Programmers;

public class S_81 {
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		System.out.println(solution(seoul));
	}
	
	public static String solution(String[] seoul) {
        int cnt = 0;
        
        for(int i=0;i<seoul.length;i++) {
        	if(seoul[i].equals("Kim")) {
        		cnt = i;
        	}
        }
        
        return "김서방은 " + cnt + "에 있다.";
    }
}
