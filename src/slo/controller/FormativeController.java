package slo.controller;

import java.util.Scanner;

public class FormativeController
{
	private Scanner sloScanner;
	private int answer;
	private int userMultiply;
	private double userSubtract;
	private String userStar;
	
	public boolean booleanInt;
	public boolean booleanDouble;
	public boolean booleanString;
	
	public FormativeController()
	{
		sloScanner = new Scanner(System.in);
	}
	
	public void begin()
	{
		//Testing Int
		System.out.println("What is 2x2?");
		int userMultiply = sloScanner.nextInt();
		int answerInt = 2*2;
		
		if (userMultiply == answerInt)
		{
			booleanInt = true;
		}
		else
		{
			booleanInt = false;
		}

		//Testing Double
		System.out.println("What is 8.4 - 6?");
		double userSubtract = sloScanner.nextDouble();
		double answerDouble = 8.4-6;
		
		if (userSubtract == answerDouble)
		{
			booleanDouble = true;
		}
		else
		{
			booleanDouble = false;
		}
		
		//Testing String
		System.out.println("Are you a Star Wars fan?");
		String userStar = sloScanner.next();
		String answer = "Yes";
			
		if (userStar.equalsIgnoreCase(answer))
		{
			booleanString = true;
		}
		else
		{
			booleanString = false;
		}
	}
}
