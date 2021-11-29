package Programmers;

public class S53 {
	public static void main(String[] args) {
		int rows = 3;
		int columns = 3;
		int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		
		System.out.println(solution(rows, columns, queries));
		
	}
	
	public static int[] solution(int rows, int columns, int[][] queries) {
        
		int[][] origin = new int[rows][columns];
		int[] answer = new int[queries.length];
		int count = 1;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				origin[i][j] = count;
				count++;
			}
		}
		
		int x1 = 0;
		int x2 = 0; 
		int y1 = 0;
		int y2 = 0;

		for(int i=0;i<queries.length;i++) {
			x1 = queries[i][0]-1;
			y1 = queries[i][1]-1;
			x2 = queries[i][2]-1;
			y2 = queries[i][3]-1;
			
			int min = origin[x1][y1];
			int val = origin[x1][y1];
			
			//x가 이례적으로 세로축임 따라서 세로쪽부터
			for(int j=x1;j<x2;j++) {
				origin[j][y1] = origin[j+1][y1];
				min = Math.min(origin[j][y1], min);
			}
			
			for(int j=y1;j<y2;j++) {
				origin[x2][j] = origin[x2][j+1];
				min = Math.min(origin[x2][j], min);
			}
			
			for(int j=x2;j>x1;j--) {
				origin[j][y2] = origin[j-1][y2];
				min = Math.min(origin[j][y2], min);
			}
			
			for(int j=y2;j>y1;j--) {
				origin[x1][j] = origin[x1][j-1];
				min = Math.min(origin[x1][j], min);
			}
			
			origin[x1][y1+1] = val;
			answer[i] = min;
			
		}
		
		return answer;
		
    }
}
