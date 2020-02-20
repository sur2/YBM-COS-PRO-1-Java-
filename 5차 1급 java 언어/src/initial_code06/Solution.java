package initial_code06;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
	public String solution(String s1, String s2, int p, int q) {
		// 여기에 코드를 작성해주세요.
		String answer = "";

		int s1num = p_num(p, s1);
		int s2num = p_num(p, s2);

		int sum = s1num + s2num;
		System.out.println("총합: " + sum);

		int i = 0;
		while (true) {
			if (Math.pow(q, i) > sum) {
				System.out.println("도달: " + Math.pow(q, i - 1) + ", " + (i - 1) + "승");
				break;
			}
			i++;
		}

		for (int j = 0; j < i; j++) {
			if (sum > Math.pow(q, i - 1 - j)) {
				answer += sum / (int) Math.pow(q, i - 1 - j);
				sum %= Math.pow(q, i - 1 - j);
				System.out.println("나머지: "+sum + ", " + j);
			} else {
				answer += "0";
			}
		}
		return answer;
	}

	public int p_num(int p, String s) {
		int s1num = 0;
		int len = s.length();
		for (int i = 0; i < len; i++) {
			s1num += Integer.parseInt(s.substring(len - 1 - i, len - i)) * Math.pow(p, i);
		}
		System.out.println("p: " + s1num);
		return s1num;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s1 = new String("112001");
		String s2 = new String("12010");
		int p = 3;
		int q = 8;
		String ret = sol.solution(s1, s2, p, q);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}