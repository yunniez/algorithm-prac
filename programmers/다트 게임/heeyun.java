public class S72 {
	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		System.out.println(solution(dartResult));
	}

	public static int solution(String dartResult) {
		int answer = 0;
		
		String num = ""; 
		int[] score = new int[3];
		int idx = 0;
		
		for (int i=0; i<dartResult.length();i++) {
			switch (dartResult.charAt(i)) {
			case '*':
				score[idx-1] *= 2;
				if (idx>1)
					score[idx-2] *= 2;
				break;
			case '#':
				score[idx-1] *= -1;
				break;
			case 'S':
				score[idx] = Integer.parseInt(num);
				idx++;
				num = "";
				break;
			case 'D':
				score[idx] = (int) Math.pow(Integer.parseInt(num), 2);
				idx++;
				num = "";
				break;
			case 'T':
				score[idx] = (int) Math.pow(Integer.parseInt(num), 3);
				idx++;
				num = "";
				break;
			default:
				num += String.valueOf(dartResult.charAt(i));
				break;
			}
		}

		for (int i = 0; i < score.length; i++) {
			answer += score[i];
		}

		return answer;
	}
}
