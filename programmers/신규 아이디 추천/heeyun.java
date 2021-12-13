class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase().replaceAll("[^a-z0-9._\\-]", "").replaceAll("[.]{2,}", ".")
        		.replaceAll("^[.]", "").replaceAll("[.]$", "");
        
        if(answer.length() == 0) {
        	answer += "a";
        }else if(answer.length() >= 16) {
        	answer = answer.substring(0,15).replaceAll("^[.]", "").replaceAll("[.]$", "");
        }
        
        while(answer.length() < 3) {
        	answer += answer.charAt(answer.length()-1);
        }
        
        return answer;
    }
}
