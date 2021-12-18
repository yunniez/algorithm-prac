class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split(" ", -1);
        
        for(int i=0;i<str.length;i++) {
            
        	for(int k=0;k<str[i].length();k++) {
        		String ans = str[i].substring(k, k+1);
        		if(k%2 == 0) {
        			answer += ans.toUpperCase();
        		}else{
        			answer += ans.toLowerCase();
        		}
        	}
        	if(i== str.length-1) break;
        	answer += " ";
        }
        
        
        return answer;
    }
}
