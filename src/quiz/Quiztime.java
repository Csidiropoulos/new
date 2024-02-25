package quiz;

import java.util.Random;
public class Quiztime {
    private String[] Questions = {" How much does 2+7?", " What color is the apple? ",
            " Which Greek island is known for its nightlife? "," Who is the partner of Asterix? "};
    private String secret;
    private String correct_response;
    private String wrong_response;

    public Quiztime() {
        this.secret = "";
        this.correct_response = "";
        this.wrong_response = "";
    }

    public void newGame() {
        Random rnd = new Random();
        this.secret = this.Questions;
        System.out.println(this.secret);
        wrong_responses = "";
        correct_responses = "";
    }

    public String getsecretQuestion() {
        String secret = "";
        String s = "";
        if (this.correct_response.contains(s)) {
            secret += s;
        } else {
            secret += "_";
        }
        secret +=this.secret.charAt(this.secret.length(),0);
        return secret;
    }
    public void play(String guess) {
        if(this.secret.contains(guess)) {
            this.correct_response += guess;
        }
        else {
            this.wrong_response += guess;
        }
    }
    public boolean isnotFound(){
        return this.wrong_response.length() == 6;
    }

    public boolean isFound() {
        if(!this.correct_responses.contains(s)) {
            return false;
        }
        return true;
    }






}
