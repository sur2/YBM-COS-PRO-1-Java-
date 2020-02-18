package initial_code07;

class Solution{
    int solution(int[] prices){
        int INF = 1000000001;
        int tmp = INF;
        int answer = -INF;
        for(int price : prices){
            if(tmp != INF)
                answer = Math.max(answer, price - tmp);
            tmp = Math.min(tmp, price);
        }
        // price 1 // answer = -1000000001 // tmp = 1
        // price 2 // answer = 1 // tmp = 1
        // price 3 // answer = 2 // tmp = 1
        
        // price 3 // answer = -1000000001 // tmp = 3
        // price 1 // answer = -2 // tmp = 1
    
        return answer;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices1 = {1, 2, 3};
        int ret1 = sol.solution(prices1);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int[] prices2 = {3, 1};
        int ret2 = sol.solution(prices2);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}