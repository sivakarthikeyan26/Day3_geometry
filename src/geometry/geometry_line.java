package geometry;

import java.util.Scanner;

public class geometry_line {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the x1 and y1 co-ordinates");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("enter the x2 and y2 co-ordinates");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.println("enter the x3 and y3 co-ordinates");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		System.out.println("enter the x4 and y4 co-ordinates");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		
		double distance = Math.sqrt(((x2 - x1) * (x2 - x1) ) + ((y2 - y1) *(y2 - y1)));
		double distance2 = Math.sqrt(((x4 - x3) * (x4 - x3) ) + ((y4 - y3) *(y4 - y3)));
		System.out.println("the length of the line1 is : " + distance);
		System.out.println("the length of the line2 is : " + distance2);
		if (distance == distance2) {
			System.out.println("The two lines are equal");
		}
		else {
			System.out.println("The two lines are not equal");
			}
		}
		

	}


