import java.util.Arrays;

//h-index
public class S52 {
	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		System.out.println(solution(citations));
	}
	
	public static int solution(int[] citations) {
		int answer = 0;

        Arrays.sort(citations);

        for(int i=0;i<citations.length;i++) {
            if(citations[i] >= citations.length-i) {
                answer = citations.length-i;
                break;
            }
        }
        return answer;
    }
	
}
