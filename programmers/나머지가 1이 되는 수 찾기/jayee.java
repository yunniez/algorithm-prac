public class 나머지가_1이_되는_수_찾기 {
    public static int solution(int n) {
        int answer = 1;

        while (n % answer != 1) {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10)); //3
        System.out.println(solution(12)); //11
    }
}
