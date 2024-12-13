package miniprojectsprojects;

import java.util.Scanner;

public class CalculatorAccordingtoOperator {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			while(true)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number");
				int n1=sc.nextInt();
				System.out.println("choose operator : + ,- , *, /");
				
				char operators=sc.next().charAt(0);
				System.out.println("Enter the second number");
				int n2=sc.nextInt();
				int result=0;
				switch(operators)
				{
				case '+': 
					result=n1+n2;
					System.out.println(n1 + " + " + n2 + " = " + result);
					break;

				case '-':
					result=n1-n2;
					System.out.println(n1 + " - " + n2 + " = " + result);
					break;

				case '*':
					result=n1*n2;
					System.out.println(n1 + " * " + n2 + " = " + result);
					break;

				case '/':
					result=n1/n2;
					System.out.println(n1 + " / " + n2 + " = " + result);
					break;

				default: 
					System.out.println("Enter valid operator ");
					break;

				}
				System.out.println(result);
			}

		}

	}


