//Program for finding the Euclidean distance between two points on a Cartesian plane.

import java.util.Scanner;

public class SqrtDistance {
	int x;
	int y;
	
	SqrtDistance(int x1, int y1){
		x=x1;
		y=y1;
	}
	
	public void translate(int dx, int dy) {
		x=x+dx;
		y=y+dy;
	}
	
	public double distance(SqrtDistance p) {
		return Math.sqrt(x*x-2*x*p.x+p.x*p.x + y*y-2*y*p.y+p.y*p.y);
	}
	
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Give the coordinates of first point.");
		int a=read.nextInt();
		int b=read.nextInt();
		Sqrt p1 = new SqrtDistance(a,b);
		System.out.println("Give the coordinates of second point.");
		int c=read.nextInt();
		int d=read.nextInt();
		Sqrt p2 = new SqrtDistance(c,d);
		double dist = p1.distance(p2);
		System.out.printf("Distance between given points is %.2f", dist);
	}
}
