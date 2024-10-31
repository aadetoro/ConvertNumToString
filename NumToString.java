
    import java.util.Scanner;

    public class NumToString {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
           System.out.print("Enter an integer: ");
            int myNumber = scanner.nextInt();
            String integerAsString = Integer.toString(myNumber);
           System.out.println("Integer as String: " + integerAsString);


            // Convert string back to number
            System.out.print("\nEnter an integer as string: ");
            scanner.nextLine();
            String myStringToInt = scanner.nextLine();
           int parsedInteger = Integer.parseInt(myStringToInt);
            System.out.println("Parsed Integer: " + myStringToInt);



            scanner.close();
        }
    }


