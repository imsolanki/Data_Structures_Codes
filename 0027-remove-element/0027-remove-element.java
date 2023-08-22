class Solution {
    public int removeElement(int[] nums, int val) {
        int countOtherElement = 0;
        //int countValExist = 0;
        //3,2,2,3
        //2,2

        for(int i =0; i< nums.length;i++){
            if(nums[i]!=val){
                nums[countOtherElement]=nums[i];
                countOtherElement =countOtherElement+1;
            }

        }
        return countOtherElement;
    }
}