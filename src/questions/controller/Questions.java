package questions.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questions
{
	private Scanner questionScanner;
	private Scanner numberScanner;
	
	public Questions()
	{
		questionScanner = new Scanner(System.in);
		numberScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		askQuestionsGUI();
	}
	
	private void askQuestionsGUI()
	{
		JOptionPane.showMessageDialog(null, "Hello, World!");
		String answerGUI = JOptionPane.showInputDialog("What is your name?");
		answerGUI = JOptionPane.showInputDialog("Hi, " + answerGUI + ". How are you today?");
		answerGUI = JOptionPane.showInputDialog("Oh, you feel " + answerGUI + " today. What is your favorite Pokemon");
		answerGUI = JOptionPane.showInputDialog(answerGUI + " is a great Pokemon. What is your favorite color");
		if(answerGUI.equalsIgnoreCase("green"))
		{
			JOptionPane.showMessageDialog(null, "Andrew's favorite color is green too!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Ok, " + answerGUI + " is a nice color.");
		}
	}
	
	private void numberQuestions()
	{
		System.out.println("Type a number.");
		int va = numberScanner.nextInt();
		System.out.println("Type another number");
		int vb = numberScanner.nextInt();
		System.out.println( va + " + " + vb + " = " + (va + vb));
	}

	private void askQuestions()
	{
		System.out.println("What is your name?");
		String answer = questionScanner.next();
		System.out.println("Why, hello there " + answer + ". How are you today?");
		answer = questionScanner.next();
		System.out.println("you feel like " + answer + ", uhh that's nice... quietly leaving the room.");
		System.out.println("JK :D (I cant leave the room). Now, What is your favorite pokemon?");
		answer = questionScanner.next();
		System.out.println("Your favorite Pokemon is " + answer + "! I like that pokemon too.");
		System.out.println("What would you like to do? (verb)"); 
		answer = questionScanner.next();
		System.out.println("Um... I don't feel like " + answer + "ing Today. What is your favorite color");
		answer = questionScanner.next();
		if(answer.equalsIgnoreCase("why"))
		{
			System.out.println("Don't leave me!!!");
		}
		else
		{
			System.out.println("ok");
		}
	}
	
}
