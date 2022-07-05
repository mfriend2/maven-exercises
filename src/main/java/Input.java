import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something:");
        String userInput = scanner.nextLine();
        System.out.printf("You entered: \"%s\"\n", userInput);
        if (!StringUtils.isNumeric(userInput)) {
            System.out.printf("\"%s\" is not a number.\n",userInput);
        }
        if (StringUtils.isNumeric(userInput)) {
            System.out.printf("\"%s\" is a number.\n",userInput);
        }
        String flippedString = StringUtils.swapCase(userInput);
        System.out.printf("Flipped Case: %s\n", flippedString);
        String reversedString = StringUtils.reverse(userInput);
        System.out.printf("Reversed: %s\n", reversedString);
    }
}
