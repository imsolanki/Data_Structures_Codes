class Solution {
    public int maxSubArray(int[] nums) {
                int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        if(nums.length==1){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            currSum=currSum+nums[i];
            currSum=Math.max(nums[i],currSum);
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }
        return maxSum;
    }
}