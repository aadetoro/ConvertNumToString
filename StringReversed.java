
    import java.util.Scanner;

    public class StringReversed {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            //To reverse the word passed
            String reversedWord = reverseString(word);

            // Display the result
            System.out.println("Reversed word: " + reversedWord);

            scanner.close();
        }

        // Method to reverse a string
          public static String reverseString(String input) {
           StringBuilder reversed = new StringBuilder(input);
          return reversed.reverse().toString();
        }
    }


