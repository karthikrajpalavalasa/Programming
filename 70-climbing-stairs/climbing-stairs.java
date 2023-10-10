class Solution {
    static int[] dp=new int[46];
    
    public int climbStairs(int n) {
        if(n==1||n==2){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int rec1=climbStairs(n-1);
        dp[n-1]=rec1;
        int rec2=climbStairs(n-2);
        dp[n-2]=rec2;
        int ans=rec1+rec2;
        return ans;
        
    }
    
}