import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    int reverseInGroups(int[] arr, int n, int k) {

        for(int i=0;i< arr.length;i=i+k){

            int low =i;
            int high = i+(k-1);
            if(high>arr.length-1){
                high =n-1;
            }

            while(low<high){
                int temp = arr[high];
                arr[high]= arr[low];
                arr[low]= temp;
                low++;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));

        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter the value of array index " + i);
            nums[i] = sc.nextInt();
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Enter Target: ");
        int target = sc.nextInt();
        Solution solution = new Solution();
        int targetIndex = solution.reverseInGroups(nums,size, target);
        System.out.println("Target value present at index: " + targetIndex);
    }
}
