import java.util.Scanner;
public class InputFromKeyboard {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name");
		String strname = keyboard.nextLine();
		System.out.println("How old are you");
		int iage = keyboard.nextInt();
		System.out.println("How tall are you (m)");
		double dheight = keyboard.nextDouble();
		System.out.println("Mr/Ms. " + strname + ", " + iage + " years old. " + "your height is " + dheight + ".");
	}
}
