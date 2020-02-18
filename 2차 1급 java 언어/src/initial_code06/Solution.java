package initial_code06;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
	public int[] solution(String commands) {
		// 여기에 코드를 작성해주세요.
		// L : --x;
		// R : ++x;
		// U : ++y;
		// D : --y;
		int[] answer = {};
		answer = new int[2];
		answer[0] = 0; // x
		answer[1] = 0; // y
		for (int i = 0; i < commands.length(); i++) {
			switch (commands.charAt(i)) {
			case 'L':
				answer[0]--;
				break;
			case 'R':
				answer[0]++;
				break;
			case 'U':
				answer[1]++;
				break;
			case 'D':
				answer[1]--;
				break;
			}
		}
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution sol = new Solution();
		String commands = "URDDL";
		int[] ret = sol.solution(commands);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
	}
}
