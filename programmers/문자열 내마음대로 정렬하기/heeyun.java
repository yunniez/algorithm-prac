import java.util.Arrays;

public class S68 {
	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 1;
		
		System.out.println(solution(strings, n));
	}
	
	public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] temp = new String[strings.length];
     
        for(int i=0;i<strings.length;i++) {
        	String str = strings[i].substring(n, n+1);
        	temp[i] = str + strings[i];
        }
        
        Arrays.sort(temp);
        
        for(int i=0;i<strings.length;i++) {
        	answer[i] = temp[i].substring(1);
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
}
