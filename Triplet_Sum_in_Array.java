import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    //Function to find if there exists a triplet in the
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) {
        Arrays.sort(A);
        int [] output =new int[3];
        int k;
        for(k =0;k<=A.length-1;k++){
            int i=k+1;
            int j =A.length-1;
            while(i<j){
                if(A[i]+A[j]+A[k]==X){
                    output[0]=A[k];
                    output[1]=A[i];
                    output[2]=A[j];
                    return true;

                }
                else if(A[i]+A[j]+A[k]>X){
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return false;
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
        boolean targetIndex = solution.find3Numbers(nums,size, target);
        System.out.println("Target value present at index: " + (targetIndex));
    }
}

