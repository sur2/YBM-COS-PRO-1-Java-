package initial_code08;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
	List<String> list;

	public void recursive(int start, int[] card, boolean[] is_checked, String print) {
		if (start == card.length) {
			boolean s_switch = false;
			for (String num : list) {
				if (num.equals(print)) {
					s_switch = true;
				}
			}
			if (s_switch == false) {
				list.add(print);
			}
			return;
		}
		for (int i = 0; i < card.length; i++) {
			if (is_checked[i] == false) {
				is_checked[i] = true;
				String p = print;
				recursive(start + 1, card, is_checked, p + card[i]);
				is_checked[i] = false;
			}
		}
	}

	public int solution(int[] card, int n) {
		// 여기에 코드를 작성해주세요.
		boolean is_checked[] = new boolean[card.length];
		list = new LinkedList<String>();
		String p = "";
		recursive(0, card, is_checked, p);
		list.sort(new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.parseInt(o1) > Integer.parseInt(o2) ? 1 : -1;
			}
		});
		System.out.println("::" + list.toString());
		int i = 0;
		boolean s = false;
		for (String num : list) {
			i++;
			if (num.equals(n+"")) {
				s = true;
				System.out.println(i);
				break;
			}
		}
		int answer = 0;
		if (s) {
			answer = i;
		} else {
			answer = -1;
		}
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution sol = new Solution();
		int card1[] = { 1, 2, 1, 3 };
		int n1 = 1312;
		int ret1 = sol.solution(card1, n1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int card2[] = { 1, 1, 1, 2 };
		int n2 = 1122;
		int ret2 = sol.solution(card2, n2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}