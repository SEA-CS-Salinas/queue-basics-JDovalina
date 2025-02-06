/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/


        // (c) A+ Computer Science
// www.apluscompsci.com

// Name - Jacob Dovalina

public class PalinListRunner
{
	public static void main ( String[] args )
	{
		// Test cases
		String[] testCases = {
			"one two three two one",
			"1 2 3 4 5 one two three four five",
			"a b c d e f g x y z g f h",
			"racecar is racecar",
			"1 2 3 a b c c b a 3 2 1",
			"chicken is a chicken"
		};

		for (String test : testCases) {
			PalinList palinList = new PalinList(test);
			System.out.println("[" + test + "] " + (palinList.isPalin() ? "is a palinlist." : "is not a palinlist."));
		}
	}
}

    

