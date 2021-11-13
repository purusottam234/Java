import java.util.Scanner;

public class InputTest{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is your Name?");
		String name = in.nextLine();
		System.out.println("Your Name is " +name);
	}
}