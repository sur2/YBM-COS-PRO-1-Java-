package initial_code01;

class Solution {
	// 길이를 두 배로 늘려 같은 배열을 이어붙임
	int[] func_a(int[] arr) {
		int length = arr.length;
		int[] ret = new int[length * 2];
		for (int i = 0; i < length; i++)
			ret[i + length] = ret[i] = arr[i];
		return ret;
	}

	// 두 배열을 비교하면서 원자값을 카운트한다. 
	// 동일한 원자값을 가지고 있다면 카운트는 0이다.
	boolean func_b(int[] first, int[] second) {
		int[] counter = new int[1001];
		for (int i = 0; i < first.length; i++) {
			counter[first[i]]++;
			counter[second[i]]--;
		}
		for (int i = 0; i < 1001; i++)
			if (counter[i] != 0)
				return false;
		return true;
	}

	// first 배열을 순회하면서 second 배열과 같은 배열이 있는지 확인
	boolean func_c(int[] first, int[] second) {
		int length = second.length;
		for (int i = 0; i < length; i++) {
			int j;
			for (j = 0; j < length; j++)
				if (first[i + j] != second[j])
					break;
			if (j == length)
				return true;
		}
		return false;
	}

	public boolean solution(int[] arrA, int[] arrB) {
		if (arrA.length != arrB.length)
			return false;
		if (func_b(arrA, arrB)) {
			int[] arrAtemp = func_a(arrA);
			if (func_c(arrAtemp, arrB))
				return true;
		}
		return false;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arrA1 = { 1, 2, 3, 4 };
		int[] arrB1 = { 3, 4, 1, 2 };
		boolean ret1 = sol.solution(arrA1, arrB1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int[] arrA2 = { 1, 2, 3, 4 };
		int[] arrB2 = { 1, 4, 2, 3 };
		boolean ret2 = sol.solution(arrA2, arrB2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}