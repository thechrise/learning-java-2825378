import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String question = "What's Chris' favorite candy?";
        String choiceOne = "Snickers";
        String choiceTwo = "Skittles";
        String choiceThree = "Tootsie Rolls";

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("1) " + choiceOne);
        System.out.println("2) " + choiceTwo);
        System.out.println("3) " + choiceThree);

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input
        int input = scanner.nextInt();

        // If the user's input matches the correctAnswer...
        if (input == 2){
            System.out.println("Congrats! That's correct!");
        } else {
            System.out.println("So, sorry. The correct answer was #2 - " + choiceTwo);
        }
        // then the user is correct, and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect, and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
