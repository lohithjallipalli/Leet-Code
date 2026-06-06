class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int leftsum = 0;
        for(int i=0;i<n;i++){
            ans[i] = leftsum;
            leftsum += nums[i];
        }

        int rightsum = 0;
        for( int i = n-1;i>=0;i--){
            ans[i] = Math.abs(ans[i] - rightsum);
            rightsum += nums[i];
        }
        return ans;
       
        }
        
    }
