package task1;
import java.util.Scanner;
public class ArrayErrorCheck {
	public static void main(String[] args) {
		try
		{
			Scanner input=new Scanner(System.in);
			int[] Rarray = {10, 20, 30, 40,50,60,70,80,90};
			System.out.println("Enter Array Index ");
			int number=input.nextInt();
			System.out.println("Number at "+ number +"Index is "+ Rarray[number]);
		}
		catch(Exception ArrayIndexOutOfBoundsException)
		{
			System.out.println("array out of bound");
		}
		finally
		{
			System.out.println("Thank You Bye");
		}
	}

}
