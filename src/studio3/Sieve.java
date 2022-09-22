package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter the Number To Be Sieved");
		int n = in.nextInt();
		int[] primeCheck = new int[n];
		for (int i=2;i<=primeCheck.length-1;i++)
		{ 
			primeCheck[i] = i;
			if (primeCheck[i]%2!=0||primeCheck[i]==2)
			{
				if (primeCheck[i]%3!=0||primeCheck[i]==3)
				{
					if (primeCheck[i]%5!=0||primeCheck[i]==5)
					{
						if (primeCheck[i]%7!=0||primeCheck[i]==7)
						{
							System.out.println(primeCheck[i]);
						}
					}
				}
			}
		}
}}
