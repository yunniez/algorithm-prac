package Programmers;

public class S48 {
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		System.out.println(solution(numbers,target));
	}
	
	
	public static int answer = 0;
    
	public static void dfs(int[] numbers, int target, int index){
		// base case:
		if(index == numbers.length){
			int sum = 0;
			for(int i=0; i<numbers.length; i++) 
				sum += numbers[i];

			answer += (sum == target) ? 1 : 0;  /* 합과 target이 같으면 +1 다르면 +0 */
			return;
		}

		dfs(numbers, target, index+1);	/* numbers배열 모두 사용할 때 까지 dfs 탐색 */
		numbers[index] *= -1;			/* 모두 사용 후 base case를 통해 함수 종료하고 전단계로 돌아가서 양수->음수, 음수->양수 */
		System.out.println("index : " + index);
		dfs(numbers, target, index+1);	/* 위에서 만든 음수로 다시 끝까지 dfs 탐색 */

	}
    
    public static int solution(int[] numbers, int target) {
        dfs(numbers, target, 0);
        return answer;
    }
	
}
