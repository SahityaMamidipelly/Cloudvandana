import java.util.Scanner;

public class Panagramassignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();
        
        boolean isPangram = checkPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkPangram(String input) {
        boolean[] alphabet = new boolean[26];
        int index;
        
        input = input.toLowerCase();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if ('a' <= c && c <= 'z') {
                index = c - 'a';
                alphabet[index] = true;
            }
        }
        
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }
        
        return true;
    }
}