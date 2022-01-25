public class 콜라츠_추측 {
    public static int solution(int num) {
        int answer = 0;

        int i = 0;
        for (i = 0; i < 500; i++) {
            if (num == 1) break;

            if (num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
        }

        if(i >= 500) answer = -1;
        else answer = i;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6)); //8
        System.out.println(solution(16)); //4
        System.out.println(solution(626331)); //-1
    }
}
