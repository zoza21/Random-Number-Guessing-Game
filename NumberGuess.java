/*
Simple guessing game using Java, implementing GUI.
The user has 5 guesses. 
The computer provides hints based on each guess.
Author: Zoe Arnold 
08092022
*/

import java.util.Scanner;
import javax.swing.*;

public class NumberGuess
{

public static void main(String[] args) 
{


//String variables for instructions, hints, win, lose and play again messages 
String intro = "Can you guess which number the computer is thinking.";
String inst = "You have 5 guesses.";
String enter = "Enter a positive number between 1 and 20"; 
String lower = "Your guess is lower than the computer's number. Try again.";
String higher = "Your guess is higher than the computer's number. Try again.";
String end = "You have exceeded 5 guesses. Game over.";
String win = "Great guess! You win!"; 

JOptionPane.showMessageDialog(null, intro);
JOptionPane.showMessageDialog(null, inst);
JOptionPane.showMessageDialog(null, enter);


int compNum, inputNum, playAgain, count;

compNum = (int)(Math.random() * 20 + 1);  //Computer number is a randomly generated int between 1-20
count = 1;
playAgain = 0;
inputNum = 0;

while (playAgain != -1)
	{
		for (int i = 0; i < 5; i++)
		{ 
			inputNum = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess:  "));
	
			if (inputNum < compNum) //if user input is lower than computer number
			{
				JOptionPane.showMessageDialog(null, lower);
				count++;
			}
	
			else if (inputNum > compNum) //if user input is higher than computer number
			{
				JOptionPane.showMessageDialog(null, higher);
				count++;
			}
	
			else if (inputNum == compNum) //if user input is equal to computer number, user wins. Offered option to play agian
			{
				JOptionPane.showMessageDialog(null, win);
				count =0;
				playAgain = Integer.parseInt(JOptionPane.showInputDialog("Would you like to play again? Enter 0 to play again or -1 to end the game."));
			}
		}
		
		//Instructions for user if they do not guess correct number. Option to play again
		JOptionPane.showMessageDialog(null, end);
		playAgain = Integer.parseInt(JOptionPane.showInputDialog("Would you like to play again? Enter 0 to play again or -1 to end the game."));
		
		}
	}
}

