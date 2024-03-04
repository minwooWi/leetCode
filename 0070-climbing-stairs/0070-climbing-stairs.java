class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        int twoBefore = 1;
        int oneBefore = 2;
        
        for(int i = 3; i < n+1; i++){
            int total = twoBefore + oneBefore;
            twoBefore = oneBefore;
            oneBefore = total;
        }
        
        return oneBefore;
    }
}