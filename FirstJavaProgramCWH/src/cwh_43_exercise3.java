import java.util.Random;
import java.util.Scanner;

class GuessGame {
    private int randomNumber;
    private int noOfGuesses = 0;

    public GuessGame(){
        randomNumber = getRandomNumber(100);
        this.takeUserInput();
    }

    static int getRandomNumber(int max){
        Random random = new Random();
        return random.nextInt(max + 1);
    }

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your guess number: ");
        int userInput = sc.nextInt();
        this.checkNumber(userInput);
    }

    private void checkNumber(int no){
        noOfGuesses += 1;
        if(no < randomNumber){
            System.out.println("Please enter a large number");
            this.takeUserInput();
        } else if(no > randomNumber) {
            System.out.println("Please enter a small number");
            this.takeUserInput();
        } else if(no == randomNumber) {
            System.out.println("Congratulations!, Your number matched, You have guessed number in " + noOfGuesses + " Guesses");
        }
    }
}
public class cwh_43_exercise3 {
    public static void main(String[] args) {
        /*
        * Create a class Game, which allows a user to play "Guess the Number" game once.
        * Game should have the following methods:
        * 1. Constructor to generate the random number.
        * 2. takeUserInput() to take a user input of the number
        * 3. isCorrectNumber() to detect whether the number entered by the user is true
        * User properties such as noOfGuesses(int) etc.
        * */

        GuessGame game = new GuessGame();
        game.takeUserInput();
//        Random random = new Random();
//        System.out.println(random.nextInt(10));
//        System.out.println(game.randomNumber);
    }
}
