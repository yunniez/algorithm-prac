package Programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class S82 {
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		System.out.println(solution(bridge_length, weight, truck_weights));
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        //최소 걸리는 시간을 따지기 위해 먼저 정렬
        Arrays.sort(truck_weights);
        
        //현재 다리 위에 올라가있는 트럭의 무게
    	int heavy = 0;
    	
        Queue<Integer> q = new LinkedList<Integer>();
        for(int tmp : truck_weights) {
        	while(true) {
        		if(q.isEmpty()) {
            		q.add(tmp);
            		answer++;
            		heavy += tmp;
            		break;
            	}else if(q.size() == bridge_length) {
            		heavy -= q.peek();
            		q.poll();
            	}else {
            		if(heavy + tmp > weight) {
            			answer++;
            			q.add(0);
    	        	}else {
    	        		q.add(tmp);
    	            	heavy += tmp;
    	            	answer++;
    	            	break;
    	        	}
            	}
        	}
        	System.out.println("heavy = " + heavy);
        	System.out.println("answer = " + answer);
            System.out.println("q = " + q);
        }
        
        return answer + bridge_length;
    }
	
	
}
