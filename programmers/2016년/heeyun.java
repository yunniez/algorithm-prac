class Solution {
    public String solution(int a, int b) {
        String answer = "";

        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] name = {"THU","FRI","SAT","SUN","MON","TUE","WED"};

        int sum = 0;
        for(int i=0;i<a-1;i++) {
            sum += days[i];
        }

        sum += b;

        answer = name[sum%7];

        return answer;
    }
}
