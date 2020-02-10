package Epam_task_design_priciples.Simple_calc;
import java.util.Scanner;
public class CalculatorApplication extends Calculator
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		Calculator obj=new Calculator();
		while(true)
		{
			System.out.println("Enter the numbers to perform basic math operations like addition,subtraction,multiplication,division:");
			System.out.print("Enter number1:");
			a=sc.nextInt();
			System.out.println();
			System.out.print("Enter number2:");
			b=sc.nextInt();
			System.out.println();
			System.out.println("Choose the operation You want to perform 1.Add 2.Subtraction 3.Multiplication 4.Division 5.exit");
			int c=sc.nextInt();
			boolean flag=false;
			switch(c)
			{
			case 1:System.out.println("After performing addition the result is : "+a+" + "+b+" = "+obj.Addition(a, b));break;
			case 2:System.out.println("After performing Subtraction the result is : "+a+" - "+b+" = "+obj.Subtraction(a, b));break;
			case 3:System.out.println("After performing Multiplication the result is : "+a+" * "+b+" = "+obj.Multiplication(a, b));break;
			case 4:if(b==0) 
			        {
				    System.out.println("Division is not possible, as denominator is zero we wil get Divide by zero error");
				    break;
			        }
				     System.out.println("After performing Division the result is : "+a+" / "+b+" = "+obj.Division(a, b));break;
			default:System.out.println("You have entered an invalid option");flag=true;break;
			}
			if(flag)break;
		}
        
	}

}
