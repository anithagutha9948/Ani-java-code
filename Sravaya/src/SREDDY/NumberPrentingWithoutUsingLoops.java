package SREDDY;

import java.util.Scanner;

public class NumberPrentingWithoutUsingLoops {
	static int count=1;
	static void PrintNumbers(int n)
	{
		System.out.println(count);
		count++;
		if(count==n+1)
			return;
		PrintNumbers(n);
	}
		
	
public static void main(String[] args) {
	int num;
	Scanner in =new Scanner(System.in);
	System.out.println("Enter any Number 20 \n");
	num=in.nextInt();
	PrintNumbers(num);
	
	
	
}
}

