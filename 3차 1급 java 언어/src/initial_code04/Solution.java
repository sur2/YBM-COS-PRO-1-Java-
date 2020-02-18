package initial_code04;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
	public int solution(String s1, String s2) {
		// 여기에 코드를 작성해주세요.
		int answer = 0;
		int s1len = s1.length();
		int s2len = s2.length();
		int minLen = Math.min(s1len, s2len);
		for (int i = 0; i < minLen; i++) {
//			System.out.println("s2:: " + s2.substring(s2len - 1 - i, s2len));
			if (s2.substring(s2len - 1 - i, s2len).equals(s1.substring(0, i + 1))) {
				System.out.println(s1.substring(0, i + 1));
				answer = i + 1;
			}
		}
		for (int i = 0; i < minLen; i++) {
			if (s1.substring(s1len - 1 - i, s1len).equals(s2.substring(0, i + 1))) {
				System.out.println(s2.substring(0, i + 1));
				if (i + 1 > answer) {
					answer = i + 1;
				}
			}
		}

		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s1 = new String("ababc");
		String s2 = new String("abcdab");
		int ret = sol.solution(s1, s2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}