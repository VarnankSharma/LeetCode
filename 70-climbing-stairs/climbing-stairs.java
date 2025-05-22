class Solution {
    public int climbStairs(int n) {
        if(n<4){
            return n;
        }
            int x = 1;
            int y = 2;
            int z = 0;
            for(int i = 2; i < n; i++ ){
                z = x + y;
                x = y;
                y = z;

            }
            return z;
        
        
    }
}