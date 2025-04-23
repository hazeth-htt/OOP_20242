import java.util.Scaner;
import java.util.Scanner;
public class ex225 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so dau tien: ");
		String strnum1 = scanner.nextLine();
		System.out.print("Nhap so thu hai: ");
		String strnum2 = scanner.nextLine();
		
		double num1 = Double.parseDouble(strnum1);
		double num2 = Double.parseDouble(strnum2);
		
		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		
		System.out.println("Tong: " + sum);
		System.out.println("Hieu: " + difference);
		System.out.println("Nhan: " + product);
		
		if(num2 != 0)
		{
			double quotient = num1 / num2;
			System.out.println("Chia: " + quotient);
		}
		else
		{
			System.out.println("Division by zero is not allowed");
		}
		scanner.close();
	}
}
