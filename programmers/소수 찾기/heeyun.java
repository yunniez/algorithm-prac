
import java.util.Arrays;
class Solution {
    public int solution(int n) {
        int answer = 0;
		boolean[] arr = new boolean[n+1];
		Arrays.fill(arr , true);
        
		arr[0] = false;
		arr[1] = false;
		
		for(int i=2; i*i<n+1; i++){
			if(arr[i]){
				for(int j=i*i; j<n+1; j+=i) {
					arr[j] = false;                
				}
			}        
		}    
		for(int i=1; i<n+1 ;i++){
			if(arr[i]) answer++;        
		}
		
        return answer;
    }
}
