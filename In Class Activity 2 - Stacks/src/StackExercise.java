import java.util.Stack;

public class StackExercise {

    /*
    *
    * This method checks if a given string is a palindrome or not
    * Written by Christian Vasquez
    * Params: @String originalWord
     */
    public static Boolean isPalindrome(String originalWord) {
        boolean isPalindrome = false;                                       // return variable
        Stack<String> forwardsStack = new Stack<String>();                  // new stack
        for (int i = 0; i < originalWord.length(); i++) {                   // iterate through string and push onto stack
            char c = originalWord.toCharArray()[i];                         // take first letter of the string and put it in var c
            forwardsStack.push(String.valueOf(c));                          // push the letter from string onto the stack
        }
        for (int i = 0; i < forwardsStack.size(); i++) {                    // Loop through the stack
            String popped = forwardsStack.pop();                            // Pop top of stack
            String orig = String.valueOf(originalWord.toCharArray()[i]);    // Take first letter of string and put it in var orig
            if(popped.equals(orig)) {                                       // If the popped char (last char) is equal to var orig (first char)
                isPalindrome = true;                                        // Set isPalindrome to true
            }
        }
        System.out.printf("Is \"%s\" a palindrome? \nAnswer: %b\n", originalWord, isPalindrome);
        return isPalindrome;                                                // return
    } // method isPalindrome



    public static void main(String[] args){
        isPalindrome("racecar");
        isPalindrome("tacocat");
        isPalindrome("palindrome");
        isPalindrome("minimum");
    }


}