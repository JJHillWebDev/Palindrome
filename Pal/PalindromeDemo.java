import java.util.*;

/**
    This class demonstrates how the the class ArrayStack (which implements the 
    StackInterface) can be used to check if a String is a palindrome.
 */
public class PalindromeDemo 
{
    /**
        Main method asks the user to enter a String. The method then checks
        to see if the String is the same going forwards and backswords, aka
        a palindrome. After checking the String, the method prints a whether 
        or not the String entered was a palindrome. 
        @param args Takes a String argument.
     */
    public static void main(String[] args) 
    {
        //prompt the user to enter a String
    	System.out.print("Please enter a string: ");
        //create a scanner object
        Scanner keyboard = new Scanner(System.in);
        //holds the String entered by the user and cenverts to all lowercase
        String userStr = keyboard.nextLine().toLowerCase();
        //holds the String in reverse
        String reverseStr = "";
        //creates an empty ArrayStack
        StackInterface<Character> stack = new ArrayStack<>();

        //traverses through the String storing the chars into the ArrayStack
        for (int i = 0; i < userStr.length(); i++) 
        {
            stack.push(userStr.charAt(i));
        }

        //pops the stack onto a String, creating the reversed String
        while (!stack.isEmpty()) 
        {
            reverseStr = reverseStr + stack.pop();
        }

        //checks if the entered String and reversed String are the same
        if (userStr.equals(reverseStr))
        {
            System.out.println("The String " + userStr +
            				   " is a palindrome.");
        }
        else
        {
            System.out.println("The String " + userStr +
            				   " is not a palindrome.");
        }
    }
}