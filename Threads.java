//Program to use threads in Java to find the square and cube of a randomly generated number.

import java.util.Scanner;
import java.util.Random;

class Square extends Thread {
	int x;
	Square(int n) {
		x=n;
	}
	public void run() {
		int sqr=x*x;
		System.out.println("Square of "+x+" = "+sqr);
	}
}

class Cube extends Thread {
	int x;
	Cube(int n) {
		x=n;
	}
	public void run() {
		int cub=x*x*x;
		System.out.println("Cube of "+x+" = "+cub);
	}
}

class Number extends Thread {
	public void run() {
		Random rand=new Random();
		for(int i=0;i<5;i++) {
			int r=rand.nextInt(100);
			Square s=new Square(r);
			Cube c=new Cube(r);
			s.start();
			c.start();
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class Threads {
	public static void main(String[] args) {
		Number n=new Number();
		n.start();
	}
}
