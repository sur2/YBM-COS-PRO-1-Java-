package initial_code03;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
	boolean[] check;
	List<Integer> temp;
	int result;
	public int solution(int[] arr, int K) {
		// 여기에 코드를 작성해주세요.
		int answer = 0;
		check = new boolean[arr.length];
		temp = new LinkedList<>();
		result = Integer.MAX_VALUE;
		recursive(arr, K, 0);
		answer = result;
		return answer;
	}

	public void recursive(int[] arr, int k, int level) {
		if (level == k) {
			System.out.println(temp);
			if (result > cal(k)) {
				result = cal(k);
			}
			
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (!check[i]) {
				check[i] = true;
				temp.add(arr[i]);
				recursive(arr, k, level + 1);
				temp.remove(temp.size()-1);
				check[i] = false;
			}
		}
	}
	
	public int cal(int k) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		for (int i = 0; i < k; i++) {
			int num = temp.get(i);
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		return max - min;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = { 9, 11, 9, 6, 4, 19 };
		int K = 4;
		int ret = sol.solution(arr, K);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
	}
}
