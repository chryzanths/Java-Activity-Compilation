import java.util.Scanner;

public class LetterOccurenceCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter letter: ");
        String letter = input.nextLine();

        String alteredInput = sentence.replaceAll(" ", "").replaceAll("[?.,!'’]", "").toLowerCase();
        String[] splitInput = alteredInput.split("");


        int w = 0;
        int i = 0;
        while (i < splitInput.length) {
            {

                if (splitInput[i].equals(letter)) {
                    w++;
                    i++;
                }
                else if (!splitInput[i].equals(letter))
                {
                    i++;
                }
            }
        }
        System.out.println("The letter " + "'" + letter + "'" + " occurred " + w + " time/s");
    }
}

