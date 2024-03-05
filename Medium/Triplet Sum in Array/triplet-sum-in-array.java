//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution ob=new Solution();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
        
       Arrays.sort(A);
       for(int i =0;i<n;i++){
           int start =i+1;
           int end=n-1;
           int remain= X-A[i];
           int[] remainLeft =new int[2];
           while(start<end){
               
               if(A[start]+A[end]<remain){
                   start++;
               }else if(A[start]+A[end]>remain){
                   end--;
               }
               else{
                   remainLeft[0]=A[start];
                   remainLeft[1]=A[end];
                   if(A[i]+remainLeft[0]+remainLeft[1]==X){
                        return true;
                    }
               }
           }
         
       }
       return false;
    
    }
}
