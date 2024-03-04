class Solution {
    public int removeElement(int[] nums, int val) {
        int countValue=0;
        int countNonValue=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[countNonValue]=nums[i];
                countNonValue+=1;
            }
            else{
                countValue+=1;
            }
        }
        return countNonValue;
    }
}