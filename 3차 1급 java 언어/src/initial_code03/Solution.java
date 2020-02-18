package initial_code03;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
	public int solution(String[] bishops) {
		// 여기에 코드를 작성해주세요.
		int arr[][] = new int[8][8];

		for (int i = 0; i < bishops.length; i++) {
			int x = bishops[i].charAt(0) - 64 - 1;
			int y = bishops[i].charAt(1) - 48 - 1;
			arr[x][y] = 8;
			System.out.println(x + ", " + y);

			int xp = 1, yp = 1;
			while (x + xp < 8 && y + yp < 8) {
				arr[x + xp][y + yp] = 1;
				xp++;
				yp++;
			}
			
			xp = -1;
			yp = -1;
			while (x + xp > -1 && y + yp > -1) {
				arr[x + xp][y + yp] = 1;
				xp--;
				yp--;
			}

			xp = 1;
			yp = -1;
			while (x + xp < 8 && y + yp > -1) {
				arr[x + xp][y + yp] = 1;
				xp++;
				yp--;
			}

			xp = -1;
			yp = 1;
			while (x + xp > -1 && y + yp < 8) {
				arr[x + xp][y + yp] = 1;
				xp--;
				yp++;
			}
		}

		int answer = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 0) {
					answer++;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] bishops1 = { new String("D5") };
		int ret1 = sol.solution(bishops1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		String[] bishops2 = { new String("D5"), new String("E8"), new String("G2") };
		int ret2 = sol.solution(bishops2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}