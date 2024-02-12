//Program to find whether a number is perfect, deficient or excessive (comparing the number to the sum of its factors).

import java.util.Scanner;

public class PerfectNum {
	public static void main(String args[]) {
		Scanner read=new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		int num=read.nextInt();
		read.close();
		if(num<1)
			System.out.println(num + " is not a natural number.");
		else
			findFactors(num);
	}
	
	public static void findFactors(int num) {
		int count=0;
		int half=num/2;
		int[] factors=new int[25];
		for(int i=2;i<=half;i++) {
			if(num%i==0) {
				factors[count]=i;
				count++;
			}
		}
		classify(factors,count,num);
	}
	
	public static void classify(int[] factors, int size, int num) {
		int sum=1;
		for(int i=0;i<size;i++) {
			sum=sum+factors[i];
		}
		if(num>sum) {
			System.out.print(num+">1");
			for(int i=0;i<size;i++)
				System.out.print("+"+factors[i]);
			System.out.print(", deficient");
		}
		else if(num==sum) {
			System.out.print(num+"=1");
			for(int i=0;i<size;i++)
				System.out.print("+"+factors[i]);
			System.out.print(", perfect");
		}
		else {
			System.out.print(num+"<1");
			for(int i=0;i<size;i++)
				System.out.print("+"+factors[i]);
			System.out.print(", excessive");
		}
	}
}
