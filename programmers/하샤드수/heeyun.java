class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int temp = x;
        int sum = 0;
        
        while(x > 0) {
        	int left = x%10;
        	sum += left;
        	x = (x-left)/10;
        }
        
        if(temp%sum != 0) {
        	answer = false;
        }
        
        return answer;
    }
}
