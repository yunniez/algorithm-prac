import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class S51 {
	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		System.out.println(Arrays.toString(solution(numbers)));
	}
	
	public static int[] solution(int[] numbers) {
        
		HashSet<Integer> sum = new HashSet<Integer>();
		
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				sum.add((numbers[i] + numbers[j]));
			}
		}
		
		Iterator<Integer> it = sum.iterator();
		ArrayList<Integer> list = new ArrayList<>();
		
		while(it.hasNext()) {
			list.add(it.next());
		}
		
		
		int[] answer = new int[sum.size()];
        
        for(int i=0;i<sum.size();i++) {
        	answer[i] = list.get(i);
        }

		Arrays.sort(answer);
        
        return answer;
    }
	}
