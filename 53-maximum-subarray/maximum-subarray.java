class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];
        
        for(int i=0; i<nums.length; i++){
            if(currSum < 0){
                currSum=0;
            }
            currSum = currSum+nums[i];
            maxSum = Math.max(currSum,maxSum);
        }
        
        return maxSum;
    }
}



 // max_sum = curr_sum = float('inf')

        // for num in nums:
        // if num > curr_sum and curr_sum < 0:
        // curr_sum = num

        // //-10 -> 20