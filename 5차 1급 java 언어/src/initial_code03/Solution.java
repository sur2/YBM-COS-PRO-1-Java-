package initial_code03;

import java.util.*;

class Solution {
	// numbers 배열의 i와 j번 째 값을 서로 바꿈
	public void swap(int[] numbers, int i, int j) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
	}

    public int[] solution(int[] numbers) {
        int[] answer = {};
        // 1 2 3 4 5 6 7
        Arrays.sort(numbers);
        // [3] = 4
        int mid = (numbers.length - 1) / 2;
        // [3]과 [6]의 값을 서로 바꿈
        // 1 2 3 7 5 6 4
        swap(numbers, mid, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
        // [4]
        int left = mid + 1;
        System.out.println("left: "+left);
        // [5]
        int right = numbers.length - 2;
        System.out.println("right: "+right);
        while(left <= right) {
        	swap(numbers, left, right);
        	System.out.println(Arrays.toString(numbers));
        	left = left + 1;
        	right = right - 1;
        }

        answer = numbers;
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int[] numbers = {7, 3, 4, 1, 2, 5, 6};
    	int[] ret = sol.solution(numbers);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.print("solution 메소드의 반환 값은 {");
    	for(int i = 0; i < ret.length; i++) {
    		if(i != 0)
    			System.out.print(", ");
    		System.out.print(ret[i]);
    	}
    	System.out.println("} 입니다.");
    }
}