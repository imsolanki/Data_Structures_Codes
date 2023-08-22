class Solution {
    public void moveZeroes(int[] nums) {
        int countZero =0;
        int countNonZero=0;
        int end = nums.length-1;
        for(int i =0; i< nums.length;i++){
            if(nums[i]!=0){
                nums[countNonZero]=nums[i];
                countNonZero=countNonZero+1;
            }
            else if(nums[i]==0){
                countZero=countZero+1;
            }
        }
        for(int i = 0; i<countZero;i++){
            nums[end]=0;
            end--;
        }
    }
}