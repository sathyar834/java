import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		double radius = input.nextDouble();
		
		double area = 3.14*radius*radius;
		System.out.println(String.format("%.2f", area));
		
	}

}
