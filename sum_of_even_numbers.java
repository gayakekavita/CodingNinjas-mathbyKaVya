import java.util.* ;
import java.io.*; 
public class Solution {
	public static long evenSumTillN(int n) {
		// Write your code here.
		long sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum += (long)i;
			}
		}
		return sum;
	}
}
