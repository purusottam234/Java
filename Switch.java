import java.util.Scanner;
class Switch{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Day: ");
    int day = sc.nextInt();
    
		switch(day){
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("wednesday");
			break;
			case 4:
			System.out.println("Thrusday");
			break;
			case 5:
			System.out.println("friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			 
			default:
			System.out.println("Sunday");

		}
	}
}