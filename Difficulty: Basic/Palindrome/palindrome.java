//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_palindrome(n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        if(n < 0 || (n != 0 && n%10 == 0)){
            return "No";
        }
        
        int reversed = 0;
        
        while(n > reversed){
            reversed = reversed*10 + n%10;
            n = n/10;
        }
        if(n == reversed || n == reversed/10){
            return "Yes";
        }
        return "No";
    }
}