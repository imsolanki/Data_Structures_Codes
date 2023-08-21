class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        int[] output = new int[2];
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                output[0] = arr[i];
                output[1] = arr[j];
                break;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
        }


        for (i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == output[0]) {
                output[0] = i;
                break;
            }
        }
        for (i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == output[1]) {
                output[1] = i;
                break;
            }
        }
        return output;
    }
}