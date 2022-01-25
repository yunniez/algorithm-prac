package Programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class S77 {
	public static void main(String[] args) {
		String[] id = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		System.out.println(solution(id, report, k));
	}
	
	
	
	
	
	public static int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];
		HashMap<String, Set<String>> reporterArr = new HashMap<String, Set<String>>();
		HashMap<String, Integer> singoArr = new HashMap<String, Integer>();
		
		for(String id : id_list) {
			singoArr.put(id, 0);
			reporterArr.put(id, new HashSet<String>());
		}
		
		for(String cur : report) {
			StringTokenizer st = new StringTokenizer(cur, " ");
			String reporter = st.nextToken();
			String singo = st.nextToken();
			if(reporterArr.get(reporter).add(singo)) {
				singoArr.put(singo, singoArr.get(singo));
			}
		}
		
		for(String cur : report) {
			StringTokenizer st = new StringTokenizer(cur, " ");
			String reporter = st.nextToken();
			String singo = st.nextToken();
			if(singoArr.get(singo) < k) {
				reporterArr.get(reporter).remove(singo);
			}
		}
		
		for(int i=0;i<id_list.length;i++) {
			answer[i] = reporterArr.get(id_list[i]).size();
		}
        return answer;
    }
    
}
