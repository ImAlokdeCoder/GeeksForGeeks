//{ Driver Code Starts
// Initial Template for Java

import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
    int n = arr1.length;
    int m = arr2.length;
    int total = n + m;
    int mid = total / 2;

    int i = 0, j = 0, count = 0;
    int prev = 0, curr = 0;

    while (count <= mid) {
        if (i < n && (j >= m || arr1[i] < arr2[j])) {
            prev = curr;
            curr = arr1[i];
            i++;
        } else {
            prev = curr;
            curr = arr2[j];
            j++;
        }
        count++;
    }

    return prev + curr;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int res = ob.SumofMiddleElements(arr, brr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends