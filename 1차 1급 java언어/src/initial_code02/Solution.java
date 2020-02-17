package initial_code02;

//You may use import as below.
//import java.util.*;

class Solution {
	public int solution(int n) {
		// Write code here.
		int answer = 0;

		int array[][] = new int[n][n];
		
		int num = 0;
		
		int x = -1;
		int y = 0;
		
		int xm = n;
		int ym = n-1;
		
		int direct = 0;
		int xMove[] = {1, 0, -1, 0};
		int yMove[] = {0, 1, 0, -1};

		boolean ySwitch = false;
		
		while (xm != 0 ) {
			if (ySwitch) {
				for (int i = 0; i < ym; i++) {
					x += xMove[direct % 4];
					y += yMove[direct % 4];
					array[y][x] = ++num;
				}
				ym--;
				ySwitch = false;
			}
			// xSwitch
			else {
				for (int i = 0; i < xm; i++) {
					x += xMove[direct % 4];
					y += yMove[direct % 4];
					array[y][x] = ++num;
				}
				xm--;
				ySwitch = true;
			}
			direct++;
			
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < n; j++) {
//					System.out.print(array[i][j]+" ");
//				}
//				System.out.println();
//			}
		}
		
		for (int i = 0; i < n; i++) {
			answer += array[i][i];
		}
		return answer;
	}

	// The following is main method to output testcase.
	public static void main(String[] args) {
		Solution sol = new Solution();
		int n1 = 3;
		int ret1 = sol.solution(n1);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + ret1 + " .");

		int n2 = 2;
		int ret2 = sol.solution(n2);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + ret2 + " .");
	}
}
