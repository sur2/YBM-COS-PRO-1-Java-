package initial_code10;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
	public int solution(int a, int b) {
		// 여기에 코드를 작성해주세요.
		int answer = 0;
		
		// 제곱
		for (int i = a; i < b; i++) {
			for (int j = 0; j < b; j++) {
				if (Math.pow(j, 2) == i) {
					System.out.println(i + ", " + j);
					boolean check = false;
					for (int k = 2; k < j / 2 + 1; k++) {
						if (j % k == 0) {
							check = true;
						}
					}
					if (!check && j != 1) {
						System.out.println("소수: " + j);
						answer++;
					}
				}
			}
		}
		System.out.println("-------------------");
		// 세제곱
		for (int i = a; i < b; i++) {
			for (int j = 0; j < b; j++) {
				if (Math.pow(j, 3) == i) {
					System.out.println(i + ", " + j);
					boolean check = false;
					for (int k = 2; k < j / 2 + 1; k++) {
						if (j % k == 0) {
							check = true;
						}
					}
					if (!check && j != 1) {
						System.out.println("소수: " + j);
						answer++;
					}
				}
			}
		}
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution sol = new Solution();
		int a = 6;
		int b = 30;
		int ret = sol.solution(a, b);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}