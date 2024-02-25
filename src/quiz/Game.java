package quiz;

import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        User user;
        Quiz quiz = new Quiz();

        Scanner input = new Scanner(system.in);
        System.out.print("Give your name");
        String name = input.text();
        user = new User(name);

        do{
            quiz.newGame();
            do {
                System.out.println(quiz.setQuestion());
                System.out.print("Guess: ");
                String guess = input.next();
                quiz.play(guess);
                if (quiz.isFound()) {
                    System.out.println(" CONGRATULATIONS :) ");
                    user.found();
                    break;
                } else if (quiz.notFound()) {
                    System.out.println(" OOPS :( ");
                    user.lost();
                    break;
                    
                }
            } while (true);
            System.out.println(" Wanna play again ( Y/N ) ");
            String answer = input.next();
            if (answer.equals("N")) {
                break;
            }
        } while (true);

        System.out.println(user.getFinalScore());

    }
}
