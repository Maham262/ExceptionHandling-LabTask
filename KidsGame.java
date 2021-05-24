package Task2;
import java.util.Scanner;
public class KidsGame 
{  public static void myMethod(int number1, int number2)throws  Exception
	{ 
		int divide;
		if(number2 ==0)
		throw new Exception("Arithematic Exception Occurred");
		else
			 divide = number1/number2;
		System.out.println("Division performed Answer is =" + divide);		
		}
    public static void main(String args[]) throws Exception{ 
	System.out.println("~~~~KIDS GAME~~~~ \nEnter TWo Input");
	Scanner input=new Scanner(System.in);
	int number1=input.nextInt();
	int number2=input.nextInt();

	myMethod(number1,number2);
	System.out.println("This is for github");
    	}
	}


