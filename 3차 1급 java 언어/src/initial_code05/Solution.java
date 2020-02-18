package initial_code05;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
	public String solution(String phrases, int second) {
		// 여기에 코드를 작성해주세요.
		String answer = "";
		String temp = "";
		int len = phrases.length();
		int dou = len * 2;
		int ss = second%dou;
		if (ss < len + 1) {
			for (int i = 0; i < len - ss; i++) {
				temp += "_";
			}
			answer = temp + phrases.substring(0, ss);
		} else {
			for (int i = 0; i < dou - ss; i++) {
				temp += "_";
			}
			answer = phrases.substring(ss - len ,len) + temp;
		}
		System.out.println("길이 : " + answer.length());
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution sol = new Solution();
		String phrases = new String("happy-birthday");
		int second = 0;
		String ret = sol.solution(phrases, second);
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}