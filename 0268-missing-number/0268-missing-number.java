class Solution {
    public int missingNumber(int[] nums) { 
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                Swap(nums,i,correct);
            }
            else{
                 i++;
            }

        }

        for(int index = 0; index<nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
    void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}