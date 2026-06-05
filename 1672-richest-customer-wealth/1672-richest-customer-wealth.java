class Solution {
    public int maximumWealth(int[][] accounts) {
         int ans = Integer.MIN_VALUE;
             for (int[] ints : accounts) {//person = rows,accounts=col
                   int sum = 0;
                   for (int account = 0; account < ints.length; account++) {
                       sum += ints[account];//this will count the sum of wealth in each account
                   }
            if(sum > ans){
                ans = sum;
            }
        }return ans;
        
    }
}