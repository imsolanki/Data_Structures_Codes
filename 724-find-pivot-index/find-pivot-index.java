class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int totalSum=0;
        for(int i =0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        for(int i =0;i<nums.length;i++){
            totalSum=totalSum-=nums[i];
            if(totalSum==leftSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}