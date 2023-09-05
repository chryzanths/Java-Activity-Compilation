
// by Chryzle Amualla

import java.util.Scanner;

public class PalindromeChecker
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Check if a word or phrase is a PALINDROME: ");
        String word = input.nextLine();

        String alteredWord = word.replaceAll(" ", "").replaceAll("[?.,!'’]", "").toLowerCase();

        String rotate = String.valueOf(new StringBuffer(alteredWord).reverse());

        if (alteredWord.equals(rotate)) {
            System.out.println("\n" + word + " is a PALINDROME");
        }
        else if (!alteredWord.equals(rotate)) {
            System.out.println("\n" + word + " is NOT a PALINDROME");
        }

    }
}

