package Programmers;

public class S66 {
	public static void main(String[] args) {
		String s = "one4seveneight";
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
        int answer = 0;
        
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] intNum = new String[10];
        
        for(int i=0;i<10;i++) {
        	intNum[i] = String.valueOf(i);
        }
        
        for(int i=0;i<nums.length;i++) {
        	if(s.contains(nums[i])) {
            	s = s.replaceAll(nums[i], intNum[i]);
            }else {
            	continue;
            }
            
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}
