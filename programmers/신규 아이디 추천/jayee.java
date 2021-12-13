public class 신규_아이디_추천 {
    public static String solution(String new_id) {
        String answer = new_id;

        //1단계: 모든 대문자를 대응되는 소문자로 치환
        answer = new_id.toLowerCase();

        //2단계: 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자 제거
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        //3단계: 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        answer = answer.replaceAll("[.]{2,}", ".");

        //4단계: 마침표(.)가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^[.]", "");
        answer = answer.replaceAll("[.]$", "");

        //5단계: 빈문자열이라면 "a" 대입
        if(answer.isEmpty()) answer = "a";

        //6단계: 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        //      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }

        //7단계: new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if (answer.length() <= 2) {
            String last = answer.substring(answer.length() - 1);
            while (answer.length() < 3) {
                answer += last;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm")); //bat.y.abcdefghi
        System.out.println(solution("z-+.^.")); // "z--"
        System.out.println(solution("=.=")); // "aaa"
        System.out.println(solution("123_.def")); //"123_.def"
        System.out.println(solution("abcdefghijklmn.p")); //"abcdefghijklmn"
    }
}
