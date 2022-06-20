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
		double distance = Math.sqrt(((x2 - x1) * (x2 - x1) ) + ((y2 - y1) *(y2 - y1)));
		System.out.println("the length of the line is : " + distance);

	}

}
