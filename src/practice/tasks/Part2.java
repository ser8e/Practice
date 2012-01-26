package practice.tasks;

public class Part2 {

	public static int getSquaresFromRectangle7(int a, int b) {
		return b/a;
	}

	public static int getSum19(int number) {
		int a = number%10;
		int b = (number%100)/10;
		int c = (number%1000)/100;
		int d = number/1000;
		return a+b+c+d;
	}

	public static int getProduct19(int number) {
		int a = number%10;
		int b = (number%100)/10;
		int c = (number%1000)/100;
		int d = number/1000;
		return a*b*c*d;
	}

	public static double convertTimeToAngle(int hour, int minute, int second) {
		return (hour/12.0 + minute/720.0 + second/43200.0)*360;
	}	
}
