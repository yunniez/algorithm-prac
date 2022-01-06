class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int limit = 1000000;
        
        for(int i=2;i<=limit;i++){
            if(n%i==1){
                answer = i;
                return i;
            }
        }
        return -1;
    }
}
