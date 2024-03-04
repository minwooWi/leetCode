class Solution {
    public int climbStairs(int n) {
        // 풀이방법은 총3가지
        // 1. 재귀
        // 2. 해쉬테이블
        // 3. 변수선언O(1)

        // 2 : 2가지
        // 3 : 3가지
        // 4 : 5가지
        // 5 : 8가지

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int twoBefore = 1;
        int oneBefore = 2;

        for (int i = 3; i < n + 1; i++) {
            int total = oneBefore + twoBefore;
            twoBefore = oneBefore;
            oneBefore = total;
        }
        return oneBefore;
    }
}